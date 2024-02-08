package com.coso.emeter.adminapp.utilobjects;

import com.coso.emeter.adminapp.utilobjects.Permission;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public class UserSingleton {

    private Long userId;
    private String username;
    private String userrole;
    private String cmpid;
    private String cmpname;
    private String cmpbranch;

    private ArrayList<Permission> permList = new ArrayList<Permission>();

    private static UserSingleton userSingleton = null;

    private UserSingleton(Long userid, String username, String userrole, String cmpid, String cmpname, String cmpbranch,ArrayList<Permission> permissionList ){
        this.userId = userid;
        this.username = username;
        this.userrole = userrole;
        this.cmpid = cmpid;
        this.cmpname = cmpname;
        this.cmpbranch = cmpbranch;
        this.permList = permissionList;
    }



    public static UserSingleton getInstance(Long userid, String username, String userrole, String cmpid, String cmpname, String cmpbranch, ArrayList<Permission> permissionList){
        if (userSingleton == null){
            userSingleton = new UserSingleton(userid, username, userrole, cmpid, cmpname, cmpbranch, permissionList);
            return userSingleton;
        }
        else {
            return userSingleton;
        }
    }

    public static UserSingleton getInstance(){
        return userSingleton;
    }
    public static void clearInstance(){
        userSingleton = null;
    }



}
