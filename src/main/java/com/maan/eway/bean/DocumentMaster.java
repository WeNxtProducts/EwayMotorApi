/* 
*  Copyright (c) 2019. All right reserved
 * Created on 2024-06-19 ( Date ISO 2024-06-19 - Time 16:51:15 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */

/*
 * Created on 2024-06-19 ( 16:51:15 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */


package com.maan.eway.bean;


import java.io.Serializable;
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
* Domain class for entity "DocumentMaster"
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
@IdClass(DocumentMasterId.class)
@Table(name="document_master")


public class DocumentMaster implements Serializable {
 
private static final long serialVersionUID = 1L;
 
    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="DOCUMENT_ID", nullable=false)
    private Integer    documentId ;

    @Id
    @Column(name="AMEND_ID", nullable=false)
    private Integer    amendId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="DOCUMENT_NAME", nullable=false, length=100)
    private String     documentName ;

    @Column(name="DOCUMENT_DESC", length=300)
    private String     documentDesc ;

    @Column(name="DOC_APPLICABLE_ID")
    private Integer    docApplicableId ;

    @Column(name="DOC_APPLICABLE", length=100)
    private String     docApplicable ;

    @Column(name="MANDATORY_STATUS", length=1)
    private String     mandatoryStatus ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ENTRY_DATE")
    private Date       entryDate ;

    @Column(name="STATUS", length=1)
    private String     status ;

    @Column(name="REMARKS", length=100)
    private String     remarks ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EFFECTIVE_DATE_START")
    private Date       effectiveDateStart ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EFFECTIVE_DATE_END")
    private Date       effectiveDateEnd ;

    @Column(name="CREATED_BY", nullable=false, length=100)
    private String     createdBy ;

    @Column(name="REGULATORY_CODE", nullable=false, length=20)
    private String     regulatoryCode ;

    @Column(name="UPDATED_BY", length=100)
    private String     updatedBy ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="UPDATED_DATE")
    private Date       updatedDate ;

    @Column(name="CORE_APP_CODE", length=20)
    private String     coreAppCode ;


    //--- ENTITY LINKS ( RELATIONSHIP )


}



