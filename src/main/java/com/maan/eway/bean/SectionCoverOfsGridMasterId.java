/*
 * Created on 2022-09-30 ( 18:45:30 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package com.maan.eway.bean;

import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;


import java.util.Date;

/**
 * Composite primary key for entity "CoverMaster" ( stored in table "cover_master" )
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
public class SectionCoverOfsGridMasterId implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY KEY ATTRIBUTES 
    private Integer    coverId ;
    
    private Integer    subCoverId ;
   
    private Integer    coveragesSubId ;
    
    private Integer    sectionId ;
    
    private Integer    productId ;
    
    private String companyId ; 
    
}
