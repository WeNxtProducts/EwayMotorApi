package com.maan.eway.common.req;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class NonMotorSectionReq {
	@JsonProperty("RiskId")
	private String riskId;
	@JsonProperty("SectionId")
	private String sectionId;
	@JsonProperty("SectionName")
	private String sectionName;
	@JsonProperty("OccupationId")
	private String occupationId;
	//Common For all Products in Non Motor
	@JsonProperty("SumInsured")
	private String sumInsured;

	// Building Request
	@JsonProperty("BuildingSumInsured")
	private String buildingSumInsured;
	@JsonProperty("OutbuildConstructType")
	private String internalWallType;
	@JsonProperty("WallType")
	private String wallType;
	@JsonProperty("RoofType")
	private String roofType;
	@JsonProperty("BuildingUsageId")
	private String buildingUsageId;
	@JsonProperty("BuildingOwnerYn")
	private String buildingOwnerYn;
	@JsonProperty("BuildingBuildYear")
	private String buildingBuildYear;
	@JsonProperty("WaterTankSi")
	private String waterTankSi;
	@JsonProperty("ArchitectsSi")
	private String architectsSi;
	@JsonProperty("LossOfRentSi")
	private String lossOfRentSi;
	@JsonProperty("TypeOfProperty")
	private String typeOfProperty;
	@JsonProperty("GroundUndergroundSi")
	private String groundUndergroundSi;

	// Content Info
	@JsonProperty("ContentId")
	private String contentId;
	@JsonProperty("ContentDesc")
	private String contentDesc;
	@JsonProperty("LocationName")
	private String locationName;
	@JsonProperty("SerialNo")
	private String serialNo;
	@JsonProperty("Description")
	private String description;

	// Suminsured
	@JsonProperty("ContentSuminsured")
	private String contentSuminsured;
	@JsonProperty("JewellerySi")
	private String jewellerySi;
	@JsonProperty("PaitingsSi")
	private String paitingsSi;
	@JsonProperty("CarpetsSi")
	private String carpetsSi;
	@JsonProperty("ElecEquipSuminsured")
	private String elecEquipSuminsured;
	@JsonProperty("AllriskSumInsured")
	private String allriskSuminsured;
	@JsonProperty("MiningPlantSi")
	private String miningPlantSi;
	@JsonProperty("NonminingPlantSi")
	private String nonminingPlantSi;
	@JsonProperty("GensetsSi")
	private String gensetsSi;

	// Domestic servant type
	@JsonProperty("DomesticServantType")
	private String professionalType;
	@JsonProperty("DomesticServentSi")
	private String domesticServantSi;
	@JsonProperty("Count")
	private String count;
	// PersonalAccident
	@JsonProperty("RelationType")
	private String relationType;
	@JsonProperty("PersonalAccidentSi")
	private String personalAccidentSi;
	
	@JsonProperty("NickName")
	private String     nickName ;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@JsonProperty("dob")
	private Date       dob ;
	// Personal Liability
	@JsonProperty("PersonalLiabilitySi")
	private String personalLiabilitySi;

	@JsonProperty("IndustryId")
	private String industryId;
	// Fire
	@JsonProperty("IndustryType")
	private String industryType;
	@JsonProperty("IndustryTypeDesc")
	private String industrytypedesc;
	@JsonProperty("OccupationDesc")
	private String occupationDesc;
	@JsonProperty("CoveringDetails")
	private String CoveringDetails;
	@JsonProperty("DescriptionOfRisk")
	private String descriptionOfRisk;
	@JsonProperty("RegionName")
	private String regionName;
	@JsonProperty("DistrictName")
	private String districtName;
	@JsonProperty("RegionCode")
	private String regionCode;
	@JsonProperty("DistrictCode")
	private String districtCode;
	@JsonProperty("BusinessInterruption")
	private String businessInterruption;
	@JsonProperty("FirePlantSi")
	private String firePlantSi;
	@JsonProperty("CategoryId")
	private String categoryId;
	@JsonProperty("CategoryDesc")
	private String categoryDesc;
	// Bond
	@JsonProperty("BondType")
	private String bondType;
	@JsonProperty("BondYear")
	private String bondYear;
	@JsonProperty("BondSuminsured")
	private String bondSumInsured;
	// Money
	@JsonProperty("MoneySafeLimit")
	private String moneySafeLimit;
	@JsonProperty("MoneyOutofSafe")
	private String moneyOutofSafe; // Safe Outside Working Hours
	@JsonProperty("StrongroomSi")
	private String strongroomSi;
	@JsonProperty("MoneyDirectorResidence")
	private String moneyDirectorResidence;
	@JsonProperty("MoneyCollector")
	private String moneyCollector;
	@JsonProperty("MoneyAnnualEstimate")
	private String moneyAnnualEstimate;
	@JsonProperty("MoneyMajorLoss")
	private String moneyMajorLoss;
	// tanzaniya
	@JsonProperty("MoneyInTransit")
	private String moneyInTransit;
	@JsonProperty("EstimatedAnnualCarryings")
	private String estimatedAnnualCarryings;
	@JsonProperty("StrongRoom")
	private String strongRoom;
	@JsonProperty("Premises")
	private String premises;
	@JsonProperty("MoneyInSafe")
	private String moneyInSafe;
	// Employers liablity
	@JsonProperty("EmpLiabilitySi")
	private String empLiabilitySi;
	@JsonProperty("TotalNoOfEmployees")
	private String totalNoOfEmployees;
	// Burglary
	@JsonProperty("FirstLossPercentId")
	private String firstLossPercentId;
	@JsonProperty("BurglarySi")
	private String burglarySi;

	//
	@JsonProperty("OtherOccupation")
	private String otherOccupation;
	// Fidelity
	@JsonProperty("FidEmpSi")
	private String fidEmpSi;
	@JsonProperty("FidEmpCount")
	private String fidEmpCount;
	@JsonProperty("FirstLossPayee")
	private String firstLossPayee;

}
