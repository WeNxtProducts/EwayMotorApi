/*
 * Created on 2024-06-19 ( 16:52:52 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package com.maan.eway.bean;

import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;



/**
 * Composite primary key for entity "LifePolicytermsMaster" ( stored in table "life_policyterms_master" )
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
public class LifePolicytermsMasterId implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY KEY ATTRIBUTES 
    private Integer    planNo ;
    
    private Integer    policyTerms ;
    
    private Integer    amendId ;
    
    private Integer    productId ;
    
    private Integer    sectionId ;
    
    private String     companyId ;
    
     
}
