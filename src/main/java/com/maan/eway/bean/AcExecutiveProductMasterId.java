/*
 * Created on 2024-06-19 ( 16:50:42 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package com.maan.eway.bean;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Composite primary key for entity "AcExecutiveProductMaster" ( stored in table "ac_executive_product_master" )
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
public class AcExecutiveProductMasterId implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY KEY ATTRIBUTES 
    private String     acExecutiveId ;
    
    private Integer    productId ;
    
    private String     companyId ;
    
    private Date       effectiveDateStart ;
    
    private Date       effectiveDateEnd ;
    
    private Integer    amendId ;
    
     
}
