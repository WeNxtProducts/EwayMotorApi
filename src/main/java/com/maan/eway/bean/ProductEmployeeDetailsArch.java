/* 
*  Copyright (c) 2019. All right reserved
 * Created on 2024-06-19 ( Date ISO 2024-06-19 - Time 16:53:50 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */

/*
 * Created on 2024-06-19 ( 16:53:50 )
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
* Domain class for entity "ProductEmployeeDetailsArch"
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
@IdClass(ProductEmployeeDetailsArchId.class)
@Table(name="product_employee_details_arch")


public class ProductEmployeeDetailsArch implements Serializable {
 
private static final long serialVersionUID = 1L;
 
    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="ARCH_ID", nullable=false, length=20)
    private String     archId ;

    @Id
    @Column(name="RISK_ID", nullable=false)
    private Integer    riskId ;

    @Id
    @Column(name="PRODUCT_ID", nullable=false)
    private Integer    productId ;

    @Id
    @Column(name="COMPANY_ID", nullable=false, length=100)
    private String     companyId ;

    @Id
    @Column(name="SECTION_ID", nullable=false, length=100)
    private String     sectionId ;

    @Id
    @Column(name="EMPLOYEE_ID", nullable=false)
    private Long       employeeId ;

    @Id
    @Column(name="NATIONALITY_ID", nullable=false, length=100)
    private String     nationalityId ;

    @Id
    @Column(name="LOCATION_ID", nullable=false)
    private Integer    locationId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="REQUEST_REFERENCE_NO", length=100)
    private String     requestReferenceNo ;

    @Column(name="QUOTE_NO", nullable=false, length=100)
    private String     quoteNo ;

    @Column(name="POLICY_NO", length=100)
    private String     policyNo ;

    @Column(name="PRODUCT_DESC", length=100)
    private String     productDesc ;

    @Column(name="SECTION_DESC", length=100)
    private String     sectionDesc ;

    @Column(name="EMPLOYEE_NAME", length=200)
    private String     employeeName ;

    @Column(name="OCCUPATION_ID", length=20)
    private String     occupationId ;

    @Column(name="OCCUPATION_DESC", length=100)
    private String     occupationDesc ;

    @Column(name="ADDRESS", length=500)
    private String     address ;

    @Column(name="SALARY")
    private Double     salary ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ENTRY_DATE")
    private Date       entryDate ;

    @Column(name="CREATED_BY", length=100)
    private String     createdBy ;

    @Column(name="STATUS", length=10)
    private String     status ;

    @Column(name="ENDORSEMENT_TYPE")
    private Integer    endorsementType ;

    @Column(name="ENDORSEMENT_TYPE_DESC", length=100)
    private String     endorsementTypeDesc ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ENDORSEMENT_DATE")
    private Date       endorsementDate ;

    @Column(name="ENDORSEMENT_REMARKS", length=100)
    private String     endorsementRemarks ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ENDORSEMENT_EFFDATE")
    private Date       endorsementEffdate ;

    @Column(name="ORIGINAL_POLICY_NO", length=100)
    private String     originalPolicyNo ;

    @Column(name="ENDT_PREV_POLICY_NO", length=100)
    private String     endtPrevPolicyNo ;

    @Column(name="ENDT_PREV_QUOTE_NO", length=100)
    private String     endtPrevQuoteNo ;

    @Column(name="ENDT_COUNT")
    private Double     endtCount ;

    @Column(name="ENDT_STATUS", length=10)
    private String     endtStatus ;

    @Column(name="IS_FINYN", length=10)
    private String     isFinyn ;

    @Column(name="ENDT_CATEG_DESC", length=100)
    private String     endtCategDesc ;

    @Column(name="ENDT_PREMIUM")
    private Double     endtPremium ;

    @Column(name="DATE_OF_JOINING_YEAR")
    private Integer    dateOfJoiningYear ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="DATE_OF_BIRTH")
    private Date       dateOfBirth ;

    @Column(name="DATE_OF_JOINING_MONTH", length=10)
    private String     dateOfJoiningMonth ;

    @Temporal(TemporalType.DATE)
    @Column(name="POLICY_START_DATE")
    private Date       policyStartDate ;

    @Temporal(TemporalType.DATE)
    @Column(name="POLICY_END_DATE")
    private Date       policyEndDate ;

    @Column(name="RATE")
    private Double     rate ;

    @Column(name="PREMIUM_FC")
    private Double     premiumFc ;

    @Column(name="PREMIUM_LC")
    private Double     premiumLc ;

    @Lob
    @Column(name="CURRENCY_CODE")
    private byte[]     currencyCode ;

    @Column(name="EXCHANGE_RATE")
    private Double     exchangeRate ;


    //--- ENTITY LINKS ( RELATIONSHIP )


}



