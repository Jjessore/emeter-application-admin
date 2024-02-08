package com.coso.emeter.adminapp.service;

import com.coso.emeter.adminapp.dto.CompanyBranchDto;
import com.coso.emeter.apiapp.entity.CompInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public interface CompanyInfoService {
    List<CompanyBranchDto> getAllCompanyWithBranch();

    Optional<CompInfo> findById(String ciId);

    List<CompInfo> findall();

    void save(CompInfo companyInfo);

    void deleteById(String ciId);
}
