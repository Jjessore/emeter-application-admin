package com.coso.emeter.adminapp.service;

import com.coso.emeter.apiapp.entity.MeterBase;
import com.coso.emeter.apiapp.repository.MeterBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MeterBaseServiceImpl implements  MeterBaseService{

    @Autowired
    MeterBaseRepository meterBaseRepository;
    @Override
    public List<MeterBase> findall() {
        return meterBaseRepository.findAll();
    }
    @Override
    public void save(MeterBase meterBase) {
        meterBaseRepository.save(meterBase);
    }
    @Override
    public Optional<MeterBase> findById(Long mbId) {
        return meterBaseRepository.findById(mbId);
    }
    @Override
    public void deleteById(Long mbId) {
        meterBaseRepository.deleteById(mbId);
    }

    @Override
    public void UpdateMeterBase(Long meter_base_id, String mb_meter_name, String mb_manufacturer_name, String mb_model, String mb_model_program_name, String mb_updated_user ,String mb_meternumber, String mb_meter_description) {
        meterBaseRepository.UpdateMeterBase(meter_base_id, mb_meter_name, mb_manufacturer_name, mb_model, mb_model_program_name, mb_updated_user ,mb_meternumber, mb_meter_description);
    }


}
