package com.coso.emeter.apiapp.repository;

import com.coso.emeter.apiapp.entity.RaspBase;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RaspBaseRepository extends JpaRepository<RaspBase, Long> {

    @Modifying
    @Transactional
    @Query(value = "Update elecmet.raspbase set rb_macid = ?2, rb_manu_name = ?3, rb_model = ?4, rb_connection_strut = ?5, " +
            "rb_os_ver = ?6, rb_desc = ?7, rb_active_status = ?8, updated_user = ?9, last_updated_date = now() " +
            "Where rb_id = ?1", nativeQuery = true)
    void updateRaspBase(Long rb_id, String rb_macid, String rb_manufacturer_name, String rb_model, String rb_connection_strut, String rb_os_version, String rb_description, String rb_active_status, String rb_updated_user);
}
