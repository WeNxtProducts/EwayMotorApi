/* 
*  Copyright (c) 2019. All right reserved
 * Created on 2023-09-21 ( Date ISO 2023-09-21 - Time 13:32:52 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */

/*
 * Created on 2023-09-21 ( 13:32:52 )
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
* Domain class for entity "SurvivalBenefitMaster"
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
@IdClass(SurvivalBenefitMasterId.class)
@Table(name="LIFE_SURVIVAL_BENEFIT_MASTER")


public class SurvivalBenefitMaster implements Serializable {
 
private static final long serialVersionUID = 1L;
 
    //--- ENTITY PRIMARY KEY 
	
	@Id
	@Column(name="SNO", nullable=false)
	private Integer    sno ;

    @Id
    @Column(name="POLICY_TERMS", nullable=false)
    private Integer    policyTerms ;

    @Id
    @Column(name="END_OF_YEAR", nullable=false)
    private Integer    endOfYear ;


    @Column(name="AMOUNT")
    private Double     amount ;


    @Column(name="STATUS", nullable=false, length=2)
    private String     status ;

    @Id
    @Column(name="AMEND_ID", nullable=false)
    private Integer    amendId ;

    @Id
    @Column(name="PRODUCT_ID", nullable=false)
    private Integer    productId ;

    @Id
    @Column(name="SECTION_ID", nullable=false)
    private Integer    sectionId ;

    @Id
    @Column(name="COMPANY_ID", nullable=false, length=20)
    private String     companyId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="CALC_TYPE", length=2)
    private String     calcType ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ENTRY_DATE")
    private Date       entryDate ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EFFECTIVE_DATE_START")
    private Date       effectiveDateStart ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EFFECTIVE_DATE_END")
    private Date       effectiveDateEnd ;

    @Column(name="CREATED_BY", length=100)
    private String     createdBy ;

    @Column(name="UPDATED_BY", length=100)
    private String     updatedBy ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="UPDATED_DATE")
    private Date       updatedDate ;

    @Column(name="REMARKS", length=300)
    private String     remarks ;
    
    @Column(name="REGULATORY_CODE")
    private String     regulatoryCode ;
    
    @Column(name="CORE_APP_CODE")
    private String     coreAppCode ;


    //--- ENTITY LINKS ( RELATIONSHIP )


}



