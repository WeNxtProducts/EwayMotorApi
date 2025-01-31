/*
 * Java domain class for entity "TiraErrorHistory" 
 * Created on 2023-10-25 ( Date ISO 2023-10-25 - Time 15:19:50 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */
 
 /*
 * Created on 2023-10-25 ( 15:19:50 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */


package com.maan.eway.repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.maan.eway.bean.TiraErrorHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.maan.eway.bean.TiraErrorHistoryId;
/**
 * <h2>TiraErrorHistoryRepository</h2>
 *
 * createdAt : 2023-10-25 - Time 15:19:50
 * <p>
 * Description: "TiraErrorHistory" Repository
 */
 
 
 
public interface TiraErrorHistoryRepository  extends JpaRepository<TiraErrorHistory,TiraErrorHistoryId > , JpaSpecificationExecutor<TiraErrorHistory> {

	List<TiraErrorHistory> findByReqRegNumberAndEntryDateLessThanEqualAndEntryDateGreaterThanEqualOrderByEntryDateDesc(
			String reqRegNumber, Date date, Date date2);

	List<TiraErrorHistory> findByReqRegNumberAndApiDescriptionAndEntryDateGreaterThanEqualOrderByEntryDateDesc(
			String reqRegNumber, String string, Date today);

}
