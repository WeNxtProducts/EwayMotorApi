package com.maan.eway.common.req;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AdditionalValidationReq {

	   @JsonProperty("QuoteNo")
	   private String     quoteNo ;
	   
	   @JsonProperty("RequestReferenceNo")
	   private String     requestreferenceno ;

}
