package com.coso.emeter.adminapp.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.coso.emeter.adminapp.service.UserInfoService;
import com.coso.emeter.adminapp.utilobjects.Message;
import com.coso.emeter.adminapp.dto.LoginDto;
import com.coso.emeter.adminapp.utilobjects.Permission;
import com.coso.emeter.adminapp.utilobjects.UserSingleton;
import com.coso.emeter.apiapp.entity.UserInfo;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class loginController {

        @Autowired
        UserInfoService userInfoService;
        @Autowired

        @GetMapping("/validatelogin")
        public String loginValidation(@ModelAttribute LoginDto loginDto, HttpSession session){

        boolean loginflag = false;
        ArrayList<Permission> permlist = new ArrayList<Permission>();

                try {
                        Long userid = userInfoService.validateLogin(loginDto.getUser_id(), loginDto.getPassword());
                        if (userid == Long.valueOf(0) ){
                                session.setAttribute("message", new Message("Invalid credentials!!! Please try again","danger"));
                                loginflag = false;
                        }
                        else {

                                UserInfo userInfo = userInfoService.findUserByUserId(userid);

                                File resource = new ClassPathResource("Permission.json").getFile();

                                try {
                                        String permContents = new String(Files.readAllBytes(resource.toPath()));
                                        JSONObject jsonObject = new JSONObject(permContents);
                                        JSONArray perm = jsonObject.getJSONArray("Permissions");

                                        for(int i=0; i<perm.length();i++){
                                                JSONObject roleperm = (JSONObject) perm.get(i);
                                                if (userInfo.getUiRole().equalsIgnoreCase(roleperm.getString("Role"))){
                                                        Iterator<String> keysItr = roleperm.keys();
                                                        while(keysItr.hasNext()) {
                                                                String key = keysItr.next();
                                                                if (key.equalsIgnoreCase("Role") || key.equalsIgnoreCase("RoleId")){

                                                                }
                                                                else {
                                                                        Boolean value = (Boolean) roleperm.get(key);
                                                                        Permission permission = new Permission();
                                                                        permission.setPerm_name(key);
                                                                        permission.setPerm_value(value);
                                                                        permlist.add(permission);
                                                                }
                                                        }
                                                }
                                        }
                                        System.out.println("Permission List : " + permlist);
                                } catch (IOException e) {
                                        throw new RuntimeException(e);
                                }

                                UserSingleton userSingleton = UserSingleton.getInstance(userInfo.getUiId(),userInfo.getUiName(),
                                        userInfo.getUiRole(),userInfo.getCompanyInfo().getCiId(),userInfo.getCompanyInfo().getCiName(),
                                        userInfo.getCompanyInfo().getCiBranch(),permlist);
                                loginflag = true;

                        }
                }
                catch(Exception e) {
                      System.out.println("Thrown exception is : " + e);
                }

                if (loginflag){
                        UserSingleton userSingleton = UserSingleton.getInstance();
                        System.out.println("User sing :" + userSingleton );
                        return "redirect:/home";
                }
                else{
                        return "redirect:/index";
                }

        }


}
