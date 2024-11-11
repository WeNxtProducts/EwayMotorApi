package com.maan.eway.res;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Data
public class SuccessRes1 {
	@JsonProperty("Response")
	private String response;

	@JsonProperty("SuccessId")
	private String successId;
	
	@JsonProperty("Vehicle")
	private MotorVehicleInfoRes vehicle;

}
