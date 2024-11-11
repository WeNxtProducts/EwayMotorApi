package com.maan.eway.common.res;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AllRiskDetailsRes {
	
	@JsonProperty("RequestReferenceNo")
    private String     requestReferenceNo ;
	
	@JsonProperty("RiskId")
    private String    riskId   ;
	
	@JsonProperty("SectionId")
    private String sectionId    ;
	
	@JsonProperty("InsuranceId")
    private String insuranceId;
	
	@JsonProperty("ProductId")
    private String productId;
	
	@JsonProperty("AllriskSumInsured")
	private String allriskSuminsured;
	
	@JsonProperty("MiningPlantSi")
	private String miningPlantSi;
	
	@JsonProperty("NonminingPlantSi")
	private String nonminingPlantSi;
	
	@JsonProperty("GensetsSi")
	private String gensetsSi;
	
	@JsonProperty("EquipmentSi")
	private String equipmentSi;
	
	@JsonProperty("CreatedBy")
	private String createdBy;

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
	private String endtCount;
	@JsonProperty("EndtStatus") // EndtStatus
	private String endtStatus;
	@JsonProperty("IsFinanceEndt") // IsFinanceEndt
	private String isFinaceYn;
	@JsonProperty("EndtCategoryDesc") // EndtCategoryDesc
	private String endtCategDesc;
	@JsonProperty("EndorsementType") // EndorsementType
	private String endorsementType;

	@JsonProperty("EndorsementTypeDesc") // EndorsementTypeDesc
	private String endorsementTypeDesc;
}
