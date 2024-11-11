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
 * Composite primary key for entity "MsCustomerDetails" ( stored in table "ms_customer_details" )
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
public class MsCustomerDetailsId implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY KEY ATTRIBUTES 
    private String     policyHolderTypeid ;
    
    private String     idType ;
    
    private String     idNumber ;
    
    private Integer    age ;
    
    private String     gender ;
    
    private String     occupation ;
    
    private String     regionCode ;
    
    private String     isTaxExempted ;
    
    private Long       cdRefno ;
    
     
}
