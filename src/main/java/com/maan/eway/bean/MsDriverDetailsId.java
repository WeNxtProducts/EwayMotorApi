/*
 * Created on 2024-06-19 ( 16:53:24 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package com.maan.eway.bean;

import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;



/**
 * Composite primary key for entity "MsDriverDetails" ( stored in table "ms_driver_details" )
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
public class MsDriverDetailsId implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY KEY ATTRIBUTES 
    private Integer    riskId ;
    
    private String     requestReferenceNo ;
    
    private Integer    driverId ;
    
    private Long       ddRefno ;
    
    private Integer    locationId ;
    
     
}
