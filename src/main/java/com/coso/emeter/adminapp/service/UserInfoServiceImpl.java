package com.coso.emeter.adminapp.service;


import com.coso.emeter.apiapp.entity.UserInfo;
import com.coso.emeter.apiapp.entity.UserInfoOld;
import com.coso.emeter.apiapp.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoRepository userInfoRepository;

    @Override
    public Long validateLogin(Long uid, String pwd) {

        UserInfo userInfo = new UserInfo();
        userInfo = userInfoRepository.findUserByUserId(uid);

        if (userInfo.getUiPassword().equalsIgnoreCase(pwd)){
            return userInfo.getUiId();
        }
        else {
                return Long.valueOf(0);
        }
    }

    @Override
    public UserInfo findUserByUserId(Long userid) {

        return userInfoRepository.findUserByUserId(userid);
    }
}
