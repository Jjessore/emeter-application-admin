package com.coso.emeter.adminapp.service;

import com.coso.emeter.adminapp.dto.CompRaspInfoProjection;
import com.coso.emeter.adminapp.dto.CompanyRaspReportProjection;
import com.coso.emeter.apiapp.repository.CompanyRaspInfoRepository;
import com.coso.emeter.apiapp.entity.CompRaspInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CompanyRaspInfoServiceImpl implements CompanyRaspInfoService{

    @Autowired
    CompanyRaspInfoRepository companyRaspInfoRepository;

    @Override
    public void save(CompRaspInfo compRaspInfo) {
            companyRaspInfoRepository.save(compRaspInfo);
    }
    @Override
    public List<CompRaspInfoProjection> findRaspWithCompany() {
        return companyRaspInfoRepository.findRaspWithCompany();
    }

    @Override
    public CompRaspInfoProjection findRaspWithCompanyById(Long rbId) {
        return companyRaspInfoRepository.findRaspWithCompanyById(rbId);
    }

    @Override
    public Optional<CompRaspInfo> findById(Long crid) {
        return companyRaspInfoRepository.findById(crid);
    }

    @Override
    public List<CompRaspInfo> findRaspIdByCompId(String compid) {
        return companyRaspInfoRepository.findRaspIdByCompId(compid);
    }

    @Override
    public void UpdateRaspCompany(Long crid, String compid) {
        companyRaspInfoRepository.UpdateRaspCompany(crid, compid);
    }

    @Override
    public List<CompanyRaspReportProjection> findRaspCompCount() {
        return companyRaspInfoRepository.findRaspCompCount();
    }

    @Override
    public List<CompanyRaspReportProjection> findRaspBranchCount() {
        return companyRaspInfoRepository.findRaspBranchCount();
    }

}
