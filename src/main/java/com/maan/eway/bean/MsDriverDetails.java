/* 
*  Copyright (c) 2019. All right reserved
 * Created on 2024-06-19 ( Date ISO 2024-06-19 - Time 16:53:24 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */

/*
 * Created on 2024-06-19 ( 16:53:24 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */


package com.maan.eway.bean;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import jakarta.persistence.*;

import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

import java.util.Date;
import jakarta.persistence.*;




/**
* Domain class for entity "MsDriverDetails"
*
* @author Telosys Tools Generator
*
*/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@DynamicInsert
@DynamicUpdate
@Builder
@IdClass(MsDriverDetailsId.class)
@Table(name="ms_driver_details")


public class MsDriverDetails implements Serializable {
 
private static final long serialVersionUID = 1L;
 
    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="RISK_ID", nullable=false)
    private Integer    riskId ;
    
    @Id
    @Column(name="LOCATION_ID", nullable=false)
    private Integer    locationId ;

    @Id
    @Column(name="REQUEST_REFERENCE_NO", nullable=false, length=100)
    private String     requestReferenceNo ;

    @Id
    @Column(name="DRIVER_ID", nullable=false)
    private Integer    driverId ;

    @Id
    @Column(name="DD_REFNO", nullable=false)
    private Long       ddRefno ;

    //--- ENTITY DATA FIELDS 
    @Column(name="DRIVER_TYPE", length=100)
    private String     driverType ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="DRIVER_DOB")
    private Date       driverDob ;

    @Temporal(TemporalType.DATE)
    @Column(name="LICENSE_ISSUE_DT")
    private Date       licenseIssueDt ;

    @Column(name="LICENSE_EXPERIENCE")
    private Integer    licenseExperience ;

    @Column(name="AGE")
    private Integer    age ;

    @Column(name="GENDER", length=5)
    private String     gender ;

    @Column(name="STATE_ID", length=50)
    private String     stateId ;

    @Column(name="AREA_GROUP")
    private Integer    areaGroup ;

    @Column(name="CITY_ID")
    private Integer    cityId ;

    @Column(name="SUBURB_ID")
    private Integer    suburbId ;

    @Column(name="MARITAL_STATUS", length=10)
    private String     maritalStatus ;

    @Column(name="COUNTRY_ID", length=5)
    private String     countryId ;

    @Column(name="COUNTRY_NAME", length=100)
    private String     countryName ;

    @Column(name="ENDORSEMENT_TYPE")
    private Integer    endorsementType ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ENTRY_DATE")
    private Date       entryDate ;

    @Column(name="STATUS", length=5)
    private String     status ;

    @Column(name="CLAIM_TYPE", length=5)
    private String     claimType ;


    //--- ENTITY LINKS ( RELATIONSHIP )


}



