/*
 * Java domain class for entity "PolicyCoverData" 
 * Created on 2023-01-12 ( Date ISO 2023-01-12 - Time 16:01:43 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */
 
 /*
 * Created on 2023-01-12 ( 16:01:43 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */


package com.maan.eway.repository;

import java.util.Date;
import java.util.List;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.maan.eway.bean.PolicyCoverData;
import com.maan.eway.bean.PolicyCoverDataId;
import com.maan.eway.bean.PolicyCoverDataIndividuals;
import com.maan.eway.bean.PolicyCoverDataIndividualsId;
/**
 * <h2>PolicyCoverDataRepository</h2>
 *
 * createdAt : 2023-01-12 - Time 16:01:43
 * <p>
 * Description: "PolicyCoverData" Repository
 */
 
 
 
public interface PolicyCoverDataIndividualsRepository  extends JpaRepository<PolicyCoverDataIndividuals,PolicyCoverDataIndividualsId > , JpaSpecificationExecutor<PolicyCoverDataIndividuals> {

	Long countByQuoteNoAndVehicleIdNotIn(String quoteNo, List<Integer> passengerIds);

	@Transactional
	void deleteByQuoteNoAndVehicleIdNotIn(String quoteNo, List<Integer> passengerIds);

	Long countByQuoteNoAndVehicleIdIn(String quoteNo, List<Integer> passengerIds);

	@Transactional
	void deleteByQuoteNoAndVehicleIdIn(String quoteNo, List<Integer> passengerIds);

	Long countByQuoteNoAndSectionIdAndVehicleIdIn(String quoteNo, Integer sectionId, List<Integer> passengerIds);

	@Transactional
	void deleteByQuoteNoAndSectionIdAndVehicleIdIn(String quoteNo, Integer sectionId, List<Integer> passengerIds);

}
