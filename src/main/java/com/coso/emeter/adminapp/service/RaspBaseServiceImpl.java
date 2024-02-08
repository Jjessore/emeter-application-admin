package com.coso.emeter.adminapp.service;


import com.coso.emeter.apiapp.entity.RaspBase;
import com.coso.emeter.apiapp.repository.RaspBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RaspBaseServiceImpl implements RaspBaseService {

    @Autowired
    RaspBaseRepository raspBaseRepository;

    @Override
    public List<RaspBase> findall() {
        return raspBaseRepository.findAll();
    }

    @Override
    public void save(RaspBase raspBase) {

        System.out.println("Rasp object " + raspBase);
        raspBaseRepository.save(raspBase);
    }

    @Override
    public Optional<RaspBase> findById(Long rbId) {
        return raspBaseRepository.findById(rbId);
    }

    @Override
    public void updateRaspBase(Long rbId, String rbMacid, String rbManuName, String rbModel, String rbConnectionStrut, String rbOSVer, String rbDesc, String rbActiveStatus, String updatedUser) {
        raspBaseRepository.updateRaspBase(rbId, rbMacid, rbManuName, rbModel, rbConnectionStrut, rbOSVer, rbDesc, rbActiveStatus, updatedUser);
    }

    @Override
    public void deleteById(Long rbId) {
        raspBaseRepository.deleteById(rbId);
    }
}
