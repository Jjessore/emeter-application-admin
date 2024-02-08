package com.coso.emeter.adminapp.service;

import com.coso.emeter.apiapp.entity.RaspBase;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RaspBaseService {
    List<RaspBase> findall();

    void save(RaspBase raspBase);


    void deleteById(Long rbId);

    Optional<RaspBase> findById(Long rbId);

    void updateRaspBase(Long rb_id, String rbMacid, String rbManuName, String rbModel, String rbConnectionStrut, String rbOSVer, String rbDesc, String rbActiveStatus, String updatedUser);
}
