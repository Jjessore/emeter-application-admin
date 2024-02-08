package com.coso.emeter.adminapp.service;

import com.coso.emeter.adminapp.dto.CompanyMeterInfoProjection;
import com.coso.emeter.apiapp.entity.CompMeterInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompanyMeterInfoService {
    List<CompanyMeterInfoProjection> findAllCompMeter(String compid);

    void save(CompMeterInfo companyMeterInfo);

    CompMeterInfo findCompMeterInfoById(Long cmid);
}
