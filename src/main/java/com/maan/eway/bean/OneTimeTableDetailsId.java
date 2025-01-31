/*
 * Created on 2024-06-19 ( 16:53:29 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package com.maan.eway.bean;

import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;



/**
 * Composite primary key for entity "OneTimeTableDetails" ( stored in table "one_time_table_details" )
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
public class OneTimeTableDetailsId implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY KEY ATTRIBUTES 
    private Integer    parentId ;
    
    private Integer    companyId ;
    
    private Integer    amendId ;
    
     
}
