package com.coso.emeter.apiapp.repository;

import com.coso.emeter.apiapp.entity.MeterBase;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MeterBaseRepository extends JpaRepository<MeterBase, Long> {
    @Modifying
    @Transactional
    @Query(value= "update elecmet.meterbase m set mb_name = :mbname, mb_manu_name = :mbmanufacname, " +
                  "mb_model = :mbmodel , mb_model_prgname = :mbmodelprogram, " +
                  "mb_meternumber = :mbmeternumber, mb_meter_desc = :mbdesc, " +
                  "updated_user = :mbupdateduser, last_updated_date = now()  " +
                  "where mb_id = :mbid ",nativeQuery = true)
    public void UpdateMeterBase(Long mbid, String mbname,String mbmanufacname, String mbmodel, String mbmodelprogram, String mbupdateduser, String mbmeternumber, String mbdesc);

}
