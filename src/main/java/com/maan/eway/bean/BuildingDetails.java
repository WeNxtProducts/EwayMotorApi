/* 
*  Copyright (c) 2019. All right reserved
 * Created on 2024-06-19 ( Date ISO 2024-06-19 - Time 16:50:50 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */

/*
 * Created on 2024-06-19 ( 16:50:50 )
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
* Domain class for entity "BuildingDetails"
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
@IdClass(BuildingDetailsId.class)
@Table(name="building_details")


public class BuildingDetails implements Serializable {
 
private static final long serialVersionUID = 1L;
 
    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="REQUEST_REFERENCE_NO", nullable=false, length=20)
    private String     requestReferenceNo ;

    @Id
    @Column(name="RISK_ID", nullable=false)
    private Integer    riskId ;

    @Id
    @Column(name="SECTION_ID", nullable=false, length=20)
    private String     sectionId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="LOCATION_NAME", length=200)
    private String     locationName ;

    @Column(name="BUILDING_ADDRESS", length=1000)
    private String     buildingAddress ;

    @Column(name="SECTION_DESC", length=100)
    private String     sectionDesc ;

    @Column(name="INBUILD_CONSTRUCT_TYPE_DESC", length=100)
    private String     inbuildConstructTypeDesc ;

    @Column(name="INBUILD_CONSTRUCT_TYPE", length=20)
    private String     inbuildConstructType ;

    @Column(name="BUILDING_FLOORS")
    private Integer    buildingFloors ;

    @Column(name="BUILDING_USAGE_ID", length=100)
    private String     buildingUsageId ;

    @Column(name="BUILDING_USAGE_DESC", length=100)
    private String     buildingUsageDesc ;

    @Column(name="BUILDING_USAGE_YN", length=2)
    private String     buildingUsageYn ;

    @Column(name="BUILDING_TYPE", length=100)
    private String     buildingType ;

    @Column(name="BUILDING_OCCUPATION_TYPE", length=100)
    private String     buildingOccupationType ;

    @Column(name="APARTMENT_OR_BORDER", length=200)
    private String     apartmentOrBorder ;

    @Column(name="WITHOUT_INHABITANT_DAYS")
    private Integer    withoutInhabitantDays ;

    @Column(name="BUILDING_CONDITION", length=100)
    private String     buildingCondition ;

    @Column(name="BUILDING_BUILD_YEAR")
    private Integer    buildingBuildYear ;

    @Column(name="BUILDING_AGE")
    private Integer    buildingAge ;

    @Column(name="BUILDING_AREA_SQM")
    private Double     buildingAreaSqm ;

    @Column(name="BUILDING_SUMINSURED")
    private BigDecimal       buildingSuminsured ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ENTRY_DATE")
    private Date       entryDate ;

    @Column(name="CREATED_BY", length=100)
    private String     createdBy ;

    @Column(name="STATUS", length=2)
    private String     status ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="UPDATED_DATE")
    private Date       updatedDate ;

    @Column(name="UPDATED_BY", length=100)
    private String     updatedBy ;

    @Column(name="QUOTE_NO", nullable=false, length=20)
    private String     quoteNo ;

    @Column(name="CUSTOMER_ID", length=20)
    private String     customerId ;

    @Column(name="POLICY_NO", length=100)
    private String     policyNo ;

    @Column(name="BANK_CODE", length=100)
    private String     bankCode ;

    @Column(name="ENDORSEMENT_TYPE")
    private Integer    endorsementType ;

    @Column(name="ENDORSEMENT_TYPE_DESC", length=100)
    private String     endorsementTypeDesc ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ENDORSEMENT_DATE")
    private Date       endorsementDate ;

    @Column(name="ENDORSEMENT_REMARKS", length=1000)
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
    private BigDecimal     endtCount ;

    @Column(name="ENDT_STATUS", length=10)
    private String     endtStatus ;

    @Column(name="IS_FINYN", length=10)
    private String     isFinyn ;

    @Column(name="ENDT_CATEG_DESC", length=100)
    private String     endtCategDesc ;

    @Column(name="BUILDING_SUMINSURED_LC")
    private BigDecimal  buildingSumInsuredLC ;

	


    //--- ENTITY LINKS ( RELATIONSHIP )


}



