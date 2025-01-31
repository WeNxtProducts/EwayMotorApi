/*
 * Java domain class for entity "EserviceMotorDetails" 
 * Created on 2022-10-17 ( Date ISO 2022-10-17 - Time 11:50:07 )
 * Generated by Telosys Tools Generator ( version 3.3.0 )
 */
package com.maan.eway.common.req;

import java.io.Serializable;

import lombok.*;

 

import com.fasterxml.jackson.annotation.JsonProperty;

 
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EserviceMotorDetailsGetallReq implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("RequestReferenceNo")
    private String     requestReferenceNo ;
    
    @JsonProperty("FinalizeYn")
    private String finalizeYn;
	

}
