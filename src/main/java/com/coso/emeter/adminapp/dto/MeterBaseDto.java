package com.coso.emeter.adminapp.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MeterBaseDto {

    private Long mbId;
    private String mbName;
    private String mbManuName;
    private String mbModel;
    private String mbModelPrgname;
    private String mbMeternumber;
    private String mbMeterDesc;
    private String createdUser;
    private String updatedUser;

}
