package com.coso.emeter.adminapp.service;

import com.coso.emeter.apiapp.entity.MeterBase;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MeterBaseService {
    public List<MeterBase> findall();

    void save(MeterBase meterBase);

    Optional<MeterBase> findById(Long mbId);

    void deleteById(Long mbId);

    void UpdateMeterBase(Long meter_base_id, String mb_meter_name, String mb_manufacturer_name, String mb_model, String mb_model_program_name, String mb_updated_user ,String mb_meternumber, String mb_meter_description);
}
