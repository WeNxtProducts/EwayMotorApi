package com.maan.eway.common.req;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OtherVehicleInfoReq {
	
	
	@JsonProperty("CompanyId")
	private String companyId;
	
	@JsonProperty("ProductId")
	private String productId;
	
	@JsonProperty("SectionId")
	private String sectionId;
	
	@JsonProperty("QuoteNo")
	private String quoteNo;
	
	@JsonProperty("RequestReferenceNo")
	private String requestReferenceNo;
	
	@JsonProperty("VehicleId")
	private String vehicleId;
	
	@JsonProperty("SeriesNo")
	private String seriesNo;
	
	@JsonProperty("NoCylinder")
	private Integer noCylinder;
	
	@JsonProperty("NoCylinderDes")
	private String noCylinderDesc;
	
	@JsonProperty("PlateType")
	private String plateType;
	
	@JsonProperty("PlateTypeDesc")
	private String platetypedesc;
	
	@JsonProperty("PlateColor")
	private String plateColor;
	
	@JsonProperty("PlateColorId")
	private Integer plateColorId;
	
	
	@JsonProperty("NoDoors")
	private Integer noDoors;
	
	@JsonProperty("NoDoorsDes")
	private String noDoorsDesc;

}
