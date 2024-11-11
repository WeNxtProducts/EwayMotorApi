package com.maan.eway.common.req;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Data
public class VehicleDetailsReq {

	
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
