package com.maan.eway.common.req;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
 

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class FireAndAlliedPerillsSaveReq {
	
	@JsonProperty("RequestReferenceNo")
    private String  requestReferenceNo ;
	
	@JsonProperty("RiskId")
    private String    riskId   ;
	
	@JsonProperty("SectionId")
    private String sectionId    ;
	
	@JsonProperty("InsuranceId")
    private String insuranceId;
	
	@JsonProperty("ProductId")
    private String productId;

	@JsonProperty("CreatedBy")
	private String createdBy;
	
	@JsonProperty("BuildingSuminsured")
	private String BuildingSuminsured;
	
	
	@JsonProperty("IndemityPeriod")
	private String indemityPeriod;
	
	@JsonProperty("MakutiYn")
	private String MakutiYn;
	@JsonProperty("FirePlantSi")
    private String firePlantSi  ;
    @JsonProperty("FireEquipSi")
    private String fireEquipSi  ;
    @JsonProperty("StockInTradeSi")
    private String stockInTradeSi  ;
    
    @JsonProperty("OnStockSi")
    private String onStockSi  ;
    
    @JsonProperty("OnAssetsSi")
    private String onAssetsSi  ;
    
	
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
	@JsonProperty("Status")
	private String status;
	
	
}
