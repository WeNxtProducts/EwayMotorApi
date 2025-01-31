/*
 * Java domain class for entity "ListItemValue" 
 * Created on 2022-08-24 ( Date ISO 2022-08-24 - Time 12:58:27 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */
 
 /*
 * Created on 2022-08-24 ( 12:58:27 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */


package com.maan.eway.repository;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import com.maan.eway.bean.ListItemValue;
import com.maan.eway.bean.ListItemValueId;
import com.maan.eway.error.Error;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
/**
 * <h2>ListItemValueRepository</h2>
 *
 * createdAt : 2022-08-24 - Time 12:58:27
 * <p>
 * Description: "ListItemValue" Repository
 */
 
 
 
public interface ListItemValueRepository  extends JpaRepository<ListItemValue,ListItemValueId > , JpaSpecificationExecutor<ListItemValue> {

//	List<ListItemValue> findByItemTypeAndStatusOrderByItemCodeAsc(String string, String string2);



	//List<ListItemValue> findByStatusOrderByItemIdAsc(String string);

	//ListItemValue findByItemTypeAndStatus(String string, String string2);

//	List<ListItemValue> findByItemTypeAndStatusOrderByItemIdAsc(String string, String string2);

//	List<ListItemValue> findByItemTypeAndStatusOrderByItemCodeDesc(String string, String string2);

	ListItemValue findByItemTypeAndItemCode(String string, String gender);

//	List<ListItemValue> findByItemTypeAndStatusOrderByParam2Asc(String userType, String string);

//	List<ListItemValue> findByItemTypeAndStatusAndCompanyIdOrderByItemCodeAsc(String string, String string2,String insuranceId);
			

//	List<ListItemValue> findByItemTypeAndItemCodeOrderByItemCodeAsc(String string, String insuranceClass);

//	ListItemValue findByItemCodeAndItemType(String genderId, String string);

//	ListItemValue findByItemIdAndItemType(Integer integer, String string);

//	ListItemValue findByItemTypeAndItemValueAndStatus(String itemtype, String itemvalue, String string);

	List<ListItemValue> findByItemTypeAndItemCodeAndCompanyIdOrderByAmendIdDesc(String string, String occupationType,
			String companyId);

	List<ListItemValue> findByItemTypeAndStatusOrderByAmendIdDesc(String string, String string2);


//
	ListItemValue findByItemTypeAndItemCodeAndStatusAndCompanyId(String itemtype, String itemvalue, String string,
			String companyId);

	ListItemValue findByItemTypeAndItemCodeAndCompanyId(String string, String inbuildConstructType, String companyId);

	ListItemValue findByItemTypeIgnoreCaseAndStatusIgnoreCase(String itemType, String status);


}
