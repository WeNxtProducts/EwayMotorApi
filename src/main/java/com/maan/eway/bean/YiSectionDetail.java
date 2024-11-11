/* 
*  Copyright (c) 2019. All right reserved
 * Created on 2024-06-19 ( Date ISO 2024-06-19 - Time 16:55:00 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */

/*
 * Created on 2024-06-19 ( 16:55:00 )
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
* Domain class for entity "YiSectionDetail"
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
@Table(name="yi_section_detail")


public class YiSectionDetail implements Serializable {
 
private static final long serialVersionUID = 1L;
 
    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="REQUESTREFERENCENO", nullable=false, length=15)
    private String     requestreferenceno ;

    //--- ENTITY DATA FIELDS 
    @Column(name="SERVICE_ID", length=100)
    private String     serviceId ;

    @Column(name="SERVICE_ACTION", length=100)
    private String     serviceAction ;

    @Column(name="QUOTATION_POLICY_NO", length=100)
    private String     quotationPolicyNo ;

    @Column(name="SR_NO")
    private Double     srNo ;

    @Column(name="SECTION_CODE", length=100)
    private String     sectionCode ;

    @Column(name="ITERATION_NO", length=20)
    private String     iterationNo ;

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

    @Column(name="PRODUCT_CODE", length=50)
    private String     productCode ;

    @Column(name="SCHEME_DESC", length=50)
    private String     schemeDesc ;


    //--- ENTITY LINKS ( RELATIONSHIP )


}



