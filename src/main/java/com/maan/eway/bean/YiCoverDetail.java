/* 
*  Copyright (c) 2019. All right reserved
 * Created on 2024-06-19 ( Date ISO 2024-06-19 - Time 16:54:56 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */

/*
 * Created on 2024-06-19 ( 16:54:56 )
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
* Domain class for entity "YiCoverDetail"
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
@IdClass(YiCoverDetailId.class)
@Table(name="yi_cover_detail")


public class YiCoverDetail implements Serializable {
 
private static final long serialVersionUID = 1L;
 
    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="QUOTATION_POLICY_NO", nullable=false, length=100)
    private String     quotationPolicyNo ;

    @Id
    @Column(name="CVR_ID", nullable=false)
    private Double     cvrId ;

    @Id
    @Column(name="RISK_ID", nullable=false)
    private Integer    riskId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="SERVICE_ID", length=100)
    private String     serviceId ;

    @Column(name="SERVICE_ACTION", length=100)
    private String     serviceAction ;

    @Column(name="SEC_CODE", length=100)
    private String     secCode ;

    @Column(name="L1S1_ID")
    private Double     l1s1Id ;

    @Column(name="COVER_CODE", length=100)
    private String     coverCode ;

    @Column(name="SUM_INSURED", length=100)
    private String     sumInsured ;

    @Column(name="ITERATION_NO", length=100)
    private String     iterationNo ;

    @Column(name="SI_MODIFIED_YN", length=1)
    private String     siModifiedYn ;

    @Column(name="RATE")
    private Double     rate ;

    @Column(name="RATE_MODIFIED_YN", length=1)
    private String     rateModifiedYn ;

    @Column(name="PREMIUM")
    private Double     premium ;

    @Column(name="PREMIUM_MODIFIED_YN", length=1)
    private String     premiumModifiedYn ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="REQUEST_TIME")
    private Date       requestTime ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="RESPONSE_TIME")
    private Date       responseTime ;

    @Column(name="STATUS", length=10)
    private String     status ;

    @Column(name="P_WS_RESPONSE_TYPE", length=100)
    private String     pWsResponseType ;

    @Column(name="P_WS_ERROR", length=1000)
    private String     pWsError ;

    @Column(name="REQUESTREFERENCENO", length=15)
    private String     requestreferenceno ;

    @Column(name="RENEWAL_POLICY_NO", length=100)
    private String     renewalPolicyNo ;

    @Column(name="RENEWAL_CURRENT_STATUS", length=100)
    private String     renewalCurrentStatus ;

    @Column(name="PROD_CODE", length=50)
    private String     prodCode ;

    @Column(name="SERVICE_TYPE", length=100)
    private String     serviceType ;

    @Column(name="COVER_DESC", length=255)
    private String     coverDesc ;


    //--- ENTITY LINKS ( RELATIONSHIP )


}



