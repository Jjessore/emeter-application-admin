package com.coso.emeter.adminapp.controller;

import com.coso.emeter.adminapp.dto.CompanyMeterInfoDto;
import com.coso.emeter.adminapp.dto.MeterBaseDto;
import com.coso.emeter.adminapp.service.CompanyRaspInfoService;
import com.coso.emeter.adminapp.service.MeterBaseService;
import com.coso.emeter.adminapp.utilobjects.Message;
import com.coso.emeter.adminapp.dto.CompanyMeterInfoProjection;
import com.coso.emeter.adminapp.utilobjects.Permission;
import com.coso.emeter.apiapp.entity.CompMeterInfo;
import com.coso.emeter.apiapp.entity.CompRaspInfo;
import com.coso.emeter.apiapp.entity.MeterBase;
import com.coso.emeter.adminapp.service.CompanyMeterInfoService;
import com.coso.emeter.adminapp.utilobjects.UserSingleton;
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


@Controller
public class meterController {

        @Value("${status}")
        private List<String> statusList = new ArrayList<>();

        @Autowired
        MeterBaseService meterBaseService;

        @Autowired
        CompanyMeterInfoService companyMeterInfoService;

        @Autowired
        CompanyRaspInfoService companyRaspInfoService;

        @GetMapping({"/showmeters"})
        public ModelAndView showMeters(HttpSession session){

                 session.setAttribute("message", null);
                 ModelAndView mav = new ModelAndView("meterBaseList");
                 //List<MeterBase> meterlist = meterBaseRepository.findAll();
                 List<MeterBase> meterlist = meterBaseService.findall();
                 mav.addObject("meter", meterlist);
                 return mav;

        }

        @GetMapping("/addMeterForm")
        public ModelAndView addMeterForm() {
                ModelAndView mav = new ModelAndView("add-meter-form");
                MeterBase newMeterBase = new MeterBase();
                mav.addObject("meter", newMeterBase);
                mav.addObject("status", statusList);
                return mav;
        }

        @PostMapping("/saveMeter")
        public String saveMeter(@ModelAttribute MeterBase meterBase, HttpSession session) {
                System.out.println("Meterbase object : " + meterBase);
                try {
                        if (meterBase.getMbId() == null) {
                                meterBase.setCreatedUser(UserSingleton.getInstance().getUsername());
                                meterBaseService.save(meterBase);
                        }
                        session.setAttribute("message", new Message("Meter information saved successfully","success"));
                }
                catch (Exception e) {
                        System.out.println("Thrown exception is : " + e);
                        session.setAttribute("message", new Message("Meter information not saved !!! Input error","danger"));
                }
                return "redirect:/addMeterForm";
        }

        @PostMapping("/updateMeter")
        public String updateMeter(@ModelAttribute MeterBaseDto meterBaseDto, HttpSession session) {
                System.out.println("MeterbaseDTO : " + meterBaseDto);
                try {
                        //meterBaseDto.setMb_updated_user(UserSingleton.getInstance().getUsername());
                        //meterBaseService.UpdateMeterBase(meterBaseDto.getMeter_base_id(),meterBaseDto.getMb_meter_name(),
                        //                                 meterBaseDto.getMb_manufacturer_name(),meterBaseDto.getMb_model(),
                        //                                 meterBaseDto.getMb_model_program_name(),meterBaseDto.getMb_updated_user(),
                        //                                 meterBaseDto.getMb_meternumber(),meterBaseDto.getMb_meter_description());
                        meterBaseDto.setUpdatedUser(UserSingleton.getInstance().getUsername());
                        meterBaseService.UpdateMeterBase(meterBaseDto.getMbId(),meterBaseDto.getMbName(),
                                meterBaseDto.getMbManuName(),meterBaseDto.getMbModel(),
                                meterBaseDto.getMbModelPrgname(),meterBaseDto.getUpdatedUser(),
                                meterBaseDto.getMbMeternumber(),meterBaseDto.getMbMeterDesc());
                        session.setAttribute("message", new Message("Meter information updated successfully","success"));
                        }
                catch (Exception e) {
                        System.out.println("Thrown exception is : " + e);
                        session.setAttribute("message", new Message("Meter information not saved !!! Input error","danger"));
                }
                return "redirect:/showmeters";
        }

        @GetMapping("/showMeterUpdateForm")
        public ModelAndView showMeterUpdateForm(@RequestParam Long mbId) {
                Optional<MeterBase> meterBase;
                ModelAndView mav = new ModelAndView("update-meter-form");
                meterBase = meterBaseService.findById(mbId);
                mav.addObject("meter", meterBase);
                mav.addObject("status", statusList);
                return mav;
        }

        @GetMapping("/deleteMeter")
        public String deleteMeter(@RequestParam Long mbId) {
                meterBaseService.deleteById(mbId);
                return "redirect:/showmeters";
        }

        @GetMapping("/showcompmeter")
        public ModelAndView compmeteradd(HttpSession session){
                session.setAttribute("message",null);
                ModelAndView mav = new ModelAndView("comp-meter-form");
                return mav;
        }

        @GetMapping("/showcompmeterlink")
        public ModelAndView compmeterlist(HttpSession session){
                session.setAttribute("message",null);
                List<CompanyMeterInfoDto> companyMeterInfoDtoList = new ArrayList<>();
                ModelAndView mav = new ModelAndView("company-meter-form");
                List<CompanyMeterInfoProjection> companyMeterProj = companyMeterInfoService.findAllCompMeter(UserSingleton.getInstance().getCmpid());
                for (CompanyMeterInfoProjection compmeterlist: companyMeterProj) {
                        CompanyMeterInfoDto companyMeterInfoDto = new CompanyMeterInfoDto(compmeterlist.getcompMeterId(),compmeterlist.getcompName(),
                                compmeterlist.getraspMacId(),compmeterlist.getphyMeterId(), compmeterlist.getpkMeterId(),
                                compmeterlist.getmeterStatus(),compmeterlist.getactDate(),compmeterlist.getinactDate(),
                                compmeterlist.getmeterName(),compmeterlist.getmeterBlock(),compmeterlist.getmeterDept(),
                                compmeterlist.getmeterDivi(),compmeterlist.getmeterTeam(),compmeterlist.getconnMach(),
                                compmeterlist.getmeterDesc(),compmeterlist.getmbName(),compmeterlist.getmbModel(),
                                compmeterlist.getmbModelProg(),compmeterlist.getcreatDate(),compmeterlist.getlstupdtDate(),
                                compmeterlist.getcreatUser(),compmeterlist.getupdtUser());
                        companyMeterInfoDtoList.add(companyMeterInfoDto);
                }
                mav.addObject("companymeter",companyMeterInfoDtoList);
                return mav;
        }

        @GetMapping("/showCompMeterLinkForm")
        public ModelAndView compMeterLink(HttpSession session){
                session.setAttribute("message",null);
                CompMeterInfo companyMeterInfo = new CompMeterInfo();
                List<CompRaspInfo> companyRaspInfos = companyRaspInfoService.findRaspIdByCompId(UserSingleton.getInstance().getCmpid());
                List<MeterBase> meterBaseList = meterBaseService.findall();
                ModelAndView mav = new ModelAndView("meter-company-link-form");
                mav.addObject("compmeter",companyMeterInfo);
                mav.addObject("comprasp",companyRaspInfos);
                mav.addObject("mbase", meterBaseList);
                mav.addObject("compid",UserSingleton.getInstance().getCmpid());
                return mav;
        }

        @PostMapping("/saveCompMeterLink")
        public String saveCompMeterLink(@ModelAttribute CompMeterInfo companyMeterInfo, HttpSession session) {
                try {
                        if (companyMeterInfo.getCmId() == null) {
                                companyMeterInfo.setCreatedUser(UserSingleton.getInstance().getUsername());
                                companyMeterInfo.setCiId(UserSingleton.getInstance().getCmpid());
                        }
                        else{
                                companyMeterInfo.setUpdatedUser(UserSingleton.getInstance().getUsername());
                                companyMeterInfo.setCiId(UserSingleton.getInstance().getCmpid());
                        }
                        System.out.println("Company Meter Info : " + companyMeterInfo);
                        System.out.println("Company ID : " + UserSingleton.getInstance().getCmpid());
                        companyMeterInfoService.save(companyMeterInfo);

                        session.setAttribute("message", new Message("Company Meter Link saved successfully","success"));
                }
                catch (Exception e) {
                        session.setAttribute("message", new Message("Company Meter Link  information not saved !!! Input error","danger"));
                        System.out.println("Exception is : " + e);
                }
                return "redirect:/showcompmeterlink";
        }

        @GetMapping("/showCompMeterUpdateForm")
        public ModelAndView showCompMeterUpdateForm(@RequestParam Long cmid) {
                CompMeterInfo companyMeterInfo;
                System.out.println("Inside showCompMeterUpdateForm ");
                ModelAndView mav = new ModelAndView("meter-company-link-form");
                companyMeterInfo = companyMeterInfoService.findCompMeterInfoById(cmid);
                System.out.println("Company Meter Info cmid : " + companyMeterInfo.getCmId());
                List<CompRaspInfo> companyRaspInfos = companyRaspInfoService.findRaspIdByCompId(UserSingleton.getInstance().getCmpid());
                List<MeterBase> meterBaseList = meterBaseService.findall();
                mav.addObject("compmeter",companyMeterInfo);
                mav.addObject("comprasp",companyRaspInfos);
                mav.addObject("mbase", meterBaseList);
                mav.addObject("compid",UserSingleton.getInstance().getCmpid());
                return mav;
        }

}
