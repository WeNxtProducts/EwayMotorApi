/* 
*  Copyright (c) 2019. All right reserved
 * Created on 2023-01-12 ( Date ISO 2023-01-12 - Time 16:01:15 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */

/*
 * Created on 2023-01-12 ( 16:01:15 )
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
* Domain class for entity "InsuranceCompanyMaster"
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
@IdClass(InsuranceCompanyMasterId.class)
@Table(name="eway_insurance_company_master")


public class InsuranceCompanyMaster implements Serializable {
 
private static final long serialVersionUID = 1L;
 
    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="COMPANY_ID", nullable=false, length=20)
    private String     companyId ;

    @Id
    @Column(name="AMEND_ID", nullable=false)
    private Integer    amendId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="COMPANY_NAME", length=200)
    private String     companyName ;

    @Column(name="COMPANY_ADDRESS", length=200)
    private String     companyAddress ;

    @Column(name="COMPANY_EMAIL", length=100)
    private String     companyEmail ;

    @Column(name="COMPANY_PHONE", length=20)
    private String     companyPhone ;

    @Column(name="BROKER_YN", length=2)
    private String     brokerYn ;

    @Column(name="COMPANY_WEBSITE", length=100)
    private String     companyWebsite ;

    @Column(name="COMPANY_LOGO", length=100)
    private String     companyLogo ;

    @Column(name="REGARDS", length=50)
    private String     regards ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EFFECTIVE_DATE_START", nullable=false)
    private Date       effectiveDateStart ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EFFECTIVE_DATE_END", nullable=false)
    private Date       effectiveDateEnd ;

    @Column(name="STATUS", length=1)
    private String     status ;

    @Column(name="FOOTER_IMAGE", length=100)
    private String     footerImage ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ENTRY_DATE")
    private Date       entryDate ;

    @Column(name="FOOTER_DESCRIPTION", length=100)
    private String     footerDescription ;

    @Column(name="SIGNATURE", length=100)
    private String     signature ;

    @Column(name="REMARKS", length=100)
    private String     remarks ;

    @Column(name="CORE_APP_CODE", nullable=false, length=20)
    private String     coreAppCode ;

    @Column(name="CREATED_BY", nullable=false, length=50)
    private String     createdBy ;

    @Column(name="CURRENCY_ID", length=20)
    private String     currencyId ;

    @Column(name="REGULATORY_CODE", nullable=false, length=20)
    private String     regulatoryCode ;

    @Column(name="UPDATED_BY", length=100)
    private String     updatedBy ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="UPDATED_DATE")
    private Date       updatedDate ;

    @Column(name="TIN_NUMBER", length=100)
    private String     tinNumber;
    

    @Column(name="VRN_NUMBER", length=100)
    private String     vrnNumber;
    
    
    @Column(name="PO_BOX", length=100)
    private String  pOBox;

    //--- ENTITY LINKS ( RELATIONSHIP )
 
    
    //PATTERN ENTITYS---------
  
	
    @Column(name="ALPHABET", length=20)
    private String  alphabet;
    
    @Column(name="NUMERICDIGITS", length=20)
    private String  numericDigits;
    
    @Column(name="SYMBOLS", length=20)
    private String  symbols;
    
    @Column(name="TOTALPSMIN", length=20)
    private String  Totalmin;
    
    @Column(name="TOTALPSMAX", length=20)
      String  Totalmax;
    
  
    
	/*
	 * @Column(name="MINIMUM_PREMIUM") private Double minimumpremium;
	 */


}



