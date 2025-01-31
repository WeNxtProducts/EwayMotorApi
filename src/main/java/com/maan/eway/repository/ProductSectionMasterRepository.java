/*
 * Java domain class for entity "SectionMaster" 
 * Created on 2022-09-02 ( Date ISO 2022-09-02 - Time 18:14:54 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */
 
 /*
 * Created on 2022-09-02 ( 18:14:54 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */


package com.maan.eway.repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.maan.eway.bean.ProductSectionMaster;
import com.maan.eway.bean.ProductSectionMasterId;
import com.maan.eway.bean.SectionMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.maan.eway.bean.SectionMasterId;
/**
 * <h2>SectionMasterRepository</h2>
 *
 * createdAt : 2022-09-02 - Time 18:14:54
 * <p>
 * Description: "SectionMaster" Repository
 */
 
 
 
public interface ProductSectionMasterRepository  extends JpaRepository<ProductSectionMaster,ProductSectionMasterId > , JpaSpecificationExecutor<ProductSectionMaster> {

	List<ProductSectionMaster> findByProductIdAndCompanyId(Integer productId, String companyId);

	Long countBySectionNameAndCompanyIdAndProductIdOrderByEntryDateDesc(String sectionName, String companyId,
			Integer productId);

	List<ProductSectionMaster> findBySectionIdOrderByAmendIdDesc(Integer valueOf);

	List<ProductSectionMaster> findByProductIdAndCompanyIdAndSectionId(Integer productId, String companyId,
			Integer sectionId);

	ProductSectionMaster findByProductIdAndCompanyIdAndSectionIdAndEffectiveDateStartGreaterThanEqualAndEffectiveDateEndLessThanEqualAndStatus(
			Integer productId, String companyId, Integer sectionId, Date date, Date date2, String string);

	List<ProductSectionMaster> findByProductIdAndCompanyIdAndSectionIdAndStatusOrderByAmendIdDesc(Integer productId,
			String companyId, Integer sectionId, String string);

	List<ProductSectionMaster> findByCompanyIdAndSectionNameOrderByAmendIdDesc(String companyId,
			String insTypeDesc);

	List<ProductSectionMaster> findByProductIdAndCompanyIdAndSectionIdOrderByAmendIdDesc(Integer valueOf,
			String companyId, Integer valueOf2);


}
