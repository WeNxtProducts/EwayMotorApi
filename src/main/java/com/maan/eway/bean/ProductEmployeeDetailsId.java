/*
 * Created on 2024-06-19 ( 16:53:49 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package com.maan.eway.bean;

import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;



/**
 * Composite primary key for entity "ProductEmployeeDetails" ( stored in table "product_employee_details" )
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
public class ProductEmployeeDetailsId implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY KEY ATTRIBUTES 
    private Integer    productId ;
    
    private String     requestReferenceNo ;
    
    private Integer    riskId ;
    
    private String     companyId ;
    
    private Long       employeeId ;
    
    private String     nationalityId ;
    
    private String     sectionId ;
    
    private Integer    locationId ;
    
     
}
