package com.maan.eway.bean;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PremiaConfigMasterId  implements Serializable{

	private static final long serialVersionUID=1L;
	
    private Integer premiaId;
    private String     companyId ;
    private String     productId ;
    private String    sectionId ;
    private String     branchCode ;
    private Integer    amendId ;

}
