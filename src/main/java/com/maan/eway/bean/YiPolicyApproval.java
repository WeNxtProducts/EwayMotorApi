/* 
*  Copyright (c) 2019. All right reserved
 * Created on 2024-06-19 ( Date ISO 2024-06-19 - Time 16:54:57 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */

/*
 * Created on 2024-06-19 ( 16:54:57 )
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
* Domain class for entity "YiPolicyApproval"
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
@Table(name="yi_policy_approval")


public class YiPolicyApproval implements Serializable {
 
private static final long serialVersionUID = 1L;
 
    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="REQUESTREFERENCENO", nullable=false, length=100)
    private String     requestreferenceno ;

    //--- ENTITY DATA FIELDS 
    @Column(name="SERVICE_ID", length=40)
    private String     serviceId ;

    @Column(name="QUOTATION_POLICY_NO", length=60)
    private String     quotationPolicyNo ;

    @Column(name="ITERATION_NO", length=5)
    private String     iterationNo ;

    @Column(name="APPR_DESC", length=500)
    private String     apprDesc ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="REQUEST_TIME")
    private Date       requestTime ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="RESPONSE_TIME")
    private Date       responseTime ;

    @Column(name="P_WS_RESPONSE_TYPE", length=100)
    private String     pWsResponseType ;

    @Column(name="P_WS_ERROR", length=1000)
    private String     pWsError ;

    @Column(name="STATUS", length=100)
    private String     status ;

    @Column(name="RENEWAL_POLICY_NO", length=100)
    private String     renewalPolicyNo ;

    @Column(name="RENEWAL_CURRENT_STATUS", length=100)
    private String     renewalCurrentStatus ;

    @Column(name="TRAN_CODE", length=100)
    private String     tranCode ;

    @Column(name="DOC_NO", length=100)
    private String     docNo ;


    //--- ENTITY LINKS ( RELATIONSHIP )


}



