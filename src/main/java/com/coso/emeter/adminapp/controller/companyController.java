package com.coso.emeter.adminapp.controller;

import com.coso.emeter.adminapp.service.CompanyInfoService;
import com.coso.emeter.adminapp.utilobjects.Message;
import com.coso.emeter.apiapp.entity.CompInfo;
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
public class companyController {

        @Value("${status}")
        private List<String> statusList = new ArrayList<>();

        @Autowired
        CompanyInfoService companyInfoService;


        @GetMapping({"/showcompany"})
        public ModelAndView showCompany(HttpSession session){
                session.setAttribute("message",null);
                ModelAndView mav = new ModelAndView("companyInfoList");
                //List<CompanyInfo> companylist = companyInfoRepository.findAll();
                List<CompInfo> companylist = companyInfoService.findall();
                mav.addObject("company", companylist);
                return mav;
        }


        @GetMapping("/addCompanyForm")
        public ModelAndView addCompanyForm() {
                ModelAndView mav = new ModelAndView("add-company-form");
                CompInfo newcompanyInfo = new CompInfo();
                mav.addObject("company", newcompanyInfo);
                return mav;
        }

        @PostMapping("/saveCompany")
        public String saveCompany(@ModelAttribute CompInfo companyInfo, HttpSession session) {

                try {
                        companyInfoService.save(companyInfo);
                        session.setAttribute("message", new Message("Company information saved successfully","success"));
                }
                catch (Exception e) {
                        session.setAttribute("message", new Message("Company information not saved !!! Input error","danger"));
                }
                return "redirect:/addCompanyForm";
        }


        @GetMapping("/showCompanyUpdateForm")
        public ModelAndView showCompanyUpdateForm(@RequestParam String ciId) {
                Optional<CompInfo> companyInfo;
                ModelAndView mav = new ModelAndView("add-company-form");
                companyInfo = companyInfoService.findById(ciId);
                mav.addObject("company", companyInfo);
                return mav;
        }

        @GetMapping("/deleteCompany")
        public String deleteCompany(@RequestParam String ciId) {
                companyInfoService.deleteById(ciId);
                return "redirect:/showcompany";
        }

}
