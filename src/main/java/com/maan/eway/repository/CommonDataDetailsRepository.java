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

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.maan.eway.bean.CommonDataDetails;
import com.maan.eway.bean.CommonDataDetailsId;
import com.maan.eway.bean.EserviceCommonDetails;
/**
 * <h2>BankMasterRepository</h2>
 *
 * createdAt : 2022-08-24 - Time 12:58:26
 * <p>
 * Description: "BankMaster" Repository
 */
 
 
 @Repository
public interface CommonDataDetailsRepository  extends JpaRepository<CommonDataDetails,CommonDataDetailsId > , JpaSpecificationExecutor<CommonDataDetails> {

	List<CommonDataDetails> findByQuoteNo(String quoteNo);

	CommonDataDetails findByOccupationTypeAndQuoteNo(String occupationId, String quoteNo);

	List<CommonDataDetails> findByQuoteNoAndSectionId(String quoteNo, String sectionId);

	List<CommonDataDetails> findByQuoteNoAndSectionIdAndStatusNot(String quoteNo, String sectionId, String string);

	

}
