package com.maan.eway.res;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@XmlRootElement
@JsonDeserialize
public class DropDownRes {

	/**
	 * 
	 */
	 
	@JsonProperty("Code")
	private String code;
	@JsonProperty("CodeDesc")
	private String codeDesc;
	@JsonProperty("Status")
	private String status;
	
}
