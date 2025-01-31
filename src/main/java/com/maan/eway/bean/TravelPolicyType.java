/* 
*  Copyright (c) 2019. All right reserved
 * Created on 2024-06-19 ( Date ISO 2024-06-19 - Time 16:54:46 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */

/*
 * Created on 2024-06-19 ( 16:54:46 )
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
* Domain class for entity "TravelPolicyType"
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
@IdClass(TravelPolicyTypeId.class)
@Table(name="travel_policy_type")


public class TravelPolicyType implements Serializable {
 
private static final long serialVersionUID = 1L;
 
    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="POLICY_TYPE_ID", nullable=false)
    private Integer    policyTypeId ;

    @Id
    @Column(name="PLAN_TYPE_ID", nullable=false)
    private Integer    planTypeId ;

    @Id
    @Column(name="COVER_ID", nullable=false)
    private Integer    coverId ;

    @Id
    @Column(name="SUB_COVER_ID", nullable=false)
    private Integer    subCoverId ;

    @Id
    @Column(name="AMEND_ID", nullable=false)
    private Integer    amendId ;

    @Id
    @Column(name="COMPANY_ID", nullable=false, length=50)
    private String     companyId ;

    @Id
    @Column(name="PRODUCT_ID", nullable=false)
    private Integer    productId ;

    @Id
    @Column(name="BRANCH_CODE", nullable=false, length=8)
    private String     branchCode ;

    //--- ENTITY DATA FIELDS 
    @Column(name="POLICY_TYPE_DESC", length=100)
    private String     policyTypeDesc ;

    @Column(name="PLAN_TYPE_DESC", length=100)
    private String     planTypeDesc ;

    @Column(name="COVER_DESC", length=100)
    private String     coverDesc ;

    @Column(name="SUB_COVER_DESC", length=100)
    private String     subCoverDesc ;

    @Column(name="CURRENCY", length=30)
    private String     currency ;

    @Column(name="SUM_INSURED", length=30)
    private String     sumInsured ;

    @Column(name="EXCESS_AMT", length=30)
    private String     excessAmt ;

    @Temporal(TemporalType.DATE)
    @Column(name="ENTRY_DATE")
    private Date       entryDate ;

    @Column(name="STATUS", length=30)
    private String     status ;

    @Column(name="REMARKS", length=30)
    private String     remarks ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EFFECTIVE_START_DATE")
    private Date       effectiveStartDate ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EFFECTIVE_END_DATE")
    private Date       effectiveEndDate ;

    @Column(name="UPDATED_BY", length=50)
    private String     updatedBy ;

    @Temporal(TemporalType.DATE)
    @Column(name="UPDATED_DATE")
    private Date       updatedDate ;

    @Column(name="COVER_STATUS", length=10)
    private String     coverStatus ;


    //--- ENTITY LINKS ( RELATIONSHIP )


}



