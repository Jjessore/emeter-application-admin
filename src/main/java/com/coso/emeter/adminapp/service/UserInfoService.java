package com.coso.emeter.adminapp.service;

import com.coso.emeter.apiapp.entity.UserInfo;
import com.coso.emeter.apiapp.entity.UserInfoOld;
import org.springframework.stereotype.Service;


@Service
public interface UserInfoService {

    Long validateLogin(Long uid,String pwd);

    UserInfo findUserByUserId(Long uname);
}
