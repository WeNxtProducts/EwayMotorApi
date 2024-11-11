package com.maan.eway.common.req;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class NonMotorSaveReq {

	//Common Details
	@JsonProperty("PolicyDetails")
    private NonMotorPolicyReq     nonMotorPolicyReq ;
	//BrokerDetails
	@JsonProperty("BrokerDetails")
    private NonMotorBrokerReq     nonMotorBrokerReq ;
	//EndtFields
    @JsonProperty("EndorsementDetails") 
    private NonMotEndtReq     nonMotEndtReq ;   
	// Location Based
	@JsonProperty("LocationList")
	private List<NonMotorLocationReq> locationList;
}
