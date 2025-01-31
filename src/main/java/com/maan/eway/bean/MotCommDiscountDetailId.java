/*
 * Created on 2024-06-19 ( 16:53:12 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package com.maan.eway.bean;

import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;



/**
 * Composite primary key for entity "MotCommDiscountDetail" ( stored in table "mot_comm_discount_detail" )
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
public class MotCommDiscountDetailId implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY KEY ATTRIBUTES 
    private String     commercialDiscount ;
    
    private String     requestreferenceno ;
    
    private Integer    cvrId ;
    
    private Integer    riskId ;
    
     
}
