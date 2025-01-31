/*
 * Created on 2024-06-19 ( 16:53:23 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package com.maan.eway.bean;

import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;



/**
 * Composite primary key for entity "MsCommonDetails" ( stored in table "ms_common_details" )
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
public class MsCommonDetailsId implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY KEY ATTRIBUTES 
    private String     insuranceId ;
    
    private String     branchCode ;
    
    private String     agencyCode ;
    
    private Integer    sectionId ;
    
    private Integer    productId ;
    
    private Long       cdRefno ;
    
    private Long       msRefno ;
    
    private String     requestreferenceno ;
    
    private String     status ;
    
    private Long       vdRefno ;
    
     
}
