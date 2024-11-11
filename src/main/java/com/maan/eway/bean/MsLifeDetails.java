/* 
*  Copyright (c) 2019. All right reserved
 * Created on 2024-06-19 ( Date ISO 2024-06-19 - Time 16:53:25 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */

/*
 * Created on 2024-06-19 ( 16:53:25 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */


package com.maan.eway.bean;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;




/**
* Domain class for entity "MsLifeDetails"
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
@IdClass(MsLifeDetailsId.class)
@Table(name="ms_life_details")


public class MsLifeDetails implements Serializable {
 
private static final long serialVersionUID = 1L;
 
    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="VD_REFNO", nullable=false)
    private Long       vdRefno ;

    @Id
    @Column(name="RISK_ID", nullable=false)
    private Integer    riskId ;

    @Id
    @Column(name="BRANCH_CODE", nullable=false, length=20)
    private String     branchCode ;

    @Id
    @Column(name="PRODUCT_ID", nullable=false)
    private Integer    productId ;

    @Id
    @Column(name="SECTION_ID", nullable=false)
    private Integer    sectionId ;

    @Id
    @Column(name="COMPANY_ID", nullable=false, length=20)
    private String     companyId ;

    @Id
    @Column(name="CURRENCY", nullable=false, length=20)
    private String     currency ;

    @Id
    @Column(name="EXCHANGE_RATE", nullable=false)
    private BigDecimal     exchangeRate ;

    @Id
    @Column(name="PERIOD_OF_INSURANCE", nullable=false, length=10)
    private String     periodOfInsurance ;

    @Id
    @Column(name="SUM_INSURED", nullable=false)
    private BigDecimal     sumInsured ;

    @Id
    @Column(name="STATUS", nullable=false, length=2)
    private String     status ;

    @Id
    @Column(name="GROUP_COUNT", nullable=false)
    private Integer    groupCount ;

    @Id
    @Column(name="HAVEPROMOCODE", nullable=false, length=20)
    private String     havepromocode ;

    @Id
    @Column(name="PROMOCODE", nullable=false, length=100)
    private String     promocode ;

    @Id
    @Column(name="UW_LOADING", nullable=false)
    private BigDecimal     uwLoading ;

    //--- ENTITY DATA FIELDS 
    @Column(name="REQUEST_REFERENCE_NO", nullable=false, length=20)
    private String     requestReferenceNo ;

    @Column(name="POLICY_TERM")
    private Integer    policyTerm ;

    @Column(name="PREMIUM_PAYING_TERM")
    private Integer    premiumPayingTerm ;

    @Column(name="PAYMENT_MODE", length=10)
    private String     paymentMode ;

    @Column(name="SUM_INSURED_LC", nullable=false)
    private BigDecimal     sumInsuredLc ;

    @Column(name="ENDT_TYPE_ID", nullable=false)
    private Integer    endtTypeId ;

    @Column(name="ENDT_CATEGORY_ID", nullable=false, length=100)
    private String     endtCategoryId ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ENTRY_DATE")
    private Date       entryDate ;

    @Column(name="CREATED_BY", length=100)
    private String     createdBy ;


    //--- ENTITY LINKS ( RELATIONSHIP )


}



