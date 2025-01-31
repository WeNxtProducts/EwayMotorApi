/*
 * Created on 2024-06-19 ( 16:54:45 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */
package com.maan.eway.bean;

import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;



/**
 * Composite primary key for entity "TravelPassengerDetails" ( stored in table "travel_passenger_details" )
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
public class TravelPassengerDetailsId implements Serializable {

    private static final long serialVersionUID = 1L;

    //--- ENTITY KEY ATTRIBUTES 
    private String     quoteNo ;
    
    private String     customerId ;
    
    private Integer    travelId ;
    
    private Integer    passengerId ;
    
    private Integer    groupId ;
    
    private Integer    groupCount ;
    
    private String     requestReferenceNo ;
    
    private String     customerReferenceNo ;
    
    private String     companyId ;
    
    private String     branchCode ;
    
    private Integer    productId ;
    
    private Integer    sectionId ;
    
     
}
