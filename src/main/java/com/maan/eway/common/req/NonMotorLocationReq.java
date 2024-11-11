package com.maan.eway.common.req;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class NonMotorLocationReq {
	@JsonProperty("LocationId")
	private String locationId;
	@JsonProperty("LocationName")
	private String locationName;
	@JsonProperty("CoversRequiredYn")
	private String coversRequiredYn;
	@JsonProperty("Address")
	private String address;
	@JsonProperty("BuildingOwnerYn")
	private String buildingOwnerYn;
	
	// Section Based
	@JsonProperty("SectionList")
	private List<NonMotorSectionReq> sectionList;
}
