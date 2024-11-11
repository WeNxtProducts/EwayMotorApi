/*
 * Java domain class for entity "EserviceMotorDetails" 
 * Created on 2022-10-17 ( Date ISO 2022-10-17 - Time 11:50:07 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */
package com.maan.eway.common.res;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.maan.eway.common.req.DriverDetailsGetRes;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EserviceMotorDetailsRes implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("Idnumber")
	private String idNumber;
	@JsonProperty("BrokerBranchCode")
	private String brokerBranchCode;
	@JsonProperty("Vehicleid")
	private Integer vehicleId;
	private String accident;
	@JsonProperty("Gpstrackinginstalled")
	private String gpsTrackingInstalled;
	@JsonProperty("Windscreencoverrequired")
	private String windScreenCoverRequired;
//	@JsonProperty("Insurancetype")
//    private String     insuranceType ;
	@JsonProperty("InsuranceTypeDesc")
	private String insuranceTypeDesc;
	@JsonProperty("MotorCategory")
	private String motorCategory;
	@JsonProperty("MotorCategoryDesc")
	private String motorCategoryDesc;
	@JsonProperty("Motorusage")
	private String motorUsage;
	@JsonProperty("HavePromoCode")
	private String havepromocode;

	@JsonProperty("PromoCode")
	private String promocode;
	@JsonProperty("BankCode")
	private String bankCode;

	@JsonProperty("Registrationnumber")
	private String registrationNumber;
	@JsonProperty("Chassisnumber")
	private String chassisNumber;
	@JsonProperty("Vehiclemake")
	private String vehicleMake;
	@JsonProperty("VehiclemakeDesc")
	private String vehicleMakeDesc;
	@JsonProperty("Vehcilemodel")
	private String vehcileModel;
	@JsonProperty("VehicleModelDesc")
	private String vehcileModelDesc;
	@JsonProperty("VehicleType")
	private String vehicleType;
	@JsonProperty("VehicleTypeDesc")
	private String vehicleTypeDesc;
	@JsonProperty("ModelNumber")
	private String modelNumber;
	@JsonProperty("EngineNumber")
	private String engineNumber;
	@JsonProperty("FuelType")
	private String fuelType;
	@JsonProperty("FuelTypeDesc")
	private String fuelTypeDesc;
	@JsonFormat(pattern = "dd/MM/yyyy")
	@JsonProperty("RegistrationYear")
	private Date registrationYear;
	@JsonProperty("SeatingCapacity")
	private Integer seatingCapacity;
	@JsonProperty("EngineCapacity")
	private Double cubicCapacity;
	@JsonProperty("Color")
	private String color;
	@JsonProperty("ColorDesc")
	private String colorDesc;
	@JsonProperty("Grossweight")
	private Double grossWeight;
	@JsonProperty("Tareweight")
	private Double tareWeight;
	@JsonProperty("Actualpremium")
	private Double actualPremium;
	@JsonProperty("CoverNoteNo")
	private String covernoteNo;
	@JsonProperty("Stickerno")
	private String stickerNo;
	private String periodOfInsurance;
	@JsonProperty("WindScreenSumInsured")
	private Double windScreenSumInsured;
	@JsonProperty("AcccessoriesSumInsured")
	private Double acccessoriesSumInsured;
	@JsonProperty("AccessoriesInformation")
	private String accessoriesInformation;
	@JsonProperty("NumberOfAxels")
	private String numberOfAxels;
	@JsonProperty("AxelDistance")
	private Double axelDistance;
	@JsonProperty("SumInsured")
	private Double sumInsured;
	@JsonProperty("OverRidePercentage")
	private Double overridePercentage;
	@JsonProperty("TppdFreeLimit")
	private Double tppdFreeLimit;
	@JsonProperty("TppdIncreaeLimit")
	private Double tppdIncreaeLimit;
	@JsonProperty("InsurerSettlement")
	private Double insurerSettlement;
	@JsonProperty("PolicyType")
	private String policyType;
	@JsonProperty("PolicyTypeDesc")
	private String policyTypeDesc;
	@JsonProperty("RadioOrCasseteplayer")
	private String radioorcasseteplayer;
	@JsonProperty("RoofRack")
	private Double roofRack;
	@JsonProperty("SpotFogLamp")
	private Double spotFogLamp;
	@JsonProperty("TrailerDetails")
	private String trailerDetails;
	@JsonProperty("Drivenby")
	private String drivenBy;
	@JsonProperty("DrivenByDesc")
	private String drivenByDesc;
	@JsonProperty("VehicleInterestedCompany")
	private String vehicleInterestedCompany;
	@JsonProperty("InterestedCompanyDetails")
	private String interestedCompanyDetails;
	@JsonProperty("OtherVehicle")
	private String otherVehicle;
	@JsonProperty("OtherVehicleDetails")
	private String otherVehicleDetails;
	@JsonProperty("OtherInsurance")
	private String otherInsurance;
	@JsonProperty("OtherInsuranceDetails")
	private String otherInsuranceDetails;
	@JsonProperty("HoldInsurancePolicy")
	private String holdInsurancePolicy;
	@JsonProperty("NoOfClaims")
	private Integer noOfClaims;
	@JsonProperty("AdditionalCircumstances")
	private String additionalCircumstances;
	@JsonProperty("BranchCode")
	private String branchCode;
	@JsonProperty("AgencyCode")
	private String agencyCode;
	
	@JsonProperty("SectionName")
	private String sectionName;
	@JsonProperty("ProductId")
	private String productId;
	@JsonProperty("ProductName")
	private String productName;
	@JsonProperty("InsuranceId")
	private String companyId;
	@JsonProperty("CompanyName")
	private String companyName;
	@JsonProperty("InsuranceClass")
	private String insuranceClass;
	@JsonProperty("OwnerCategory")
	private String ownerCategory;
	@JsonProperty("ManufactureAge")
	private Integer manufactureAge;
	@JsonProperty("RegistrationAge")
	private Integer registrationAge;
	@JsonProperty("NcdYears")
	private Integer ncdYears;
	@JsonProperty("NcdYn")
	private String ncdYn;

	@JsonProperty("AcExecutiveId")
	private String acExecutiveId;

	@JsonProperty("CommissionType")
	private String commissionType;

	@JsonProperty("ManufactureYear")
	private String manufactureYear;

	@JsonProperty("Status")
	private String status;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@JsonProperty("UpdatedDate")
	private Date updatedDate;

	@JsonProperty("UpdatedBy")
	private String updatedBy;

	@JsonProperty("CreatedBy")
	private String createdBy;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@JsonProperty("PolicyStartDate")
	private Date policyStartDate;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@JsonProperty("PolicyEndDate")
	private Date policyEndDate;

	@JsonProperty("Currency")
	private String currency;

	@JsonProperty("ExchangeRate")
	private String exchangeRate;

	@JsonProperty("CollateralYn")
	private String collateralYn;

	@JsonProperty("BorrowerType")
	private String borrowerType;

	@JsonProperty("CollateralName")
	private String collateralName;

	@JsonProperty("FirstLossPayee")
	private String firstLossPayee;

	@JsonProperty("FleetOwnerYn")
	private String fleetOwnerYn;

	@JsonProperty("NoOfVehicles")
	private String noOfVehicles;

	@JsonProperty("NoOfComprehensives")
	private String noOfComprehensives;

	@JsonProperty("ClaimRatio")
	private String claimRatio;

	@JsonProperty("CityLimit")
	private String cityLimit;

	@JsonProperty("SavedFrom")
	private String savedFrom;

	@JsonProperty("ActualPremiumLc")
	private String actualPremiumLc;

	@JsonProperty("AcctualPremiumFc")
	private String actualPremiumFc;

	@JsonProperty("OverallPremiumLc")
	private String overallPremiumLc;

	@JsonProperty("OverallPremiumFc")
	private String overallPremiumFc;

	@JsonProperty("BrokerCode")
	private String brokerCode;

	@JsonProperty("LoginId")
	private String loginId;

	@JsonProperty("SubUserType")
	private String subUserType;

	@JsonProperty("ApplicationId")
	private String applicationId;

	@JsonProperty("QuoteNo")
	private String quoteNo;

	@JsonProperty("CustomerId")
	private String customerId;

	@JsonProperty("BdmCode")
	private String bdmCode;

	@JsonProperty("SourceTypeId")
	private String sourceTypeId;

	@JsonProperty("SourceType")
	private String sourceType;

	@JsonProperty("CustomerCode")
	private String customerCode;

	@JsonProperty("MotorUsageDesc")
	private String motorUsageDesc;

	@JsonProperty("DriverYn")
	private String driverYn;

//	@JsonProperty("DriverDetails")
//	private List<DriverDetailsGetRes> driverDetails;

	@JsonProperty("DriverDetails")
	private DriverDetailsGetRes driverDetails;

	@JsonProperty("SectionId")
	private List<String> sectionIds;
	
	@JsonProperty("Insurancetype")
	private String insurancetype;
//	private List<EsSectionDetailsGetRes> sectionDetails;

	@JsonProperty("EndorsementDate") // EndorsementDate
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date endorsementDate;
	@JsonProperty("EndorsementRemarks") // EndorsementRemarks
	private String endorsementRemarks;
	@JsonProperty("EndorsementEffectiveDate") // EndorsementEffectiveDate
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date endorsementEffdate;
	@JsonProperty("OrginalPolicyNo") // OrginalPolicyNo
	private String originalPolicyNo;
	@JsonProperty("EndtPrevPolicyNo") // EndtPrevPolicyNo
	private String endtPrevPolicyNo;
	@JsonProperty("EndtPrevQuoteNo") // EndtPrevQuoteNo
	private String endtPrevQuoteNo;
	@JsonProperty("EndtCount") // EndtCount
	private BigDecimal endtCount;
	@JsonProperty("EndtStatus") // EndtStatus
	private String endtStatus;
	@JsonProperty("IsFinanceEndt") // IsFinanceEndt
	private String isFinaceYn;
	@JsonProperty("EndtCategoryDesc") // EndtCategoryDesc
	private String endtCategDesc;

	@JsonProperty("EndorsementType") // EndorsementType
	private Integer endorsementType;

	@JsonProperty("EndorsementTypeDesc") // EndorsementTypeDesc
	private String endorsementTypeDesc;

	@JsonProperty("EndorsementYn")
	private String endorsementYn;

	@JsonProperty("TiraCoverNoteNo")
	private String tiraCoverNoteNo;

	@JsonProperty("CustomerName")
	private String customerName;

	@JsonProperty("TiraBodyType")
	private String tiraBodyType;
	@JsonProperty("TiraMotorUsage")
	private String tiraMotorUsage;

	@JsonProperty("OwnerName")
	private String ownerName;

	@JsonProperty("ResOwnerName")
	private String resOwnerName;

	@JsonProperty("CarAlarmYn")
	private String carAlarmYn;

	@JsonProperty("VehicleClass")
	private String vehicleClass;

	@JsonProperty("ClaimType")
	private String claimType;

	@JsonProperty("ClaimTypeDesc")
	private String claimTypeDesc;

	@JsonProperty("VehicleValueType")
	private String vehicleValueType;

	@JsonProperty("VehicleValueTypeDesc")
	private String vehicleValueTypeDesc;

	@JsonProperty("Inflation")
	private String inflation;

	@JsonProperty("Ncb")
	private String ncb;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@JsonProperty("PurchaseDate")
	private Date purchaseDate;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@JsonProperty("RegistrationDate")
	private Date registrationDate;

	@JsonProperty("ExcessLimit")
	private String excessLimit;

	@JsonProperty("Deductibles")
	private String excess;

	@JsonProperty("ExcessDesc") // Deductibles Description
	private String excessDesc;

	@JsonProperty("DefenceValue")
	private String defenceValue;

	@JsonProperty("DefenceValueDesc")
	private String defenceValueDesc;

	@JsonProperty("PolicyRenewalYn")
	private String custRenewalYn;

	@JsonProperty("InflationSumInsured")
	private BigDecimal inflationSumInsured;

	@JsonProperty("Mileage")
	private Integer mileage;

	@JsonProperty("NoOfTrailers")
	private Integer noOfTrailers;

	@JsonProperty("NoOfPassengers")
	private Integer noOfPassengers;

	@JsonProperty("NoOfClaimYears")
	private Integer noClaimYears;

	@JsonProperty("PreviousInsuranceYN")
	private String previousInsuranceYN;

	@JsonProperty("PreviousLossRatio")
	private Double previousLossRatio;

	@JsonProperty("HorsePower")
	private String horsePower;

	@JsonProperty("NewValue")
	private Integer newValue;

	@JsonProperty("MarketValue")
	private Integer marketValue;

	@JsonProperty("AggregatedValue")
	private Integer aggregatedValue;

	@JsonProperty("MunicipalityTraffic")
	private String municipalityTraffic;

	@JsonProperty("TransportHydro")
	private String transportHydro;

	@JsonProperty("NumberOfCards")
	private Integer noOfCards;

	@JsonProperty("DisplacementInCM3")
	private String displacementInCM3;

	@JsonProperty("NumberOfCylinders")
	private Integer noOfCylinders;

	
	@JsonProperty("PaCoverId")
	private String paCoverId;
	
	@JsonProperty("BankingDelegation")
	private String bankingDelegation;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("LoanStartDate")
	private Date loanStartDate;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("LoanEndDate")
	private Date loanEndDate;
  
	
	@JsonProperty("CollateralCompanyAddress")
	private String collateralCompanyAddress;
	
	@JsonProperty("CollateralCompanyName")
	private String collateralCompanyName;
	
	@JsonProperty("LoanAmount")
	private Double LoanAmount;
	
	@JsonProperty("VehicleTypeIvr")
	private String vehicleTypeIvr;
	
	
	@JsonProperty("UsageId")
	private String UsageId;
	
	@JsonProperty("ZoneCirculation")
	private String zoneCirculation;
	

	@JsonProperty("VehicleTypeDescLocal")
	private String vehicleTypeDescLocal;
	
	@JsonProperty("VehiclemakeDescLocal")
	private String vehicleMakeDescLocal;

	@JsonProperty("Class")
	private String classType;
	
	@JsonProperty("Zone")
	private String zone;
	
	@JsonProperty("PlateType") 
    private String plateType;
	
	@JsonProperty("QuoteExpiryDays")
	private Integer quoteExpiryDays;
}
