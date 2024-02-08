package com.coso.emeter.apiapp.repository;

import com.coso.emeter.apiapp.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

    @Query("Select u from UserInfo u where u.uiName = ?1 and u.uiStatus = 1 ")
    UserInfo findByUserName(String uname);

    @Query("Select u from UserInfo u where u.uiId = ?1 and u.uiStatus = 1")
    UserInfo findUserByUserId(Long userid);
}
