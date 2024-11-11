/*
 * Java domain class for entity "BankMaster" 
 * Created on 2022-08-24 ( Date ISO 2022-08-24 - Time 12:58:26 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */
 
 /*
 * Created on 2022-08-24 ( 12:58:26 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */


package com.maan.eway.repository;

import java.util.List;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.maan.eway.bean.EserviceDriverDetails;
import com.maan.eway.bean.MotorDriverDetails;
import com.maan.eway.bean.MotorDriverDetailsId;

 
 
public interface MotorDriverDetailsRepository  extends JpaRepository<MotorDriverDetails,MotorDriverDetailsId > , JpaSpecificationExecutor<MotorDriverDetails> {

	Long countByQuoteNo(String quoteNo);

	@Transactional
	void deleteByQuoteNo(String quoteNo);

	List<MotorDriverDetails> findByQuoteNo(String quoteNo);

	Long countByRequestReferenceNoAndRiskId(String requestReferenceNo, Integer valueOf);

	void deleteByRequestReferenceNoAndRiskId(String requestReferenceNo, Integer valueOf);

	List<MotorDriverDetails> findByRequestReferenceNo(String requestReferenceNo);

	


}
