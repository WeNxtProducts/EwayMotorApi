package com.maan.eway.res;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ErrorDescListRes {

	@JsonProperty("ErrorCode")
	private String errorCode;
	

//	@JsonProperty("ErrorField")
//	private String errorField;

	
	@JsonProperty("ErrorDesc")
	private String errorDesc;
	
	@JsonProperty("ErrorField")
	private String errorField;
	
	@JsonProperty("BranchCode")
	private String branchCode;
	
	@JsonProperty("ErrorFieldLocal")
	private String errorFieldLocal;
	
	@JsonProperty("ErrorDescLocal")
	private String errorDescLocal;
	
	
}
