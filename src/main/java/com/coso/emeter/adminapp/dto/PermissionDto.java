package com.coso.emeter.adminapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PermissionDto {

    public Long formid;
    public String formName;
    public Long permissionId;
    public String permName;

    //"Role": "SuperAdmin",
    //      "RoleId": 1,
    //    "MM_Meter_View": true,
    //  "SM_Meter_MeterList_View": true,
    // "SM_Meter_MeterList_Add": true,
    //      "SM_Meter_MeterList_Edit": true,
    //      "SM_Meter_MeterList_Delete": true,
    //      "SM_Meter_MeterCompanyLink_LinkNew": true,
    //      "SM_Meter_MeterCompanyLink_Add": true,
    //      "SM_Meter_MeterCompanyLink_Edit": true,
    //      "SM_Meter_MeterCompanyLink_Delete": true,
    //      "MM_Rasberry_View": true,
    //      "SM_Rasberry_RaspberryList_View": true,
    //      "SM_Rasberry_RaspberryList_Add": true,
    //      "SM_Rasberry_RaspberryList_Edit": true,
    //      "SM_Rasberry_RaspberryList_Delete": true,
    //      "SM_Rasberry_RaspberryCompanyLink_View": true,
    //      "SM_Rasberry_RaspberryCompanyLink_Add": true,
    //      "SM_Rasberry_RaspberryCompanyLink_Edit": true,
    //      "SM_Rasberry_RaspberryCompanyLink_Delete": true,
    //      "MM_Company_View": true,
    //      "SM_Company_CompanyList_View": true,
    //      "SM_Company_CompanyList_Add": true,
    //      "SM_Company_CompanyList_Edit": true,
    //      "SM_Company_CompanyList_Delete": true


}
