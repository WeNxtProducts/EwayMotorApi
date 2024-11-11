/*
 * Created on 2024-06-19 ( 16:50:53 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package com.maan.eway.bean;

import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;



/**
 * Composite primary key for entity "BurglaryOtherOccupants" ( stored in table "burglary_other_occupants" )
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
public class BurglaryOtherOccupantsId implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY KEY ATTRIBUTES 
    private Integer    id ;
    
    private String     companyId ;
    
    private String     branchCode ;
    
    private String     productId ;
    
    private String     sectionId ;
    
    private String     riskId ;
    
    private String     requestReferenceNo ;
    
    private String     quoteNo ;
    
     
}
