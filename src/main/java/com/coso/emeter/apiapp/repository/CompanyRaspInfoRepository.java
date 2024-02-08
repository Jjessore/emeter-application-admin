package com.coso.emeter.apiapp.repository;

import com.coso.emeter.adminapp.dto.CompRaspInfoProjection;
import com.coso.emeter.adminapp.dto.CompanyRaspReportProjection;
import com.coso.emeter.apiapp.entity.CompRaspInfo;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRaspInfoRepository extends JpaRepository<CompRaspInfo,Long> {


        @Query (value="select c.rb_id raspId, c.rb_macid raspMacId, c.rb_model raspModel,c.rb_connection_strut raspConnStruct," +
                      "c.rb_os_ver raspOsVer,c.rb_desc raspDesc,c.rb_active_status raspStatus,c.rb_manu_name raspManfName," +
                      "b.ci_id cmpId, b.ci_name cmpName, b.ci_branch cmpBranch from elecmet.compraspinfo a join elecmet.compinfo b on a.ci_id = b.ci_id " +
                      "right join elecmet.raspbase c on a.cr_rasp_macid = c.rb_macid", nativeQuery = true)
        List<CompRaspInfoProjection> findRaspWithCompany();

        @Query (value="select * from elecmet.vw_compraspinfo where raspId = ?1", nativeQuery = true)
        CompRaspInfoProjection findRaspWithCompanyById(Long rbId);

        @Query("Select c from CompRaspInfo c where c.ciId = ?1 and c.crStatus = 1")
        List<CompRaspInfo> findRaspIdByCompId(String compid);

        @Query(value="select c2.ci_name as Company,count(*) as Raspno from elecmet.compraspinfo c, elecmet.compinfo c2 " +
                "where cr_rasp_status = 'Active' and cr_status = 0 and cr_compinfo_id = c2.ci_id group by c2.ci_name", nativeQuery = true)
        List<CompanyRaspReportProjection> findRaspCompCount();

        @Query(value="select Company,count(*) as Raspno from (select c2.ci_name || '-' || c2.ci_branch as Company " +
                     "from elecmet.compraspinfo c, elecmet.compinfo c2 " +
                     "where cr_rasp_status = 'Active' and cr_status = 0 and cr_compinfo_id = c2.ci_id) as comp " +
                     "group by Company", nativeQuery = true)
        List<CompanyRaspReportProjection> findRaspBranchCount();


        @Modifying
        @Transactional
        @Query("Update CompRaspInfo c set c.ciId = :compid where c.crId = :crid ")
        public void UpdateRaspCompany(Long crid, String compid);
}
