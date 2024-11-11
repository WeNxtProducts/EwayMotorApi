package com.maan.eway.common.res;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class BuildingSectionRes {

	@JsonProperty("SectionId")
	private String sectionId;

	@JsonProperty("SectionName")
	private String sectionName;
	
	@JsonProperty("MotorYn")
	private String motorYn;
	
	@JsonProperty("OccupationId")
	private String occupationId;
	
	@JsonProperty("OriginalRiskId")
	private Integer originalRiskId;
	@JsonProperty("RiskId")
	private Integer riskId;
	
}
