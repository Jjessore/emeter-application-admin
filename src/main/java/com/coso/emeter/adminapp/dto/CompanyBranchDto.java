package com.coso.emeter.adminapp.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyBranchDto {

    private String cbname;
    private String cbid;
    private String cbparentid;

}
