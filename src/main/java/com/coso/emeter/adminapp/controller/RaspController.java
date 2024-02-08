package com.coso.emeter.adminapp.controller;

import com.coso.emeter.adminapp.dto.*;
import com.coso.emeter.apiapp.entity.CompRaspInfo;
import com.coso.emeter.apiapp.entity.RaspBase;
import com.coso.emeter.adminapp.service.CompanyInfoService;
import com.coso.emeter.adminapp.service.CompanyRaspInfoService;
import com.coso.emeter.adminapp.service.RaspBaseService;
import com.coso.emeter.adminapp.utilobjects.Message;
import com.coso.emeter.adminapp.utilobjects.UserSingleton;
import com.coso.emeter.adminapp.dto.*;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class RaspController {

            @Value("${status}")
            private List<String> statusList = new ArrayList<>();
            @Autowired
            RaspBaseService raspBaseService;
            @Autowired
            CompanyRaspInfoService companyRaspInfoService;
            @Autowired
            CompanyInfoService companyInfoService;

            @GetMapping({"/showrasp"})
            public ModelAndView showRasp(HttpSession session){
                    session.setAttribute("message",null);
                    ModelAndView mav = new ModelAndView("raspBaseList");
                    //List<RaspBase> rasplist = raspBaseRepository.findAll();
                    List<RaspBase> rasplist = raspBaseService.findall();
                    mav.addObject("rasp", rasplist);
                    return mav;
            }

            @GetMapping("/addRaspForm")
            public ModelAndView addRaspForm() {
                ModelAndView mav = new ModelAndView("add-rasp-form");
                RaspBase newRaspBase = new RaspBase();
                mav.addObject("rasp", newRaspBase);
                mav.addObject("status", statusList);
                return mav;
            }

            @PostMapping("/saveRasp")
            public String saveRasp(@ModelAttribute RaspBase raspBase, HttpSession session) {
                try {
                        raspBaseService.save(raspBase);
                        session.setAttribute("message", new Message("Raspberry information saved successfully","success"));
                    }
                catch (Exception e) {
                        session.setAttribute("message", new Message("Raspberry information not saved !!! Input error","danger"));
                }
                return "redirect:/addRaspForm";
            }

            @GetMapping("/showRaspUpdateForm")
            public ModelAndView showRaspUpdateForm(@RequestParam Long rbId) {
                    Optional<RaspBase> raspBase;
                    ModelAndView mav = new ModelAndView("update-rasp-form");
                    raspBase = raspBaseService.findById(rbId);
                    mav.addObject("rasp", raspBase);
                    mav.addObject("status", statusList);
                    return mav;
            }

            @PostMapping("/updateRasp")
            public String updateRasp(@ModelAttribute RaspBase raspBase, HttpSession session) {
                try {
                        raspBase.setUpdatedUser(UserSingleton.getInstance().getUsername());
                        raspBaseService.updateRaspBase(raspBase.getRbId(),raspBase.getRbMacid(),raspBase.getRbManuName(),
                                                        raspBase.getRbModel(),raspBase.getRbConnectionStrut(),raspBase.getRbOSVer(),
                                                        raspBase.getRbDesc(),raspBase.getRbActiveStatus(),raspBase.getUpdatedUser());
                        session.setAttribute("message", new Message("Raspberry information saved successfully","success"));
                    }
                catch (Exception e) {
                        session.setAttribute("message", new Message("Raspberry information not saved !!! Input error","danger"));
                }
                return "redirect:/showrasp";
            }

            @GetMapping("/deleteRasp")
            public String deleteRasp(@RequestParam Long rbId) {
                    raspBaseService.deleteById(rbId);
                    return "redirect:/showrasp";
            }

            @GetMapping("/showraspcomplink")
            public ModelAndView showRaspCompLink(HttpSession session){
                session.setAttribute("message",null);
                ModelAndView mav = new ModelAndView("rasp-company-link");
                List<CompRaspInfoDto> compRaspInfoDtoList = new ArrayList<>();
                List<CompRaspInfoProjection> compRaspInfoProjectionList = companyRaspInfoService.findRaspWithCompany();
                for (CompRaspInfoProjection clist: compRaspInfoProjectionList) {
                            CompRaspInfoDto compRaspInfoDto = new CompRaspInfoDto(clist.getraspId(),
                            clist.getraspMacId(),clist.getraspModel(),clist.getraspConnStruct(),
                            clist.getraspOsVer(),clist.getraspDesc(),clist.getraspStatus(),
                            clist.getraspManfName(),clist.getcmpId(),clist.getcmpName(),clist.getcmpBranch(),
                            clist.getcmpraspId());
                            compRaspInfoDtoList.add(compRaspInfoDto);
                }
                mav.addObject("comprasp", compRaspInfoDtoList);
                return mav;
            }

            @GetMapping("/showRaspCompLinkForm")
            public ModelAndView showRaspCompLinkForm(@RequestParam Long rbId) {

                ModelAndView mav = new ModelAndView("rasp-company-update");
                try {
                        String compid;
                        Long crid;
                        CompRaspInfoProjection compRaspInfoProjection;
                        List<CompanyBranchDto> companyBranchDto;
                        CompanyRaspDto companyRaspDto = new CompanyRaspDto();
                        compRaspInfoProjection = companyRaspInfoService.findRaspWithCompanyById(rbId);

                        if (compRaspInfoProjection.getcmpId() == null) {
                                compid = "0";
                        }
                        else {
                                compid = compRaspInfoProjection.getcmpId();
                        }

                        if (compRaspInfoProjection.getcmpraspId() == null){
                                crid = Long.valueOf(0);
                        }
                    else {
                                crid = compRaspInfoProjection.getcmpraspId();
                        }

                        companyRaspDto.setCompid(compid);
                        companyRaspDto.setRaspmacid(compRaspInfoProjection.getraspMacId());
                        companyRaspDto.setRaspstatus(compRaspInfoProjection.getraspStatus());
                        companyRaspDto.setCrid(crid);

                        companyBranchDto = companyInfoService.getAllCompanyWithBranch();

                        mav.addObject("comprasp",companyRaspDto);
                        mav.addObject("compbranch",companyBranchDto);
                }
                catch (Exception e){
                        System.out.println("Error module comparasplink form");
                }
                return mav;
            }


            @PostMapping("/saveCompRaspLink")
            public String saveCompRaspLink(@ModelAttribute CompanyRaspDto compRaspDto, HttpSession session) {
                try {
                        if (compRaspDto.getCrid() == 0) {
                            CompRaspInfo companyRaspInfo = new CompRaspInfo();
                            companyRaspInfo.setCrRaspMacID(compRaspDto.getRaspmacid());
                            companyRaspInfo.setCrRaspStatus(compRaspDto.getRaspstatus());
                            companyRaspInfo.setCiId(compRaspDto.getCompid());
                            companyRaspInfoService.save(companyRaspInfo);
                        }
                        else{
                            companyRaspInfoService.UpdateRaspCompany(compRaspDto.getCrid(),compRaspDto.getCompid());
                        }
                            session.setAttribute("message", new Message("Company Raspberry Link saved successfully","success"));
                        }
                catch (Exception e) {
                        session.setAttribute("message", new Message("Company Raspberry Link  information not saved !!! Input error","danger"));
                        System.out.println("Exception is : " + e);
                }
                return "redirect:/showraspcomplink";
            }

            @GetMapping("/raspreportcompany")
            public ModelAndView generateRaspReport(){
                System.out.println("Inside Raspreport");
                ModelAndView mav = new ModelAndView("raspReport-companywise");

                List<String> cmpList = companyRaspInfoService.findRaspCompCount().stream().map(x->x.getCompany()).collect(Collectors.toList());
                List<Integer> countList = new ArrayList<>();
                for (CompanyRaspReportProjection x : companyRaspInfoService.findRaspCompCount()) {
                    Integer raspNo = Integer.valueOf(x.getRaspNo());
                    countList.add(raspNo);
                }

                mav.addObject("company",cmpList);
                mav.addObject("raspno",countList);
                return mav;
            }


            @GetMapping("/raspreportbranch")
            public ModelAndView generateRaspReportBranch(){
            ModelAndView mav = new ModelAndView("raspReport-branchwise");

            //List<String> cmpList = companyRaspInfoService.findRaspCompCount().stream().map(x->x.getCompany()).collect(Collectors.toList());
            List<String> cmpList = companyRaspInfoService.findRaspBranchCount().stream().map(x->x.getCompany()).collect(Collectors.toList());

            List<Integer> countList = new ArrayList<>();
            for (CompanyRaspReportProjection x : companyRaspInfoService.findRaspBranchCount()) {
               Integer raspNo = Integer.valueOf(x.getRaspNo());
                countList.add(raspNo);
            }

            mav.addObject("company",cmpList);
            mav.addObject("raspno",countList);
            return mav;
    }


}
