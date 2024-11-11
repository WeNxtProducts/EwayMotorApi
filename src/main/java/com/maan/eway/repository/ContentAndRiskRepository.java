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
import java.util.Set;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.maan.eway.bean.ContentAndRisk;
import com.maan.eway.bean.ContentAndRiskId;
/**
 * <h2>BankMasterRepository</h2>
 *
 * createdAt : 2022-08-24 - Time 12:58:26
 * <p>
 * Description: "BankMaster" Repository
 */
 
 
 
public interface ContentAndRiskRepository  extends JpaRepository<ContentAndRisk,ContentAndRiskId > , JpaSpecificationExecutor<ContentAndRisk> {

	

	ContentAndRisk findByQuoteNoAndRiskIdAndSectionIdAndItemId(String quoteNo, Integer valueOf, String sectionId,
			Integer valueOf2);


	List<ContentAndRisk> findByQuoteNoAndSectionId(String quoteNo, String sectionId);

	List<ContentAndRisk> findByRequestReferenceNoAndSectionId(String req, String sectionId);



	ContentAndRisk findByRequestReferenceNoAndRiskIdAndSectionIdAndQuoteNo(String requestReferenceNo, Integer valueOf,
			String sectionId, String quoteNo);


	List<ContentAndRisk> findByQuoteNo(String quoteNo);
	
	List<ContentAndRisk> findByRequestReferenceNo(String quoteNo);

	List<ContentAndRisk> findByQuoteNoAndType(String quoteNo, String type);

	List<ContentAndRisk> findByRequestReferenceNoAndType(String req_no, String type);
	
	Long countByQuoteNoAndRiskId(String quoteNo, Integer valueOf);

	
	@Transactional
	void deleteByQuoteNoAndRiskId(String quoteNo, Integer valueOf);


	Long countByQuoteNoAndRiskIdNotIn(String quoteNo, List<Integer> locIds);

	@Transactional
	void deleteByQuoteNoAndRiskIdNotIn(String quoteNo, List<Integer> locIds);


	Long countByRequestReferenceNoAndRiskIdNotIn(String requestno, List<Integer> locIds);


	void deleteByRequestReferenceNoAndRiskIdNotIn(String requestno, List<Integer> locIds);


	List<ContentAndRisk> findByRequestReferenceNoAndSectionIdAndRiskId(String requestReferenceNo, String sectionId,
			Integer risk);

	Set<ContentAndRisk> findByRiskIdAndRequestReferenceNoAndSectionId(Integer risk,String requestReferenceNo, String sectionId
			);


	List<ContentAndRisk> findByRequestReferenceNoAndSectionIdAndRiskIdAndItemId(String requestReferenceNo,
			String sectionId, Integer risk, Integer item);


	List<ContentAndRisk> findByRequestReferenceNoAndSectionIdAndType(String requestReferenceNo, String sectionId,
			String type);


	List<ContentAndRisk> findByQuoteNoAndSectionIdAndLocationId(String quoteNo, String sectionId, Integer valueOf);


	List<ContentAndRisk> findByRequestReferenceNoAndSectionIdAndTypeAndLocationId(String requestReferenceNo,
			String sectionId, String type, Integer locationId);





	


	

}
