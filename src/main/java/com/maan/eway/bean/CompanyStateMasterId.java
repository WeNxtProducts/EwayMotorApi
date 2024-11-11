/*
 * Created on 2024-06-19 ( 16:51:05 )
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
 * Composite primary key for entity "CompanyStateMaster" ( stored in table "company_state_master" )
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
public class CompanyStateMasterId implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY KEY ATTRIBUTES 
    private Integer    stateId ;
    
    private String     stateShortCode ;
    
    private String     countryId ;
    
    private String     companyId ;
    
    private String     regionCode ;
    
    private Integer    amendId ;
    
     
}
