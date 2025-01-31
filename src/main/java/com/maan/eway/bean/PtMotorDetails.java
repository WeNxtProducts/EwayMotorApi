/* 
*  Copyright (c) 2019. All right reserved
 * Created on 2024-06-19 ( Date ISO 2024-06-19 - Time 16:53:57 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */

/*
 * Created on 2024-06-19 ( 16:53:57 )
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
* Domain class for entity "PtMotorDetails"
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
@IdClass(PtMotorDetailsId.class)
@Table(name="pt_motor_details")


public class PtMotorDetails implements Serializable {
 
private static final long serialVersionUID = 1L;
 
    //--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID", nullable=false)
    private Integer    id ;

    @Id
    @Column(name="COMPANY_ID", nullable=false, length=20)
    private String     companyId ;

    @Id
    @Column(name="BRANCH_CODE", nullable=false, length=20)
    private String     branchCode ;

    @Id
    @Column(name="PRODUCT_ID", nullable=false, length=20)
    private String     productId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="REQUEST_REFERENCE_NO", length=100)
    private String     requestReferenceNo ;

    @Column(name="QUOTE_NO", length=100)
    private String     quoteNo ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ENTRY_DATE")
    private Date       entryDate ;

    @Column(name="STATUS", nullable=false, length=1)
    private String     status ;

    @Column(name="CREATED_BY", length=100)
    private String     createdBy ;

    @Column(name="SECTION_ID", length=100)
    private String     sectionId ;


    //--- ENTITY LINKS ( RELATIONSHIP )


}



