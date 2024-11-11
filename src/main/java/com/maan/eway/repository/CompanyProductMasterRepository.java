/*
 * Java domain class for entity "ProductMaster" 
 * Created on 2022-08-24 ( Date ISO 2022-08-24 - Time 12:58:28 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */
 
 /*
 * Created on 2022-08-24 ( 12:58:28 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */


package com.maan.eway.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.maan.eway.bean.CompanyProductMaster;
import com.maan.eway.bean.CompanyProductMasterId;
/**
 * <h2>ProductMasterRepository</h2>
 *
 * createdAt : 2022-08-24 - Time 12:58:28
 * <p>
 * Description: "ProductMaster" Repository
 */
 
 
 
public interface CompanyProductMasterRepository  extends JpaRepository<CompanyProductMaster,CompanyProductMasterId > , JpaSpecificationExecutor<CompanyProductMaster> {

	List<CompanyProductMaster> findByProductIdOrderByAmendIdDesc(Integer valueOf);

	List<CompanyProductMaster> findByCompanyIdAndProductIdOrderByAmendIdDesc(String companyId, Integer productId);


}
