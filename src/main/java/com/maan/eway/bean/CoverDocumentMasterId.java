/*
 * Created on 2024-06-19 ( 16:51:11 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package com.maan.eway.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



/**
 * Composite primary key for entity "CoverDocumentMaster" ( stored in table "cover_document_master" )
 *
 * @author Telosys
 *
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CoverDocumentMasterId implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY KEY ATTRIBUTES 
    private Integer    documentId ;
    
    private Integer    productId ;
    
    private String     companyId ;
    
    private Integer    sectionId ;
    
    private String     coverId ;
    
    private Integer    amendId ;
    
     
}
