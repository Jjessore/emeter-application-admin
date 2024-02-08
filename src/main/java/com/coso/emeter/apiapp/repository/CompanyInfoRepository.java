package com.coso.emeter.apiapp.repository;

import com.coso.emeter.apiapp.entity.CompInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyInfoRepository extends JpaRepository<CompInfo, String> {

}
