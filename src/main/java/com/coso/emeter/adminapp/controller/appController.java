package com.coso.emeter.adminapp.controller;

import com.coso.emeter.adminapp.dto.LoginDto;
import com.coso.emeter.adminapp.service.MeterBaseService;
import com.coso.emeter.adminapp.service.RaspBaseService;
import com.coso.emeter.adminapp.dto.*;
import com.coso.emeter.apiapp.entity.*;
import com.coso.emeter.adminapp.service.*;
import com.coso.emeter.adminapp.utilobjects.UserSingleton;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
@CrossOrigin("*")
public class appController {

    /*   Start of Dependency  Injection and Declaration  */
        @Autowired
        private MeterBaseService meterBaseService;

        @Autowired
        private RaspBaseService raspBaseService;

        @Value("${status}")
        private List<String> statusList = new ArrayList<>();

    /* End of Dependency Injection */


        //@GetMapping({"/index","/"})

        @GetMapping({"/"})
        public ModelAndView index(HttpSession session){
                session.setAttribute("message",null);
                ModelAndView mav = new ModelAndView("index1");
                LoginDto loginDto = new LoginDto();
                mav.addObject("logindto",loginDto);
                return mav;
        }

        @GetMapping({"/home"})
        public ModelAndView welcome(HttpSession session){

                session.setAttribute("message",null);
                ModelAndView mav = new ModelAndView("home");
                UserSingleton userDetails = UserSingleton.getInstance();
                System.out.println("Userdetails  in home : " + userDetails);
                mav.addObject("user",userDetails);
                return mav;
        }

        @GetMapping("/logout")
        public String logout(){
                UserSingleton.clearInstance();
                return "redirect:/index";
        }


}
