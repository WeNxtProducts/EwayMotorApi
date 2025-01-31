/* 
*  Copyright (c) 2019. All right reserved
 * Created on 2024-06-19 ( Date ISO 2024-06-19 - Time 16:52:30 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */

/*
 * Created on 2024-06-19 ( 16:52:30 )
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
* Domain class for entity "ExclusionMaster"
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
@IdClass(ExclusionMasterId.class)
@Table(name="exclusion_master")


public class ExclusionMaster implements Serializable {
 
private static final long serialVersionUID = 1L;
 
    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="EXCLUSION_ID", nullable=false)
    private Integer    exclusionId ;

    @Id
    @Column(name="BRANCH_CODE", nullable=false, length=20)
    private String     branchCode ;

    @Id
    @Column(name="COMPANY_ID", nullable=false, length=20)
    private String     companyId ;

    @Id
    @Column(name="AMEND_ID", nullable=false)
    private Integer    amendId ;

    @Id
    @Column(name="SECTION_ID", nullable=false, length=20)
    private String     sectionId ;

    @Id
    @Column(name="PRODUCT_ID", nullable=false, length=20)
    private String     productId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="EXCLUSION_DESCRIPTION", nullable=false, length=1000)
    private String     exclusionDescription ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EFFECTIVE_DATE_START", nullable=false)
    private Date       effectiveDateStart ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EFFECTIVE_DATE_END", nullable=false)
    private Date       effectiveDateEnd ;

    @Temporal(TemporalType.DATE)
    @Column(name="ENTRY_DATE")
    private Date       entryDate ;

    @Column(name="REMARKS", length=1000)
    private String     remarks ;

    @Column(name="STATUS", length=1)
    private String     status ;

    @Column(name="CREATED_BY", length=100)
    private String     createdBy ;

    @Column(name="UPDATED_BY", length=100)
    private String     updatedBy ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="UPDATED_DATE")
    private Date       updatedDate ;

    @Column(name="CORE_APP_CODE", nullable=false, length=20)
    private String     coreAppCode ;

    @Column(name="REGULATORY_CODE", nullable=false, length=20)
    private String     regulatoryCode ;

    @Column(name="DOC_REF_NO", length=50)
    private String     docRefNo ;

    @Column(name="TYPE_ID", length=20)
    private String     typeId ;

    @Column(name="TYPE_DESC", length=20)
    private String     typeDesc ;

    @Column(name="EXCLUSION_DESCRIPTION_LOCAL", length=1100)
    private String     exclusionDescriptionLocal ;


    //--- ENTITY LINKS ( RELATIONSHIP )


}



