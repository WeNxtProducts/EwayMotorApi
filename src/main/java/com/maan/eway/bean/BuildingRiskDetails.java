/* 
*  Copyright (c) 2019. All right reserved
 * Created on 2024-06-19 ( Date ISO 2024-06-19 - Time 16:50:51 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */

/*
 * Created on 2024-06-19 ( 16:50:51 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.3.0
 */

package com.maan.eway.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Domain class for entity "BuildingRiskDetails"
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
@IdClass(BuildingRiskDetailsId.class)
@Table(name = "building_risk_details")

public class BuildingRiskDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	// --- ENTITY PRIMARY KEY
	@Id
	@Column(name = "QUOTE_NO", nullable = false, length = 20)
	private String quoteNo;

	@Id
	@Column(name = "REQUEST_REFERENCE_NO", nullable = false, length = 20)
	private String requestReferenceNo;

	@Id
	@Column(name = "RISK_ID", nullable = false)
	private Integer riskId;

	@Id
	@Column(name = "SECTION_ID", nullable = false, length = 20)
	private String sectionId;

	// --- ENTITY DATA FIELDS
	@Column(name = "DOMESTIC_PACKAGE_YN", length = 20)
	private String domesticPackageYn;

	@Column(name = "PRODUCT_ID", length = 20)
	private String productId;

	@Column(name = "PRODUCT_DESC", length = 100)
	private String productDesc;

	@Column(name = "SECTION_DESC", length = 100)
	private String sectionDesc;

	@Column(name = "COMPANY_ID", length = 20)
	private String companyId;

	@Column(name = "COMPANY_NAME", length = 100)
	private String companyName;

	@Column(name = "BRANCH_CODE", length = 20)
	private String branchCode;

	@Column(name = "BRANCH_NAME", length = 100)
	private String branchName;

	@Column(name = "INBUILD_CONSTRUCT_TYPE", length = 20)
	private String inbuildConstructType;

	@Column(name = "BUILDING_FLOORS")
	private Integer buildingFloors;

	@Column(name = "OUTBUILD_CONSTRUCT_TYPE", length = 20)
	private String outbuildConstructType;

	@Column(name = "BUILDING_USAGE_YN", length = 2)
	private String buildingUsageYn;

	@Column(name = "BUILDING_USAGE_ID", length = 100)
	private String buildingUsageId;

	@Column(name = "BUILDING_USAGE_DESC", length = 100)
	private String buildingUsageDesc;

	@Column(name = "BUILDING_PURPOSE_ID", length = 100)
	private String buildingPurposeId;

	@Column(name = "BUILDING_PURPOSE", length = 100)
	private String buildingPurpose;

	@Column(name = "BUILDING_OWNER_YN", length = 20)
	private String buildingOwnerYn;

	@Column(name = "BUILDING_TYPE", length = 100)
	private String buildingType;

	@Column(name = "BUILDING_OCCUPATION_TYPE", length = 100)
	private String buildingOccupationType;

	@Column(name = "APARTMENT_OR_BORDER", length = 200)
	private String apartmentOrBorder;

	@Column(name = "WITHOUT_INHABITANT_DAYS")
	private Integer withoutInhabitantDays;

	@Column(name = "BUILDING_CONDITION", length = 100)
	private String buildingCondition;

	@Column(name = "BUILDING_BUILD_YEAR")
	private Integer buildingBuildYear;

	@Column(name = "BUILDING_AGE")
	private Integer buildingAge;

	@Column(name = "BUILDING_AREA_SQM")
	private BigDecimal buildingAreaSqm;

	@Column(name = "BUILDING_SUMINSURED")
	private BigDecimal buildingSuminsured;

	@Column(name = "ALLRISK_SUMINSURED")
	private BigDecimal allriskSuminsured;

	@Column(name = "PERSONAL_ACC_SUMINSURED")
	private BigDecimal personalAccSuminsured;

	@Column(name = "CONTENT_SUMINSURED")
	private BigDecimal contentSuminsured;

	@Column(name = "WORKMEN_COMP_SUMINSURED")
	private BigDecimal workmenCompSuminsured;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ENTRY_DATE")
	private Date entryDate;

	@Column(name = "CREATED_BY", length = 100)
	private String createdBy;

	@Column(name = "STATUS", length = 2)
	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DATE")
	private Date updatedDate;

	@Column(name = "UPDATED_BY", length = 100)
	private String updatedBy;

	@Column(name = "CUSTOMER_ID", length = 20)
	private String customerId;

	@Column(name = "AC_EXECUTIVE_ID")
	private Integer acExecutiveId;

	@Column(name = "APPLICATION_ID", length = 20)
	private String applicationId;

	@Column(name = "BROKER_CODE", length = 20)
	private String brokerCode;

	@Column(name = "SUB_USER_TYPE", length = 20)
	private String subUserType;

	@Column(name = "LOGIN_ID", length = 100)
	private String loginId;

	@Column(name = "AGENCY_CODE", length = 20)
	private String agencyCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "POLICY_START_DATE")
	private Date policyStartDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "POLICY_END_DATE")
	private Date policyEndDate;

	@Column(name = "POLICY_PERIORD")
	private Integer policyPeriord;

	@Column(name = "CURRENCY", length = 20)
	private String currency;

	@Column(name = "EXCHANGE_RATE")
	private BigDecimal exchangeRate;

	@Column(name = "ADMIN_LOGIN_ID", length = 100)
	private String adminLoginId;

	@Column(name = "ADMIN_REMARKS", length = 100)
	private String adminRemarks;

	@Column(name = "REJECT_REASON", length = 100)
	private String rejectReason;

	@Column(name = "Referal_Remarks", length = 500)
	private String referalRemarks;

	@Column(name = "ACTUAL_PREMIUM_FC")
	private BigDecimal actualPremiumFc;

	@Column(name = "ACTUAL_PREMIUM_LC")
	private BigDecimal actualPremiumLc;

	@Column(name = "OVERALL_PREMIUM_FC")
	private BigDecimal overallPremiumFc;

	@Column(name = "OVERALL_PREMIUM_LC")
	private BigDecimal overallPremiumLc;

	@Column(name = "OLD_REQ_REF_NO", length = 100)
	private String oldReqRefNo;

	@Column(name = "BROKER_BRANCH_CODE", length = 20)
	private String brokerBranchCode;

	@Column(name = "BROKER_BRANCH_NAME", length = 100)
	private String brokerBranchName;

	@Column(name = "COMMISSION_TYPE", length = 20)
	private String commissionType;

	@Column(name = "COMMISSION_TYPE_DESC", length = 100)
	private String commissionTypeDesc;

	@Column(name = "HAVEPROMOCODE", length = 10)
	private String havepromocode;

	@Column(name = "PROMOCODE", length = 100)
	private String promocode;

	@Column(name = "INSURANCE_TYPE", length = 100)
	private String insuranceType;

	@Column(name = "OCCUPATION_TYPE", length = 20)
	private String occupationType;

	@Column(name = "OCCUPATION_TYPE_DESC", length = 100)
	private String occupationTypeDesc;

	@Column(name = "CATEGORY_ID", length = 20)
	private String categoryId;

	@Column(name = "CATEGORY_DESC", length = 100)
	private String categoryDesc;

	@Column(name = "POLICY_NO", length = 100)
	private String policyNo;

	@Column(name = "BANK_CODE", length = 100)
	private String bankCode;

	@Column(name = "SOURCE_TYPE", length = 100)
	private String sourceType;

	@Column(name = "BDM_CODE", length = 100)
	private String bdmCode;

	@Column(name = "CUSTOMER_CODE", length = 100)
	private String customerCode;

	@Column(name = "MANUAL_REFERAL_YN", length = 100)
	private String manualReferalYn;

	@Column(name = "ELEC_EQUIP_SUMINSURED")
	private Long elecEquipSuminsured;

	@Column(name = "GOODS_SINGLECARRY_SUMINSURED")
	private Long goodsSinglecarrySuminsured;

	@Column(name = "GOODS_TURNOVER_SUMINSURED")
	private Long goodsTurnoverSuminsured;

	@Column(name = "INDUSTRY_ID")
	private Integer industryId;

	@Column(name = "INDUSTRY_DESC", length = 100)
	private String industryDesc;

	@Column(name = "ENDORSEMENT_TYPE")
	private Integer endorsementType;

	@Column(name = "ENDORSEMENT_TYPE_DESC", length = 100)
	private String endorsementTypeDesc;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ENDORSEMENT_DATE")
	private Date endorsementDate;

	@Column(name = "ENDORSEMENT_REMARKS", length = 1000)
	private String endorsementRemarks;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ENDORSEMENT_EFFDATE")
	private Date endorsementEffdate;

	@Column(name = "ORIGINAL_POLICY_NO", length = 100)
	private String originalPolicyNo;

	@Column(name = "ENDT_PREV_POLICY_NO", length = 100)
	private String endtPrevPolicyNo;

	@Column(name = "ENDT_PREV_QUOTE_NO", length = 100)
	private String endtPrevQuoteNo;

	@Column(name = "ENDT_COUNT")
	private BigDecimal endtCount;

	@Column(name = "ENDT_STATUS", length = 10)
	private String endtStatus;

	@Column(name = "IS_FINYN", length = 10)
	private String isFinyn;

	@Column(name = "ENDT_CATEG_DESC", length = 100)
	private String endtCategDesc;

	@Column(name = "ENDT_PREMIUM")
	private BigDecimal endtPremium;

	@Column(name = "WALL_TYPE", length = 20)
	private String wallType;

	@Column(name = "WALL_TYPE_DESC", length = 100)
	private String wallTypeDesc;

	@Column(name = "ROOF_TYPE", length = 20)
	private String roofType;

	@Column(name = "ROOF_TYPE_DESC", length = 100)
	private String roofTypeDesc;

	@Column(name = "NATURE_OF_TRADE_ID")
	private Integer natureOfTradeId;

	@Column(name = "NATURE_OF_TRADE_DESC", length = 100)
	private String natureOfTradeDesc;

	@Column(name = "INSURANCE_FOR_ID", length = 100)
	private String insuranceForId;

	@Column(name = "INSURANCE_FOR_DESC", length = 100)
	private String insuranceForDesc;

	@Column(name = "INTERNAL_WALL_TYPE")
	private Integer internalWallType;

	@Column(name = "INTERNAL_WALL_DESC", length = 100)
	private String internalWallDesc;

	@Column(name = "CEILING_TYPE")
	private Integer ceilingType;

	@Column(name = "CEILING_TYPE_DESC", length = 100)
	private String ceilingTypeDesc;

	@Column(name = "STOCK_IN_TRADE_SI")
	private BigDecimal stockInTradeSi;

	@Column(name = "GOODS_SI")
	private BigDecimal goodsSi;

	@Column(name = "FURNITURE_SI")
	private BigDecimal furnitureSi;

	@Column(name = "APPLIANCE_SI")
	private BigDecimal applianceSi;

	@Column(name = "CASH_VALUEABLES_SI")
	private BigDecimal cashValueablesSi;

	@Column(name = "ADDRESS", length = 300)
	private String address;

	@Column(name = "REGION_CODE", length = 20)
	private String regionCode;

	@Column(name = "REGION_DESC", length = 100)
	private String regionDesc;

	@Column(name = "DISTRICT_CODE", length = 20)
	private String districtCode;

	@Column(name = "DISTRICT_DESC", length = 100)
	private String districtDesc;

	@Column(name = "OCCUPIED_YEAR")
	private Integer occupiedYear;

	@Column(name = "SHOW_WINDOWS")
	private Integer showWindows;

	@Column(name = "FRONT_DOORS")
	private Integer frontDoors;

	@Column(name = "BACK_DOORS")
	private Integer backDoors;

	@Column(name = "WINDOWS_MATERIAL_ID")
	private Integer windowsMaterialId;

	@Column(name = "WINDOWS_MATERIAL_DESC", length = 100)
	private String windowsMaterialDesc;

	@Column(name = "DOORS_MATERIAL_ID")
	private Integer doorsMaterialId;

	@Column(name = "DOORS_MATERIAL_DESC", length = 100)
	private String doorsMaterialDesc;

	@Column(name = "NIGHT_LEFT_DOOR")
	private Integer nightLeftDoor;

	@Column(name = "NIGHT_LEFT_DOOR_DESC", length = 100)
	private String nightLeftDoorDesc;

	@Column(name = "BUILDING_OCCUPIED")
	private Integer buildingOccupied;

	@Column(name = "BUILDING_OCCUPIED_DESC", length = 100)
	private String buildingOccupiedDesc;

	@Column(name = "WATCHMAN_GUARD_HOURS")
	private Integer watchmanGuardHours;

	@Column(name = "ACCESSIBLE_WINDOWS_DESC", length = 100)
	private String accessibleWindowsDesc;

	@Column(name = "ACCESSIBLE_WINDOWS")
	private Integer accessibleWindows;

	@Column(name = "TRAP_DOORS")
	private Integer trapDoors;

	@Column(name = "REVENUE_FROM_STAMPS")
	private BigDecimal revenueFromStamps;

	@Column(name = "MACHINE_EQUIP_SI")
	private BigDecimal machineEquipSi;

	@Column(name = "PLATE_GLASS_SI")
	private BigDecimal plateGlassSi;

	@Column(name = "ACC_DAMAGE_SI")
	private BigDecimal accDamageSi;

	@Column(name = "FIRST_LOSS_PERCENT")
	private Long firstLossPercent;

	@Column(name = "POWER_PLANT_SI")
	private BigDecimal powerPlantSi;

	@Column(name = "ELEC_MACHINES_SI")
	private BigDecimal elecMachinesSi;

	@Column(name = "EQUIPMENT_SI")
	private BigDecimal equipmentSi;

	@Column(name = "GENERAL_MACHINE_SI")
	private BigDecimal generalMachineSi;

	@Column(name = "MANU_UNITS_SI")
	private BigDecimal manuUnitsSi;

	@Column(name = "BOILER_PLANTS_SI")
	private BigDecimal boilerPlantsSi;

	@Column(name = "TIRA_COVER_NOTE_NO", length = 100)
	private String tiraCoverNoteNo;

	@Column(name = "MAKUTI_YN", length = 10)
	private String makutiYn;

	@Column(name = "INDEMITY_PERIOD", length = 10)
	private String indemityPeriod;

	@Column(name = "INDEMITY_PERIOD_DESC", length = 100)
	private String indemityPeriodDesc;

	@Column(name = "PLATE_GLASS_TYPE", length = 10)
	private String plateGlassType;

	@Column(name = "PLATE_GLASS_DESC", length = 100)
	private String plateGlassDesc;

	@Column(name = "MINING_PLANT_SI")
	private BigDecimal miningPlantSi;

	@Column(name = "NONMINING_PLANT_SI")
	private BigDecimal nonminingPlantSi;

	@Column(name = "GENSETS_SI")
	private BigDecimal gensetsSi;

	@Column(name = "COMMISSION_PERCENTAGE")
	private BigDecimal commissionPercentage;

	@Column(name = "VAT_COMMISSION")
	private BigDecimal vatCommission;

	@Column(name = "BUILDING_SUMINSURED_LC")
	private BigDecimal buildingSuminsuredLc;

	@Column(name = "ALLRISK_SUMINSURED_LC")
	private BigDecimal allriskSuminsuredLc;

	@Column(name = "CONTENT_SUMINSURED_LC")
	private BigDecimal contentSuminsuredLc;

	@Column(name = "ELEC_EQUIP_SUMINSURED_LC")
	private BigDecimal elecEquipSuminsuredLc;

	@Column(name = "GOODS_SINGLECARRY_SUMINSURED_LC")
	private BigDecimal goodsSinglecarrySuminsuredLc;

	@Column(name = "GOODS_TURNOVER_SUMINSURED_LC")
	private BigDecimal goodsTurnoverSuminsuredLc;

	@Column(name = "STOCK_IN_TRADE_SI_LC")
	private BigDecimal stockInTradeSiLc;

	@Column(name = "GOODS_SI_LC")
	private BigDecimal goodsSiLc;

	@Column(name = "FURNITURE_SI_LC")
	private BigDecimal furnitureSiLc;

	@Column(name = "APPLIANCE_SI_LC")
	private BigDecimal applianceSiLc;

	@Column(name = "CASH_VALUEABLES_SI_LC")
	private BigDecimal cashValueablesSiLc;

	@Column(name = "MACHINE_EQUIP_SI_LC")
	private BigDecimal machineEquipSiLc;

	@Column(name = "PLATE_GLASS_SI_LC")
	private BigDecimal plateGlassSiLc;

	@Column(name = "POWER_PLANT_SI_LC")
	private BigDecimal powerPlantSiLc;

	@Column(name = "ELEC_MACHINES_SI_LC")
	private BigDecimal elecMachinesSiLc;

	@Column(name = "EQUIPMENT_SI_LC")
	private BigDecimal equipmentSiLc;

	@Column(name = "GENERAL_MACHINE_SI_LC")
	private BigDecimal generalMachineSiLc;

	@Column(name = "MANU_UNITS_SI_LC")
	private BigDecimal manuUnitsSiLc;

	@Column(name = "BOILER_PLANTS_SI_LC")
	private BigDecimal boilerPlantsSiLc;

	@Column(name = "MINING_PLANT_SI_LC")
	private BigDecimal miningPlantSiLc;

	@Column(name = "NONMINING_PLANT_SI_LC")
	private BigDecimal nonminingPlantSiLc;

	@Column(name = "GENSETS_SI_LC")
	private BigDecimal gensetsSiLc;

	@Column(name = "CD_REFNO")
	private Long cdRefno;

	@Column(name = "VD_REFNO")
	private Long vdRefno;

	@Column(name = "MS_REFNO")
	private Long msRefno;

	@Column(name = "MONEY_SAFE_LIMIT")
	private BigDecimal moneySafeLimit;

	@Column(name = "MONEY_SAFE_LIMIT_LC")
	private BigDecimal moneySafeLimitLc;

	@Column(name = "MONEY_OUTOF_SAFE")
	private BigDecimal moneyOutofSafe;

	@Column(name = "MONEY_OUTOF_SAFE_LC")
	private BigDecimal moneyOutofSafeLc;

	@Column(name = "MONEY_DIRECTOR_RESIDENCE")
	private BigDecimal moneyDirectorResidence;

	@Column(name = "MONEY_DIRECTOR_RESIDENCE_LC")
	private BigDecimal moneyDirectorResidenceLc;

	@Column(name = "MONEY_COLLECTOR")
	private BigDecimal moneyCollector;

	@Column(name = "MONEY_COLLECTOR_LC")
	private BigDecimal moneyCollectorLc;

	@Column(name = "MONEY_ANNUAL_ESTIMATE")
	private BigDecimal moneyAnnualEstimate;

	@Column(name = "MONEY_ANNUAL_ESTIMATE_LC")
	private BigDecimal moneyAnnualEstimateLc;

	@Column(name = "MONEY_MAJOR_LOSS")
	private BigDecimal moneyMajorLoss;

	@Column(name = "MONEY_MAJOR_LOSS_LC")
	private BigDecimal moneyMajorLossLc;

	@Column(name = "CUSTOMER_NAME", length = 100)
	private String customerName;

	@Column(name = "FIRE_PLANT_SI_LC")
	private BigDecimal firePlantSiLc;

	@Column(name = "STOCK_LOSS_PERCENT")
	private BigDecimal stockLossPercent;

	@Column(name = "GOODS_LOSS_PERCENT")
	private BigDecimal goodsLossPercent;

	@Column(name = "FURNITURE_LOSS_PERCENT")
	private BigDecimal furnitureLossPercent;

	@Column(name = "APPLIANCE_LOSS_PERCENT")
	private BigDecimal applianceLossPercent;

	@Column(name = "CASH_VALUEABLES_LOSS_PERCENT")
	private BigDecimal cashValueablesLossPercent;

	@Column(name = "FIRE_PLANT_SI")
	private BigDecimal firePlantSi;

	@Column(name = "WATER_TANK_SI")
	private BigDecimal waterTankSi;

	@Column(name = "WATER_TANK_SI_LC")
	private BigDecimal waterTankSiLc;

	@Column(name = "ARCHITECTS_SI")
	private BigDecimal architectsSi;

	@Column(name = "ARCHITECTS_SI_LC")
	private BigDecimal architectsSiLc;

	@Column(name = "LOSS_OF_RENT_SI")
	private BigDecimal lossOfRentSi;

	@Column(name = "LOSS_OF_RENT_SI_LC")
	private BigDecimal lossOfRentSiLc;

	@Column(name = "JEWELLERY_SI")
	private BigDecimal jewellerySi;

	@Column(name = "JEWELLERY_SI_LC")
	private BigDecimal jewellerySiLc;

	@Column(name = "PAITINGS_SI")
	private BigDecimal paitingsSi;

	@Column(name = "PAITINGS_SI_LC")
	private BigDecimal paitingsSiLc;

	@Column(name = "CARPETS_SI")
	private BigDecimal carpetsSi;

	@Column(name = "CARPETS_SI_LC")
	private BigDecimal carpetsSiLc;

	@Column(name = "TYPE_OF_PROPERTY", length = 100)
	private String typeOfProperty;

	@Column(name = "TYPE_OF_PROPERTY_DESC", length = 100)
	private String typeOfPropertyDesc;

	@Column(name = "SALE_POINT_CODE", length = 200)
	private String salePointCode;

	@Column(name = "FINALIZE_YN", length = 2)
	private String finalizeYn;

	@Column(name = "ON_STOCK_SI")
	private BigDecimal onStockSi;

	@Column(name = "ON_STOCK_SI_LC")
	private BigDecimal onStockSiLc;

	@Column(name = "ON_ASSETS_SI")
	private BigDecimal onAssetsSi;

	@Column(name = "ON_ASSETS_SI_LC")
	private BigDecimal onAssetsSiLc;

	@Column(name = "INDEMNITY_PERIOD_LC")
	private BigDecimal indemnityPeriodLc;

	@Column(name = "INDEMNITY_PERIOD_FC")
	private BigDecimal indemnityPeriodFc;

	@Column(name = "GROSS_PROFIT_LC")
	private BigDecimal grossProfitLc;

	@Column(name = "GROSS_PROFIT_FC")
	private BigDecimal grossProfitFc;

	@Column(name = "BURGLARY_SI")
	private BigDecimal burglarySi;

	@Column(name = "BURGLARY_SI_LC")
	private BigDecimal burglarySiLc;

	@Column(name = "STRONGROOM_SI")
	private BigDecimal strongroomSi;

	@Column(name = "STRONGROOM_SI_LC")
	private BigDecimal strongroomSiLc;

	@Column(name = "MACHINERY_SI")
	private BigDecimal machinerySi;

	@Column(name = "MACHINERY_SI_LC")
	private BigDecimal machinerySiLc;

	@Column(name = "TRANSPORTED_BY", length = 30)
	private String transportedBy;

	@Column(name = "MODE_OF_TRANSPORT", length = 30)
	private String modeOfTransport;

	@Column(name = "GEOGRAPHICAL_COVERAGE", length = 30)
	private String geographicalCoverage;

	@Column(name = "SINGLE_ROAD_SI_LC")
	private BigDecimal singleRoadSiLc;

	@Column(name = "SINGLE_ROAD_SI_FC")
	private BigDecimal singleRoadSiFc;

	@Column(name = "EST_ANNUAL_CARRIES_SI_LC")
	private BigDecimal estAnnualCarriesSiLc;

	@Column(name = "EST_ANNUAL_CARRIES_SI_FC")
	private BigDecimal estAnnualCarriesSiFc;

	@Column(name = "BROKER_TIRA_CODE", length = 100)
	private String brokerTiraCode;

	@Column(name = "SOURCE_TYPE_ID", length = 20)
	private String sourceTypeId;

	@Column(name = "VAT_PREMIUM")
	private BigDecimal vatPremium;

	@Column(name = "ENDT_VAT_PREMIUM")
	private BigDecimal endtVatPremium;

	@Column(name = "OTHER_OCCUPATION", length = 200)
	private String otherOccupation;

	@Column(name = "GROUND_UNDERGROUND_SI")
	private BigDecimal groundUndergroundSi;

	@Column(name = "COVERING_DETAILS")
	private String coveringDetails;

	@Column(name = "DESCRIPTION_OF_RISK")
	private String descriptionOfRisk;

	@Column(name = "BOND_SUMINSURED")
	private BigDecimal bondSuminsured;

	@Column(name = "BOND_TYPE")
	private String bondType;

	@Column(name = "BOND_YEAR")
	private String bondYear;

	@Column(name = "CONTENT_ID")
	private String contentId;

	@Column(name = "CONTENT_DESC")
	private String contentDesc;

	@Column(name = "SERIAL_NO", length = 200)
	private String serialNo;

	@Column(name = "SUM_INSURED")
	private BigDecimal sumInsured;

	@Column(name = "SUM_INSURED_LC")
	private BigDecimal sumInsuredLc;

}
