/* 
*  Copyright (c) 2019. All right reserved
 * Created on 2022-11-09 ( Date ISO 2022-11-09 - Time 18:32:05 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */

/*
 * Created on 2022-11-09 ( 18:32:05 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */


package com.maan.eway.bean;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

import java.util.Date;
import jakarta.persistence.*;




/**
* Domain class for entity "CoverDetails"
*
* @author Telosys Tools Generator
*
*/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@DynamicInsert
@DynamicUpdate
@Builder
@IdClass(CoverDetailsId.class)
@Table(name="motor_policy_cover_data")


public class CoverDetails implements Serializable {
 
private static final long serialVersionUID = 1L;
 
    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="QUOTE_NO", nullable=false, length=20)
    private String     quoteNo ;

    @Id
    @Column(name="REQUEST_REFERENCE_NO", nullable=false, length=20)
    private String     requestReferenceNo ;

    @Id
    @Column(name="COVER_ID", nullable=false)
    private Integer    coverId ;

    @Id
    @Column(name="VEHICLE_ID", nullable=false)
    private Integer    vehicleId ;

    @Id
    @Column(name="SECTION_ID", nullable=false)
    private Integer    sectionId ;

    @Id
    @Column(name="PRODUCT_ID", nullable=false)
    private Integer    productId ;

    @Id
    @Column(name="COMPANY_ID", nullable=false, length=20)
    private String     companyId ;

    @Id
    @Column(name="SUB_COVER_YN", nullable=false, length=20)
    private String     subCoverYn ;

    @Id
    @Column(name="SUB_COVER_ID", nullable=false)
    private Integer    subCoverId ;

    @Id
    @Column(name="DISC_LOAD_ID", nullable=false)
    private Integer    discLoadId ;

    @Id
    @Column(name="TAX_ID")
    private Integer taxId;
   

    @Column(name="LODING_ID")
    private Integer lodingId;
    
    //--- ENTITY DATA FIELDS 
    @Column(name="CD_REFNO", nullable=false, length=20)
    private String     cdRefno ;

    @Column(name="VD_REFNO", nullable=false, length=20)
    private String     vdRefno ;

    @Column(name="MS_REFNO", nullable=false, length=20)
    private String     msRefno ;

    @Column(name="COVER_NAME", length=100)
    private String     coverName ;

    @Column(name="COVER_DESC", length=200)
    private String     coverDesc ;

    @Column(name="SUM_INSURED")
    private Double     sumInsured ;

    @Column(name="SUB_COVER_NAME", length=100)
    private String     subCoverName ;

    @Column(name="SUB_COVER_DESC", length=200)
    private String     subCoverDesc ;

    @Column(name="CALC_TYPE", length=20)
    private String     calcType ;

    @Column(name="MINIMUM_PREMIUM")
    private Double     minimumPremium ;

    @Column(name="RATE")
    private Double     rate ;

    @Column(name="CURRENCY")
    private String currency ;

    @Column(name="EXCHANGE_RATE")
    private Double exchageRate ;
    
    @Column(name="PREMIUM_BEFORE_DISCOUNT_FC")
    private Double     premiumBeforeDiscountFc ;

    @Column(name="PREMIUM_AFTER_DISCOUNT_FC")
    private Double     premiumAfterDiscountFc ;

    @Column(name="PREMIUM_EXCLUDED_TAX_FC")
    private Double     premiumExcludedTaxFc ;

    @Column(name="PREMIUM_INCLUDED_TAX_FC")
    private Double     premiumIncludedTaxFc ;
    
    @Column(name="PREMIUM_BEFORE_DISCOUNT_LC")
    private Double     premiumBeforeDiscountLc ;

    @Column(name="PREMIUM_AFTER_DISCOUNT_LC")
    private Double     premiumAfterDiscountLc ;

    @Column(name="PREMIUM_EXCLUDED_TAX_LC")
    private Double     premiumExcludedTaxLc ;

    @Column(name="PREMIUM_INCLUDED_TAX_LC")
    private Double     premiumIncludedTaxLc ;

    @Column(name="FACTOR_TYPE_ID")
    private Double     factorTypeId ;

    @Column(name="DEPENDENT_COVER_YN", length=20)
    private String     dependentCoverYn ;

    @Column(name="DEPENDENT_COVER_ID")
    private Integer    dependentCoverId ;

    @Column(name="COVERAGE_TYPE", length=20)
    private String     coverageType ;

    @Column(name="IS_SELECTED", length=20)
    private String     isSelected ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ENTRY_DATE")
    private Date       entryDate ;

    @Column(name="STATUS", length=20)
    private String     status ;

    @Column(name="CREATED_BY", length=100)
    private String     createdBy ;

    @Column(name="TAX_RATE")
    private Double taxRate;
    
    @Column(name="TAX_AMOUNT")
    private Double taxAmount;
    
    @Column(name="TAX_DESC")
    private String taxDesc;
    
    @Column(name="TAX_CALC_TYPE")
    private String taxCalcType;
    
    @Column(name="IS_TAX_EXTEMPTED")
    private String isTaxExtempted ;
    
    @Column(name="TAX_EXEMPT_TYPE")
    private String taxExtemptType;
    
    @Column(name="TAX_EXEMPT_CODE")
    private String taxExemptCode;
    
    @Column(name="Is_REFERRAL", length=5)
    private String     isReferral ;

    @Column(name="referral_description", length=1000)
    private String     referralDescription ;
  
    //--- ENTITY LINKS ( RELATIONSHIP )


}



