package com.coso.emeter.adminapp.dto;

import org.springframework.data.jpa.repository.Query;

import java.util.Date;

public interface CompanyMeterInfoProjection {

    Long getcompMeterId();
    String getcompName();
    String getraspMacId();
    String getphyMeterId();
    String getpkMeterId();
    String getmeterStatus();
    Date getactDate();
    Date getinactDate();
    String getmeterName();
    String getmeterBlock();
    String getmeterDept();
    String getmeterDivi();
    String getmeterTeam();
    String getconnMach();
    String getmeterDesc();
    String getmbName();
    String getmbModel();
    String getmbModelProg();
    Date getcreatDate();
    Date getlstupdtDate();
    String getcreatUser();
    String getupdtUser();

}
