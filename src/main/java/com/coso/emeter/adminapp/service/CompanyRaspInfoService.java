package com.coso.emeter.adminapp.service;

import com.coso.emeter.adminapp.dto.CompRaspInfoProjection;
import com.coso.emeter.adminapp.dto.CompanyRaspReportProjection;
import com.coso.emeter.apiapp.entity.CompRaspInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CompanyRaspInfoService {
    void save(CompRaspInfo companyRaspInfo);

    List<CompRaspInfoProjection> findRaspWithCompany();

    CompRaspInfoProjection findRaspWithCompanyById(Long rbId);

    Optional<CompRaspInfo> findById(Long crid);

    List<CompRaspInfo> findRaspIdByCompId(String compid);

    void UpdateRaspCompany(Long crid, String compid);

    List<CompanyRaspReportProjection> findRaspCompCount();
    List<CompanyRaspReportProjection> findRaspBranchCount();

}
