/*
 * Java domain class for entity "InsuranceCompanyMaster" 
 * Created on 2022-08-24 ( Date ISO 2022-08-24 - Time 12:58:27 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */
 
 /*
 * Created on 2022-08-24 ( 12:58:27 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */


package com.maan.eway.repository;

import java.math.BigDecimal;
import java.util.List;

import com.maan.eway.bean.InsuranceCompanyMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.maan.eway.bean.InsuranceCompanyMasterId;
/**
 * <h2>InsuranceCompanyMasterRepository</h2>
 *
 * createdAt : 2022-08-24 - Time 12:58:27
 * <p>
 * Description: "InsuranceCompanyMaster" Repository
 */
 
 
 
public interface InsuranceCompanyMasterRepository  extends JpaRepository<InsuranceCompanyMaster,InsuranceCompanyMasterId > , JpaSpecificationExecutor<InsuranceCompanyMaster> {

	List<InsuranceCompanyMaster> findByCompanyIdOrderByAmendIdDesc(String companyId);


}
