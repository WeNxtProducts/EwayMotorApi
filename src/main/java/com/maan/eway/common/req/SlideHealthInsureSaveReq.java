package com.maan.eway.common.req;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SlideHealthInsureSaveReq {

	@JsonProperty("RequestReferenceNo")
    private String     requestReferenceNo ;
		
	@JsonProperty("ProductId")
    private String    productId    ;
	
	@JsonProperty("SectionId")
    private String sectionId    ;
	
	@JsonProperty("InsuranceId")
	private String insuranceId;
	
	@JsonProperty("CreatedBy")
	private String createdBy;
	
	@JsonProperty("RiskId")
    private String    riskId   ;

	@JsonProperty("RelationType")
	private String RelationType;
	
	@JsonFormat(pattern ="dd/MM/yyyy")
	@JsonProperty("DateOfBirth")
	private Date dateOfBirth;
	
	@JsonProperty("NickName")
	private String nickName;
	
	/*
	 * @JsonProperty("FamilyDetails") private List<SlideHIFamilyDetailsReq>
	 * familyDetails ;
	 */
	
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

}
