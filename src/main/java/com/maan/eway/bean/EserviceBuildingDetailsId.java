/*
 * Created on 2024-06-19 ( 16:51:27 )
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
 * Composite primary key for entity "EserviceBuildingDetails" ( stored in table "eservice_building_details" )
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
public class EserviceBuildingDetailsId implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY KEY ATTRIBUTES 
    private String     requestReferenceNo ;
    
    private Integer    riskId ;
    
    private String     customerReferenceNo ;
    
    private String     sectionId ;
    
    private Integer locationId;
    
     
}
