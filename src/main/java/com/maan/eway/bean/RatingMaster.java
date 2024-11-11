/* 
*  Copyright (c) 2019. All right reserved
 * Created on 2022-08-24 ( Date ISO 2022-08-24 - Time 12:58:28 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */

/*
 * Created on 2022-08-24 ( 12:58:28 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */


package com.maan.eway.bean;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import io.swagger.models.auth.In;
import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

import java.util.Date;
import java.util.List;
import jakarta.persistence.*;




/**
* Domain class for entity "rating_master"
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
@IdClass(RatingMasterId.class)
@Table(name="rating_master")


public class RatingMaster implements Serializable {
 
private static final long serialVersionUID = 1L;
 
    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="RATING_ID", nullable=false)
    private Integer    ratingId ;

    @Id
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EFFECTIVE_DATE_START", nullable=false)
    private Date       effectiveDateStart ;

    @Id
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EFFECTIVE_DATE_END", nullable=false)
    private Date       effectiveDateEnd ;

    @Id
    @Column(name="COMPANY_ID", nullable=false, length=20)
    private String     companyId ;

    @Id
    @Column(name="COVER_ID")
    private Integer   coverId;

    //--- ENTITY DATA FIELDS 
    @Column(name="RATING_SETUP_NAME", length=200)
    private String     ratingSetupName ;

    @Column(name="RATING_SETUP_SHORT", length=20)
    private String     ratingSetupShort ;

    @Column(name="RATING_STATUS", length=20)
    private String     ratingStatus ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="RATING_EFFECT_DATE")
    private Date     ratingEffectDate ;

    @Column(name="COVERAGE_TYPE", length=20)
    private String     coverageType ;

    @Column(name="UPLOAD_OPTION", length=2)
    private String     uploadOption ;
    
    @Column(name="MAX_SUMINSURED")
    private Double   maxSuminsured;
    
    @Column(name="COVERAGE_LIMIT")
    private Double   coverageLimit;
    
    @Column(name="CALC_TYPE", length=20)
    private String     calcType ;
    
    @Column(name="BASE_RATE", length=20)
    private String     baseRate ;
    
    @Column(name="EXCESS", length=20)
    private String     excess ;
    
    @Column(name="CALC_YN", length=20)
    private String     calcYn ;
    
    @Column(name="MIN_PREMIUM")
    private Double   minPremium;
    
    @Column(name="COVER_SHORT_DESC", length=20)
    private String     coverShortDesc ; 
    
    @Column(name="COVER_NAME", length=200)
    private String     coverName ; 
    
    @Column(name="CALC_STATUS", length=20)
    private String     calcStatus ; 
    
    @Column(name="TOOL_TIP", length=20)
    private String     toolTip ; 
    
    @Column(name="CORE_CODE", length=20)
    private String     coreCode ; 
    
    @Column(name="MIN_SUMINSURED")
    private Double   minSuminsured;
    
    @Column(name="CORE_APP_CODE", length=20)
    private String     coreAppCode ;
    
    @Column(name="AMEND_ID")
    private Double   amendId;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ENTRY_DATE")
    private Date       entryDate ;

    @Column(name="STATUS", length=1)
    private String     status ;


}



