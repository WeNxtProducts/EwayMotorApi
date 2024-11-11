package com.maan.eway.common.res;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PremiaTiraRes {

	@JsonProperty("TiraCode")
	private String tiraCode;
	
	@JsonProperty("TiraDesc")
	private String tiraDesc;
	
}
