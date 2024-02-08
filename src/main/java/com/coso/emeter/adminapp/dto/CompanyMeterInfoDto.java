package com.coso.emeter.adminapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyMeterInfoDto {

    private Long compMeterId;
    private String compName;
    private String raspMacId;
    private String phyMeterId;
    private String pkMeterId;
    private String meterStatus;
    private Date actDate;
    private Date inactDate;
    private String meterName;
    private String meterBlock;
    private String meterDept;
    private String meterDivi;
    private String meterTeam;
    private String connMach;
    private String meterDesc;
    private String mbName;
    private String mbModel;
    private String mbModelProg;
    private Date creatDate;
    private Date lstupdtDate;
    private String creatUser;
    private String updtUser;

}
