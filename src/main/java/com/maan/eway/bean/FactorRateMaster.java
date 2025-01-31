/* 
*  Copyright (c) 2019. All right reserved
 * Created on 2024-06-19 ( Date ISO 2024-06-19 - Time 16:52:32 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */

/*
 * Created on 2024-06-19 ( 16:52:32 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */


package com.maan.eway.bean;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import jakarta.persistence.*;

import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

import java.util.Date;
import jakarta.persistence.*;




/**
* Domain class for entity "FactorRateMaster"
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
@IdClass(FactorRateMasterId.class)
@Table(name="factor_rate_master")


public class FactorRateMaster implements Serializable {
 
private static final long serialVersionUID = 1L;
 
    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="FACTOR_TYPE_ID", nullable=false)
    private Integer    factorTypeId ;

    @Id
    @Column(name="S_NO", nullable=false)
    private Integer    sNo ;

    @Id
    @Column(name="COMPANY_ID", nullable=false, length=100)
    private String     companyId ;

    @Id
    @Column(name="PRODUCT_ID", nullable=false)
    private Integer    productId ;

    @Id
    @Column(name="BRANCH_CODE", nullable=false, length=20)
    private String     branchCode ;

    @Id
    @Column(name="AGENCY_CODE", nullable=false, length=20)
    private String     agencyCode ;

    @Id
    @Column(name="SECTION_ID", nullable=false)
    private Integer    sectionId ;

    @Id
    @Column(name="COVER_ID", nullable=false)
    private Integer    coverId ;

    @Id
    @Column(name="SUB_COVER_ID", nullable=false)
    private Integer    subCoverId ;

    @Id
    @Column(name="AMEND_ID", nullable=false)
    private Integer    amendId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="FACTOR_TYPE_NAME", length=100)
    private String     factorTypeName ;

    @Column(name="FACTOR_TYPE_DESC", length=200)
    private String     factorTypeDesc ;

    @Column(name="COVER_NAME", length=100)
    private String     coverName ;

    @Column(name="COVER_DESC", length=200)
    private String     coverDesc ;

    @Column(name="SUB_COVER_NAME", length=100)
    private String     subCoverName ;

    @Column(name="SUB_COVER_DESC", length=200)
    private String     subCoverDesc ;

    @Column(name="CREATED_BY", length=100)
    private String     createdBy ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ENTRY_DATE")
    private Date       entryDate ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EFFECTIVE_DATE_START")
    private Date       effectiveDateStart ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EFFECTIVE_DATE_END")
    private Date       effectiveDateEnd ;

    @Column(name="STATUS", length=1)
    private String     status ;

    @Column(name="REMARKS", length=100)
    private String     remarks ;

    @Column(name="PARAM_1")
    private Double     param1 ;

    @Column(name="PARAM_2")
    private Double     param2 ;

    @Column(name="PARAM_3")
    private Double     param3 ;

    @Column(name="PARAM_4")
    private Double     param4 ;

    @Column(name="PARAM_5")
    private Double     param5 ;

    @Column(name="PARAM_6")
    private Double     param6 ;

    @Column(name="PARAM_7")
    private Double     param7 ;

    @Column(name="PARAM_8")
    private Double     param8 ;

    @Column(name="PARAM_9", length=100)
    private String     param9 ;

    @Column(name="PARAM_10", length=100)
    private String     param10 ;

    @Column(name="PARAM_11", length=100)
    private String     param11 ;

    @Column(name="PARAM_12", length=100)
    private String     param12 ;

    @Column(name="RATE")
    private Double     rate ;

    @Column(name="CALC_TYPE", length=1)
    private String     calcType ;

    @Column(name="CALC_TYPE_DESC", length=100)
    private String     calcTypeDesc ;

    @Column(name="MIN_PREMIUM")
    private Double     minPremium ;

    @Column(name="REGULATORY_CODE", length=20)
    private String     regulatoryCode ;

    @Column(name="CORE_APP_CODE", length=20)
    private String     coreAppCode ;

    @Column(name="UPDATED_BY", length=100)
    private String     updatedBy ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="UPDATED_DATE")
    private Date       updatedDate ;

    @Column(name="MASTER_YN", length=2)
    private String     masterYn ;

    @Column(name="API_URL", length=100)
    private String     apiUrl ;

    @Column(name="PARAM_13", length=50)
    private String     param13 ;

    @Column(name="PARAM_14", length=50)
    private String     param14 ;

    @Column(name="PARAM_15", length=50)
    private String     param15 ;

    @Column(name="PARAM_16", length=50)
    private String     param16 ;

    @Column(name="PARAM_17", length=50)
    private String     param17 ;

    @Column(name="PARAM_18", length=50)
    private String     param18 ;

    @Column(name="PARAM_19", length=50)
    private String     param19 ;

    @Column(name="PARAM_20", length=50)
    private String     param20 ;

    @Column(name="PARAM_21")
    private Double     param21 ;

    @Column(name="PARAM_22")
    private Double     param22 ;

    @Column(name="PARAM_23")
    private Double     param23 ;

    @Column(name="PARAM_24")
    private Double     param24 ;

    @Column(name="PARAM_25")
    private Double     param25 ;

    @Column(name="PARAM_26")
    private Double     param26 ;

    @Column(name="PARAM_27")
    private Double     param27 ;

    @Column(name="PARAM_28")
    private Double     param28 ;

    @Column(name="PLAN_CODE")
    private Integer    planCode ;

    @Column(name="EXCESS_PERCENT")
    private Double     excessPercent ;

    @Column(name="EXCESS_AMOUNT")
    private Double     excessAmount ;

    @Column(name="EXCESS_DESC", length=500)
    private String     excessDesc ;

    @Column(name="FREE_COVER_LIMIT")
    private Double     freeCoverLimit ;

    @Column(name="FACTOR_TYPE_NAME_LOCAL", length=100)
    private String     factorTypeNameLocal ;

    @Column(name="FACTOR_TYPE_DESC_LOCAL", length=100)
    private String     factorTypeDescLocal ;

    @Column(name="COVER_NAME_LOCAL", length=100)
    private String     coverNameLocal ;

    @Column(name="COVER_DESC_LOCAL", length=100)
    private String     coverDescLocal ;

    @Column(name="SUB_COVER_NAME_LOCAL", length=100)
    private String     subCoverNameLocal ;

    @Column(name="SUB_COVER_DESC_LOCAL", length=100)
    private String     subCoverDescLocal ;

    @Column(name="EXCESS_DESC_LOCAL", length=100)
    private String     excessDescLocal ;


    //--- ENTITY LINKS ( RELATIONSHIP )


}



