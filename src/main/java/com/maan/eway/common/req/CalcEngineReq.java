package com.maan.eway.common.req;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.maan.eway.bean.MsVehicleDetails;

import lombok.Data;

@Data
public class CalcEngineReq {

	@JsonProperty("InsuranceId")
	private String insuranceId;
	@JsonProperty("BranchCode")
	private String branchCode;
	@JsonProperty("AgencyCode")
	private String agencyCode;

	@JsonProperty("SectionId")
	private String sectionId;

	@JsonProperty("ProductId")
	private String productId;

	@JsonProperty("MSRefNo")
	private String msrefno;
	@JsonProperty("VehicleId")
	private String vehicleId;

	@JsonProperty("CdRefNo")
	private String cdRefNo;

	@JsonProperty("VdRefNo")
	private String vdRefNo;
	@JsonProperty("CreatedBy")
	private String createdBy;

	@JsonProperty("RequestReferenceNo")
	private String requestReferenceNo;
	@JsonProperty("MsVehicleDetails")
	private MsVehicleDetails msVehicleDetails;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@JsonProperty("EffectiveDate")
	private Date effectiveDate;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@JsonProperty("PolicyEndDate")
	private Date policyEndDate;

	@JsonProperty("CoverModification")
	private String coverModification;

}
