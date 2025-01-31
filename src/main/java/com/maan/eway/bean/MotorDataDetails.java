/* 
*  Copyright (c) 2019. All right reserved
 * Created on 2024-06-19 ( Date ISO 2024-06-19 - Time 16:53:14 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */

/*
 * Created on 2024-06-19 ( 16:53:14 )
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

import java.math.BigDecimal;
import java.util.Date;
import jakarta.persistence.*;




/**
* Domain class for entity "MotorDataDetails"
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
@IdClass(MotorDataDetailsId.class)
@Table(name="motor_data_details")


public class MotorDataDetails implements Serializable {
 
private static final long serialVersionUID = 1L;
 
    //--- ENTITY PRIMARY KEY 
    @Id
    @Column(name="QUOTE_NO", nullable=false, length=20)
    private String     quoteNo ;

    @Id
    @Column(name="REQUEST_REFERENCE_NO", nullable=false, length=20)
    private String     requestReferenceNo ;

    @Id
    @Column(name="VEHICLE_ID", nullable=false, length=20)
    private String     vehicleId ;

    //--- ENTITY DATA FIELDS 
    @Column(name="PRODUCT_ID", nullable=false)
    private Integer    productId ;

    @Column(name="PRODUCT_NAME", length=100)
    private String     productName ;

    @Column(name="SECTION_ID", nullable=false)
    private Integer    sectionId ;

    @Column(name="SECTION_NAME", length=100)
    private String     sectionName ;

    @Column(name="COMPANY_ID", nullable=false, length=20)
    private String     companyId ;

    @Column(name="COMPANY_NAME", length=100)
    private String     companyName ;

    @Column(name="BRANCH_CODE", nullable=false, length=20)
    private String     branchCode ;

    @Column(name="CUSTOMER_ID", nullable=false, length=20)
    private String     customerId ;

    @Column(name="VD_REFNO", nullable=false, length=20)
    private String     vdRefno ;

    @Column(name="CD_REFNO", nullable=false, length=20)
    private String     cdRefno ;

    @Column(name="MS_REFNO", nullable=false, length=20)
    private String     msRefno ;

    @Column(name="ID_NUMBER", nullable=false, length=20)
    private String     idNumber ;

    @Column(name="ACCIDENT", length=1)
    private String     accident ;

    @Column(name="GPS_TRACKING_INSTALLED", length=1)
    private String     gpsTrackingInstalled ;

    @Column(name="WIND_SCREEN_COVER_REQUIRED", nullable=false, length=1)
    private String     windScreenCoverRequired ;

    @Column(name="INSURANCE_TYPE", nullable=false, length=10)
    private String     insuranceType ;

    @Column(name="INSURANCE_TYPE_DESC", length=100)
    private String     insuranceTypeDesc ;

    @Column(name="MOTOR_CATEGORY", length=1)
    private String     motorCategory ;

    @Column(name="MOTOR_CATEGORY_DESC", length=100)
    private String     motorCategoryDesc ;

    @Column(name="MOTOR_USAGE", length=100)
    private String     motorUsage ;

    @Column(name="REGISTRATION_NUMBER", length=20)
    private String     registrationNumber ;

    @Column(name="CHASSIS_NUMBER", length=20)
    private String     chassisNumber ;

    @Column(name="VEHICLE_MAKE", length=20)
    private String     vehicleMake ;

    @Column(name="VEHICLE_MAKE_DESC", length=100)
    private String     vehicleMakeDesc ;

    @Column(name="VEHCILE_MODEL", length=20)
    private String     vehcileModel ;

    @Column(name="VEHCILE_MODEL_DESC", length=100)
    private String     vehcileModelDesc ;

    @Column(name="VEHICLE_TYPE", length=100)
    private String     vehicleType ;

    @Column(name="VEHICLE_TYPE_DESC", length=100)
    private String     vehicleTypeDesc ;

    @Column(name="MODEL_NUMBER", length=20)
    private String     modelNumber ;

    @Column(name="ENGINE_NUMBER", length=20)
    private String     engineNumber ;

    @Column(name="FUEL_TYPE", length=20)
    private String     fuelType ;

    @Column(name="FUEL_TYPE_DESC", length=100)
    private String     fuelTypeDesc ;

    @Column(name="SEATING_CAPACITY")
    private Integer    seatingCapacity ;

    @Column(name="CUBIC_CAPACITY")
    private Double     cubicCapacity ;

    @Column(name="COLOR", length=200)
    private String     color ;

    @Column(name="COLOR_DESC", length=200)
    private String     colorDesc ;

    @Column(name="GROSS_WEIGHT")
    private Double     grossWeight ;

    @Column(name="TARE_WEIGHT")
    private Double     tareWeight ;

    @Column(name="ACTUAL_PREMIUM_FC")
    private Double     actualPremiumFc ;

    @Column(name="ACTUAL_PREMIUM_LC")
    private Double     actualPremiumLc ;

    @Column(name="OVERALL_PREMIUM_LC")
    private Double     overallPremiumLc ;

    @Column(name="OVERALL_PREMIUM_FC")
    private Double     overallPremiumFc ;

//    @Column(name="COVERNOTE_NO", length=20)
//    private String     covernoteNo ;
//
//    @Column(name="STICKER_NO", length=20)
//    private String     stickerNo ;

    @Column(name="PERIOD_OF_INSURANCE", length=20)
    private String     periodOfInsurance ;

    @Column(name="WIND_SCREEN_SUM_INSURED")
    private Double     windScreenSumInsured ;

    @Column(name="ACCCESSORIES_SUM_INSURED")
    private Double     acccessoriesSumInsured ;

//    @Column(name="ACCESSORIES_INFORMATION", length=200)
//    private String     accessoriesInformation ;

    @Column(name="NUMBER_OF_AXELS")
    private Integer    numberOfAxels ;

    @Column(name="AXEL_DISTANCE")
    private Double     axelDistance ;

    @Column(name="SUM_INSURED")
    private Double     sumInsured ;

//    @Column(name="OVERRIDE_PERCENTAGE")
//    private Double     overridePercentage ;

    @Column(name="TPPD_FREE_LIMIT")
    private Double     tppdFreeLimit ;

    @Column(name="TPPD_INCREAE_LIMIT")
    private Double     tppdIncreaeLimit ;

//    @Column(name="INSURER_SETTLEMENT")
//    private Double     insurerSettlement ;

    @Column(name="POLICY_TYPE", length=5)
    private String     policyType ;

    @Column(name="POLICY_TYPE_DESC", length=100)
    private String     policyTypeDesc ;

//    @Column(name="RADIOORCASSETEPLAYER")
//    private Double     radioorcasseteplayer ;

    @Column(name="ROOF_RACK")
    private Double     roofRack ;

    @Column(name="SPOT_FOG_LAMP")
    private Double     spotFogLamp ;

    @Column(name="TRAILER_DETAILS", length=200)
    private String     trailerDetails ;

    @Column(name="DRIVEN_BY", length=5)
    private String     drivenBy ;

    @Column(name="DRIVEN_BY_DESC", length=100)
    private String     drivenByDesc ;

    @Column(name="VEHICLE_INTERESTED_COMPANY", length=5)
    private String     vehicleInterestedCompany ;

    @Column(name="INTERESTED_COMPANY_DETAILS", length=200)
    private String     interestedCompanyDetails ;

    @Column(name="OTHER_VEHICLE", length=5)
    private String     otherVehicle ;

    @Column(name="OTHER_VEHICLE_DETAILS", length=200)
    private String     otherVehicleDetails ;

    @Column(name="OTHER_INSURANCE", length=5)
    private String     otherInsurance ;

    @Column(name="OTHER_INSURANCE_DETAILS", length=200)
    private String     otherInsuranceDetails ;

    @Column(name="HOLD_INSURANCE_POLICY", length=5)
    private String     holdInsurancePolicy ;

    @Column(name="NO_OF_CLAIMS")
    private Integer    noOfClaims ;

    @Column(name="ADDITIONAL_CIRCUMSTANCES", length=200)
    private String     additionalCircumstances ;

    @Column(name="ENDORSEMENT_TYPE")
    private Integer    endorsementType ;

    @Column(name="ENDORSEMENT_TYPE_DESC", length=100)
    private String     endorsementTypeDesc ;

    @Column(name="DRIVEN_BY_UNDER_AGE", length=5)
    private String     drivenByUnderAge ;

    @Column(name="DEFECTIVE_VISION_OR_HEARING", length=5)
    private String     defectiveVisionOrHearing ;

    @Column(name="MOTORING_OFFENCE", length=5)
    private String     motoringOffence ;

    @Column(name="SUSPENSION_OF_LICENSE", length=5)
    private String     suspensionOfLicense ;

    @Column(name="SPECIAL_TERMS_OF_PREMIUM", length=5)
    private String     specialTermsOfPremium ;

    @Column(name="IRRESPECTIVE_OF_BLAME", length=5)
    private String     irrespectiveOfBlame ;

    @Column(name="AGENCY_CODE", nullable=false, length=20)
    private String     agencyCode ;

    @Column(name="INSURANCE_CLASS", nullable=false, length=20)
    private String     insuranceClass ;

    @Column(name="INSURANCE_CLASS_DESC", length=100)
    private String     insuranceClassDesc ;

    @Column(name="OWNER_CATEGORY", length=20)
    private String     ownerCategory ;

    @Column(name="MANUFACTURE_AGE")
    private Integer    manufactureAge ;

    @Column(name="REGISTRATION_AGE")
    private Integer    registrationAge ;

    @Column(name="NCD_YEARS")
    private Integer    ncdYears ;

    @Column(name="NCD_YN", length=1)
    private String     ncdYn ;

    @Temporal(TemporalType.DATE)
    @Column(name="REGISTRATION_YEAR")
    private Date       registrationYear ;

    @Column(name="MANUFACTURE_YEAR")
    private Integer    manufactureYear ;

    @Column(name="STATUS", length=10)
    private String     status ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="UPDATED_DATE")
    private Date       updatedDate ;

    @Column(name="CREATED_BY", length=100)
    private String     createdBy ;

    @Column(name="UPDATED_BY", length=100)
    private String     updatedBy ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ENTRY_DATE")
    private Date       entryDate ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="POLICY_START_DATE")
    private Date       policyStartDate ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="POLICY_END_DATE")
    private Date       policyEndDate ;

    @Column(name="CURRENCY", length=100)
    private String     currency ;

    @Column(name="EXCHANGE_RATE")
    private Double     exchangeRate ;

    @Column(name="FLEET_OWNER_YN", length=1)
    private String     fleetOwnerYn ;

    @Column(name="NO_OF_VEHICLES")
    private Integer    noOfVehicles ;

    @Column(name="NO_OF_COMPEHENSIVES")
    private Integer    noOfCompehensives ;

    @Column(name="CLAIM_RATIO")
    private Double     claimRatio ;

    @Column(name="COLLATERAL_YN", length=1)
    private String     collateralYn ;

    @Column(name="BORROWER_TYPE", length=1)
    private String     borrowerType ;

    @Column(name="BORROWER_TYPE_DESC", length=100)
    private String     borrowerTypeDesc ;

    @Column(name="COLLATERAL_NAME", length=100)
    private String     collateralName ;

    @Column(name="FIRST_LOSS_PAYEE", length=100)
    private String     firstLossPayee ;

    @Column(name="CITY_LIMIT", length=20)
    private String     cityLimit ;

    @Column(name="AC_EXECUTIVE_ID")
    private Integer    acExecutiveId ;

    @Column(name="application_id", length=100)
    private String     applicationId ;

    @Column(name="BROKER_CODE", length=20)
    private String     brokerCode ;

    @Column(name="SUB_USER_TYPE", length=20)
    private String     subUserType ;

    @Column(name="LOGIN_ID", length=100)
    private String     loginId ;

    @Column(name="SAVED_FROM", length=100)
    private String     savedFrom ;

    @Column(name="BROKER_BRANCH_CODE", length=20)
    private String     brokerBranchCode ;

    @Column(name="HAVEPROMOCODE", length=10)
    private String     havepromocode ;

    @Column(name="PROMOCODE", length=100)
    private String     promocode ;

    @Column(name="POLICY_NO", length=100)
    private String     policyNo ;

    @Column(name="REJECT_REASON", length=100)
    private String     rejectReason ;

    @Column(name="BANK_CODE", length=100)
    private String     bankCode ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ENDORSEMENT_DATE")
    private Date       endorsementDate ;

    @Column(name="ENDORSEMENT_REMARKS", length=1000)
    private String     endorsementRemarks ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ENDORSEMENT_EFFDATE")
    private Date       endorsementEffdate ;

    @Column(name="ORIGINAL_POLICY_NO", length=500)
    private String     originalPolicyNo ;

    @Column(name="ENDT_PREV_POLICY_NO", length=500)
    private String     endtPrevPolicyNo ;

    @Column(name="ENDT_PREV_QUOTE_NO", length=500)
    private String     endtPrevQuoteNo ;

    @Column(name="ENDT_COUNT")
    private BigDecimal endtCount ;

    @Column(name="ENDT_STATUS", length=10)
    private String     endtStatus ;

    @Column(name="IS_FINYN", length=10)
    private String     isFinyn ;

    @Column(name="ENDT_CATEG_DESC", length=100)
    private String     endtCategDesc ;

    @Column(name="ENDORSEMENT_YN", length=100)
    private String     endorsementYn ;

    @Column(name="ENDT_PREMIUM")
    private Double     endtPremium ;

    @Column(name="TIRA_COVER_NOTE_NO", length=100)
    private String     tiraCoverNoteNo ;

    @Column(name="COMMISSION_PERCENTAGE")
    private Double     commissionPercentage ;

    @Column(name="VAT_COMMISSION")
    private Double     vatCommission ;

    @Column(name="VAT_PREMIUM")
    private Double     vatPremium ;

    @Column(name="ENDT_VAT_PREMIUM")
    private Double     endtVatPremium ;

    @Column(name="WIND_SCREEN_SUM_INSURED_LC")
    private Double     windScreenSumInsuredLc ;

    @Column(name="ACCCESSORIES_SUM_INSURED_LC")
    private Double     acccessoriesSumInsuredLc ;

    @Column(name="TPPD_FREE_LIMIT_LC")
    private Double     tppdFreeLimitLc ;

    @Column(name="TPPD_INCREAE_LIMIT_LC")
    private Double     tppdIncreaeLimitLc ;

    @Column(name="SUM_INSURED_LC")
    private Double     sumInsuredLc ;

    @Column(name="CUSTOMER_NAME", length=100)
    private String     customerName ;

    @Column(name="SOURCE_TYPE", length=100)
    private String     sourceType ;

    @Column(name="BDM_CODE", length=100)
    private String     bdmCode ;

    @Column(name="BRANCH_NAME", length=100)
    private String     branchName ;

    @Column(name="CUSTOMER_CODE", length=100)
    private String     customerCode ;

    @Column(name="MOTOR_USAGE_DESC", length=200)
    private String     motorUsageDesc ;

    @Column(name="TIRA_BODY_TYPE", length=200)
    private String     tiraBodyType ;

    @Column(name="TIRA_MOTOR_USAGE", length=200)
    private String     tiraMotorUsage ;

    @Column(name="MODEL_NUBER", length=100)
    private String     modelNuber ;

    @Column(name="SALE_POINT_CODE", length=200)
    private String     salePointCode ;

    @Column(name="FINALIZE_YN", length=2)
    private String     finalizeYn ;

    @Column(name="NON_ELEC_ACCESSORIES_SI")
    private Double     nonElecAccessoriesSi ;

    @Column(name="NON_ELEC_ACCESSORIES_SI_LC")
    private Double     nonElecAccessoriesSiLc ;

    @Column(name="EXCESS_LIMIT")
    private Double     excessLimit ;

    @Column(name="BROKER_TIRA_CODE", length=100)
    private String     brokerTiraCode ;

    @Column(name="SOURCE_TYPE_ID", length=20)
    private String     sourceTypeId ;

    @Column(name="VEHICLE_MAKE_ID", length=10)
    private String     vehicleMakeId ;

    @Column(name="VEHICLE_MODEL_ID", length=10)
    private String     vehicleModelId ;

    @Column(name="FUEL_TYPE_ID", length=10)
    private String     fuelTypeId ;

    @Column(name="OWNER_CATEGORY_ID", length=10)
    private String     ownerCategoryId ;

    @Column(name="OWNER_NAME", length=100)
    private String     ownerName ;

    @Column(name="OWN_DAMAGE", length=100)
    private String     ownDamage ;

    @Column(name="THEFT", length=100)
    private String     theft ;

    @Column(name="WINDSCREEN", length=100)
    private String     windscreen ;

    @Column(name="FIRE", length=100)
    private String     fire ;

    @Column(name="THIRD_PARTY", length=100)
    private String     thirdParty ;

    @Column(name="VEHICLE_CLASS", length=100)
    private String     vehicleClass ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="LICENSE_ISSUED_DATE")
    private Date       licenseIssuedDate ;

    @Column(name="LICESENSE_DURATION")
    private Integer    licesenseDuration ;

    @Column(name="CLAIM_NUM_12M_0M")
    private Integer    claimNum12m0m ;

    @Column(name="CLAIM_NUM_24M_12M")
    private Integer    claimNum24m12m ;

    @Column(name="CLAIM_NUM_36M_24M")
    private Integer    claimNum36m24m ;

    @Column(name="POWER_KILO_WATTS")
    private Double     powerKiloWatts ;

    @Column(name="POWER_WATTS")
    private Double     powerWatts ;

    @Column(name="VEHICLE_GROUP", length=10)
    private String     vehicleGroup ;

    @Column(name="CAR_ALARM_YN", length=10)
    private String     carAlarmYn ;

    @Column(name="PAYMENT_FREQUENCY")
    private Integer    paymentFrequency ;

    @Column(name="PREVIOUS_INSURED", length=50)
    private String     previousInsured ;

    @Column(name="SERIES", length=50)
    private String     series ;

    @Column(name="NO_OF_CYCLINDERS")
    private Integer    noOfCyclinders ;

    @Column(name="ENGINE_TYPE", length=100)
    private String     engineType ;

    @Column(name="PLATE_COLOR", length=50)
    private String     plateColor ;

    @Column(name="NO_OF_TRAILERS")
    private Integer    noOfTrailers ;

    @Column(name="NO_OF_DOORS")
    private Integer    noOfDoors ;

    @Column(name="NO_OF_PASSENGERS")
    private Integer    noOfPassengers ;

    @Column(name="PLATE_TYPE_ID", length=5)
    private String     plateTypeId ;

    @Column(name="PLATE_TYPE_DESC", length=50)
    private String     plateTypeDesc ;

    @Column(name="MILEAGE")
    private Integer    mileage ;

    @Column(name="NO_CLAIM_DOCUMENT_ID")
    private Integer    noClaimDocumentId ;

    @Column(name="NO_CLAIM_DOCUMENT_DESC", length=100)
    private String     noClaimDocumentDesc ;

    @Column(name="NO_CLAIM_YEARS")
    private Integer    noClaimYears ;

    @Column(name="REGISTERED_AT")
    private Integer    registeredAt ;

    @Column(name="MODALITY_SELECTION", length=5)
    private String     modalitySelection ;

    @Column(name="INFLATION_SI")
    private Double     inflationSi ;

    @Column(name="DEPRECIATION_VEHICLE_VALUE")
    private Double     depreciationVehicleValue ;

    @Column(name="DANGEROUS_GOODS_YN", length=2)
    private String     dangerousGoodsYn ;

    @Column(name="EXCESS_LIMIT_LC")
    private Double     excessLimitLc ;

    @Column(name="NO_OF_CYCLINDERS_DESC", length=30)
    private String     noOfCyclindersDesc ;

    @Column(name="NO_OF_DOORS_DESC", length=10)
    private String     noOfDoorsDesc ;

    @Column(name="PLATE_COLOR_ID")
    private Integer    plateColorId ;

    @Column(name="PRODUCT_NAME_LOCAL", length=100)
    private String     productNameLocal ;

    @Column(name="SECTION_NAME_LOCAL", length=100)
    private String     sectionNameLocal ;

    @Column(name="COMPANY_NAME_LOCAL", length=100)
    private String     companyNameLocal ;

    @Column(name="INSURANCE_TYPE_DESC_LOCAL", length=100)
    private String     insuranceTypeDescLocal ;

    @Column(name="MOTOR_CATEGORY_DESC_LOCAL", length=100)
    private String     motorCategoryDescLocal ;

    @Column(name="VEHICLE_MAKE_DESC_LOCAL", length=100)
    private String     vehicleMakeDescLocal ;

    @Column(name="VEHICLE_MODEL_DESC_LOCAL", length=100)
    private String     vehicleModelDescLocal ;

    @Column(name="VEHICLE_TYPE_DESC_LOCAL", length=100)
    private String     vehicleTypeDescLocal ;

    @Column(name="FUEL_TYPE_DESC_LOCAL", length=100)
    private String     fuelTypeDescLocal ;

    @Column(name="COLOR_DESC_LOCAL", length=100)
    private String     colorDescLocal ;

    @Column(name="POLICY_TYPE_DESC_LOCAL", length=100)
    private String     policyTypeDescLocal ;

    @Column(name="ENDORSEMENT_TYPE_DESC_LOCAL", length=100)
    private String     endorsementTypeDescLocal ;

    @Column(name="INUSRANCE_CLASS_DESC_LOCAL", length=100)
    private String     inusranceClassDescLocal ;

    @Column(name="ENDT_CATEG_DESC_LOCAL", length=100)
    private String     endtCategDescLocal ;

    @Column(name="CUSTOMER_NAME_LOCAL", length=100)
    private String     customerNameLocal ;

    @Column(name="BRANCH_NAME_LOCAL", length=100)
    private String     branchNameLocal ;

    @Column(name="MOTOR_USAGE_DESC_LOCAL", length=100)
    private String     motorUsageDescLocal ;

    @Column(name="TIRA_BODY_TYPE_LOCAL", length=100)
    private String     tiraBodyTypeLocal ;

    @Column(name="TIRA_MOTOR_USAGE_LOCAL", length=100)
    private String     tiraMotorUsageLocal ;

    @Column(name="OWNER_NAME_LOCAL", length=100)
    private String     ownerNameLocal ;

    @Column(name="LOSS_RATIO")
    private Double     lossRatio ;

    @Column(name="PREVIOUS_INSURANCE_YN", length=2)
    private String     previousInsuranceYn ;

    @Column(name="NO_OF_DOORS_DESC_LOCAL", length=10)
    private String     noOfDoorsDescLocal ;
    
    @Column(name="NO_OF_CYCLINDERS_DESC_LOCAL", length=10)
    private String     noOfCyclindersDescLocal; 
    
    @Column(name="PLATE_TYPE_DESC_LOCAL", length=10)
    private String     plateTypeDescLocal;
    
    @Column(name="PLATE_COLOR_LOCAL", length=10)
    private String     plateColorLocal;
    
    //--- ENTITY LINKS ( RELATIONSHIP )


}



