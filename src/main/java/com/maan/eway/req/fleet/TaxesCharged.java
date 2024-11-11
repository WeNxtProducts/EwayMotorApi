package com.maan.eway.req.fleet;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.jackson.Jacksonized;

@Data
@NoArgsConstructor
//@XmlRootElement(name="TaxesCharged")
@ToString
@Jacksonized
@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
@Builder
public class TaxesCharged {
 
   @JsonProperty("TaxCharged") 
   @XmlElement(name = "TaxCharged")
   private List<TaxCharged> taxChargedBean ;

}
