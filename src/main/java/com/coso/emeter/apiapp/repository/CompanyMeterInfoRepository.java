package com.coso.emeter.apiapp.repository;

import com.coso.emeter.adminapp.dto.CompanyMeterInfoProjection;
import com.coso.emeter.apiapp.entity.CompMeterInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CompanyMeterInfoRepository extends JpaRepository<CompMeterInfo, Long> {

    @Query(value = "select cm_id as compmeterId, c2.ci_name as compName, cm_cur_rasp_macid as raspMacId, cm_phy_meter_id as phyMeterId, " +
                   "       cm_pk_meter_id as pkMeterId, cm_meter_status as meterStatus,cm_active_date as actDate, cm_inactive_date as inactDate, " +
                   "       cm_meter_name as meterName, cm_meter_block as meterBlock, cm_meter_dept as meterDept, cm_meter_divi as meterDivi, " +
                   "       cm_meter_team as meterTeam, cm_meter_connmachine as connMach,cm_meter_desc as meterDesc, mb_name as mbName, mb_model as mbModel, " +
                   "       mb_model_prgname as mbModelProg, c.created_date as creatDate, c.last_updated_date as lstupdtDate, c.created_user as creatUser," +
                   "       c.updated_user as updtUser " +
                   "from elecmet.compmeterinfo c, elecmet.compinfo c2 " +
                   "where c.ci_id = ?1 " +
                   "and c.ci_id = c2.ci_id", nativeQuery = true)
    List<CompanyMeterInfoProjection> findAllCompMeter(String cmpid);


    @Query("Select c from CompMeterInfo c where c.cmId = ?1")
    CompMeterInfo findCompMeterInfoById(Long cmid);
}
