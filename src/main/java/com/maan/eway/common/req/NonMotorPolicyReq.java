package com.maan.eway.common.req;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class NonMotorPolicyReq {
	// Save or Proceed Flag key
	@JsonProperty("SaveOrSubmit")
	private String saveOrSubmit;
	@JsonProperty("RequestReferenceNo")
	private String requestReferenceNo;
	@JsonProperty("CustomerReferenceNo")
	private String customerReferenceNo;
	@JsonProperty("ProductId")
	private String productId;
	@JsonProperty("InsuranceId")
	private String companyId;
	@JsonProperty("Status")
	private String status;
	@JsonProperty("BranchCode")
	private String branchCode;
	@JsonProperty("Createdby")
	private String createdBy;
	@JsonProperty("AcexecutiveId")
	private String acExecutiveId;
	@JsonProperty("IndustryId")
	private String industryId;
	@JsonProperty("TiraCoverNoteNo")
	private String tiraCoverNoteNo;
	@JsonProperty("IndustryDesc")
	private String industryDesc;
	@JsonFormat(pattern = "dd/MM/yyyy")
	@JsonProperty("PolicyStartDate")
    private Date       policyStartDate ;
	@JsonFormat(pattern = "dd/MM/yyyy")
	@JsonProperty("PolicyEndDate")
    private Date       policyEndDate ;
	@JsonProperty("Currency")
    private String     currency     ;
	@JsonProperty("ExchangeRate")
    private String     exchangeRate ;
	@JsonProperty("Havepromocode")
    private String     havepromocode;
	@JsonProperty("Promocode")
    private String     promocode;

}
