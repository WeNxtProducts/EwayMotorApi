package com.maan.eway.common.req;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
public class FirstLossPayeeReq {


	@JsonProperty("RiskId")
	private String riskId;
	@JsonProperty("RequestReferenceNo")
	private String requestReferenceNo;
	@JsonProperty("FirstLossPayeeId")
	private String     firstLossPayeeId ;
	@JsonProperty("FirstLossPayeeDesc")
	private String     firstLossPayeeDesc ;
	@JsonProperty("SectionId")
	private String sectionId;
	@JsonProperty("ProductId")
	private String productId;
	@JsonProperty( "LocationId")
	private String locationId;
	@JsonProperty("LocationName")
	private String locationName;
	@JsonProperty( "BranchCode")
	private String branchCode;
	@JsonProperty("CompanyId")
	private String companyId;
	@JsonFormat(pattern = "dd/MM/yyyy")
	@JsonProperty("EntryDate")
	private Date entryDate;
	@JsonProperty("CreatedBy")
	private String createdBy;
	@JsonProperty("Status")
	private String status;

}
