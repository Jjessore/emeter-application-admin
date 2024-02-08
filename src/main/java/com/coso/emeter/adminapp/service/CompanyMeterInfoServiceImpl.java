package com.coso.emeter.adminapp.service;

import com.coso.emeter.adminapp.dto.CompanyMeterInfoProjection;
import com.coso.emeter.apiapp.entity.CompMeterInfo;
import com.coso.emeter.apiapp.repository.CompanyMeterInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CompanyMeterInfoServiceImpl implements CompanyMeterInfoService {

    @Autowired
    CompanyMeterInfoRepository companyMeterInfoRepository;

    @Override
    public List<CompanyMeterInfoProjection> findAllCompMeter(String compid) {
        return companyMeterInfoRepository.findAllCompMeter(compid);
    }

    @Override
    public void save(CompMeterInfo companyMeterInfo) {
        companyMeterInfoRepository.save(companyMeterInfo);
    }

    @Override
    public CompMeterInfo findCompMeterInfoById(Long cmid) {
        return companyMeterInfoRepository.findCompMeterInfoById(cmid);
    }

}
