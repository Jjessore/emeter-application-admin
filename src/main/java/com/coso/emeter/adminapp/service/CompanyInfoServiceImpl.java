package com.coso.emeter.adminapp.service;


import com.coso.emeter.adminapp.dto.CompanyBranchDto;
import com.coso.emeter.apiapp.entity.CompInfo;
import com.coso.emeter.apiapp.repository.CompanyInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class CompanyInfoServiceImpl implements CompanyInfoService {

    @Autowired
    CompanyInfoRepository companyInfoRepository;

    @Override
    public List<CompanyBranchDto> getAllCompanyWithBranch() {
        List<CompanyBranchDto> companyBranchDtoList = new ArrayList<CompanyBranchDto>();
        List<CompInfo> companyInfoList = companyInfoRepository.findAll();
        for (CompInfo cinfo : companyInfoList) {
            CompanyBranchDto companyBranchDto = new CompanyBranchDto();
            companyBranchDto.setCbname(cinfo.getCiName() + " - " + cinfo.getCiBranch());
            companyBranchDto.setCbid(cinfo.getCiId());
            companyBranchDto.setCbparentid(cinfo.getCiParentId());
            companyBranchDtoList.add(companyBranchDto);
        }
        return companyBranchDtoList;
    }

    @Override
    public Optional<CompInfo> findById(String ciId) {
        return companyInfoRepository.findById(ciId);
    }

    @Override
    public List<CompInfo> findall() {
        return companyInfoRepository.findAll();
    }

    @Override
    public void save(CompInfo companyInfo) {
        companyInfoRepository.save(companyInfo);
    }

    @Override
    public void deleteById(String ciId) {
        companyInfoRepository.deleteById(ciId);
    }
}
