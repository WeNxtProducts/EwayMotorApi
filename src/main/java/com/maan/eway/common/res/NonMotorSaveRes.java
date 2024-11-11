package com.maan.eway.common.res;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class NonMotorSaveRes {

	//Common Details
	@JsonProperty("PolicyDetails")
    private NonMotorPolicyRes     nonMotorPolicyRes ;
	//BrokerDetails
	@JsonProperty("BrokerDetails")
    private NonMotorBrokerRes     nonMotorBrokerRes ;
	//EndtFields
    @JsonProperty("EndorsementDetails") 
    private NonMotEndtRes     nonMotEndtRes ;   
	// Location Based
	@JsonProperty("LocationList")
	private List<NonMotorLocRes> locationList;
}
