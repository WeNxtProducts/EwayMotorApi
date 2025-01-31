/*
*  Copyright (c) 2019. All right reserved
* Created on 2022-11-18 ( Date ISO 2022-11-18 - Time 11:38:42 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.maan.eway.common.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maan.eway.bean.EserviceBuildingDetails;
import com.maan.eway.common.req.BuildDetailsGetByLocIdReq;
import com.maan.eway.common.req.BuildingSaveReq;
import com.maan.eway.common.req.BuldingDetailsGetReq;
import com.maan.eway.common.req.EserviceMotorDetailsGetReq;
import com.maan.eway.common.req.ExistingBuildingDetailsReq;
import com.maan.eway.common.req.ExistingMotorDetailsReq;
import com.maan.eway.common.res.CommonRes;
import com.maan.eway.common.res.EserviceBuildingSaveRes;
import com.maan.eway.common.res.EserviceCustomerDetailsRes;
import com.maan.eway.common.res.GetAllBuldingDetailsRes;
import com.maan.eway.common.res.GetBuildingDetailsRes;
import com.maan.eway.common.res.SuccessRes;
import com.maan.eway.common.service.EserviceBuildingDetailsService;
import com.maan.eway.error.Error;
import com.maan.eway.service.PrintReqService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


/**
* <h2>EserviceBuildingDetailsController</h2>
*/
@RestController
@RequestMapping("/home")
@Api(tags = "ESERVICE BUILDING DETAILS", description = "API's")
public class EserviceBuildingDetailsController {

	@Autowired
	private  EserviceBuildingDetailsService entityService;


	@Autowired
	private PrintReqService reqPrinter;
/*
	private static final String ENTITY_TITLE = "EserviceBuildingDetails";


 	public EserviceBuildingDetailsController (EserviceBuildingDetailsService entityService) {
		this.entityService = entityService;
	}
*/
	@PreAuthorize("hasAnyRole('ROLE_APPROVER','ROLE_USER')")
	@PostMapping(value = "/savebuildingdetails")
	@ApiOperation(value = "This method is Insert Bulding Details")
	public ResponseEntity<CommonRes> saveBuildingDetails(@RequestBody  BuildingSaveReq req) {
		reqPrinter.reqPrint(req);
		CommonRes data = new CommonRes();
		List<Error> validation = entityService.validateBuildingDetails(req);
		//// validation
		if (validation != null && validation.size() != 0) {
			data.setCommonResponse(null);
			data.setIsError(true);
			data.setErrorMessage(validation);
			data.setMessage("Failed");
			return new ResponseEntity<CommonRes>(data, HttpStatus.OK);

		} else {
			/////// save
			List<EserviceBuildingSaveRes> res = entityService.saveBuildingDetails(req);
			data.setCommonResponse(res);
			data.setIsError(false);
			data.setErrorMessage(Collections.emptyList());
			data.setMessage("Success");
			if (res != null) {
				return new ResponseEntity<CommonRes>(data, HttpStatus.CREATED);
			} else {
				return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			}
		}
    }
	
	@PreAuthorize("hasAnyRole('ROLE_APPROVER','ROLE_USER')")
	@PostMapping("/getbuildingbylocationid")
	@ApiOperation(value = "This method is Get Locationwise Bulding Details")
	public ResponseEntity<CommonRes> getBuildingDetailsByLocationId(@RequestBody  BuildDetailsGetByLocIdReq req) {
		reqPrinter.reqPrint(req);
		CommonRes data = new CommonRes();
		GetBuildingDetailsRes res = entityService.getBuildingDetailsByLocationId(req);
			data.setCommonResponse(res);
			data.setIsError(false);
			data.setErrorMessage(Collections.emptyList());
			data.setMessage("Success");
			if (res != null) {
				return new ResponseEntity<CommonRes>(data, HttpStatus.CREATED);
			} else {
				return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			}
		}

	@PreAuthorize("hasAnyRole('ROLE_APPROVER','ROLE_USER')")
	@PostMapping("/getbuildingdetails")
	@ApiOperation(value = "This method is Get Bulding Details")
	public ResponseEntity<CommonRes> getBuildingDetailsByRefNo(@RequestBody  BuldingDetailsGetReq req) {
		reqPrinter.reqPrint(req);
		CommonRes data = new CommonRes();
		List<GetBuildingDetailsRes> res = entityService.getBuildingDetailsByRefNo(req);
			data.setCommonResponse(res);
			data.setIsError(false);
			data.setErrorMessage(Collections.emptyList());
			data.setMessage("Success");
			if (res != null) {
				return new ResponseEntity<CommonRes>(data, HttpStatus.CREATED);
			} else {
				return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			}
		}
	

	@PreAuthorize("hasAnyRole('ROLE_APPROVER','ROLE_USER')")
	@PostMapping("/deletebuildingbylocid")
	@ApiOperation(value = "This method is Delete Locationwise Building Details")
	public ResponseEntity<CommonRes> deleteBuidingDetailsByLocId(@RequestBody  BuildDetailsGetByLocIdReq req) {
		reqPrinter.reqPrint(req);
		CommonRes data = new CommonRes();
		SuccessRes res = entityService.deleteBuidingDetailsByLocId(req);
			data.setCommonResponse(res);
			data.setIsError(false);
			data.setErrorMessage(Collections.emptyList());
			data.setMessage("Success");
			if (res != null) {
				return new ResponseEntity<CommonRes>(data, HttpStatus.CREATED);
			} else {
				return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			}
		}
	
	@PreAuthorize("hasAnyRole('ROLE_APPROVER','ROLE_USER')")
	@PostMapping("/existingquotedetails")
	@ApiOperation(value = "This method is Get Existing Building Details")
	public ResponseEntity<CommonRes> getallExistingQuoteDetails(@RequestBody  ExistingBuildingDetailsReq req) {
		reqPrinter.reqPrint(req);
		CommonRes data = new CommonRes();
		List<GetAllBuldingDetailsRes> res = entityService.getallExistingQuoteDetails(req);
			data.setCommonResponse(res);
			data.setIsError(false);
			data.setErrorMessage(Collections.emptyList());
			data.setMessage("Success");
			if (res != null) {
				return new ResponseEntity<CommonRes>(data, HttpStatus.CREATED);
			} else {
				return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			}
	}
	/*
    @GetMapping(value = "/getbuildingdetails")
    public ResponseEntity<List<EserviceBuildingDetails>> getAllEserviceBuildingDetails() {
        List<EserviceBuildingDetails> lst = entityService.getAll();

        return new ResponseEntity<>(lst,HttpStatus.OK);
    }
    
    GetAllBuldingDetailsRes
    
    GetBuildingDetailsRes */
/*
        @GetMapping(value = "/eservicebuildingdetails/{id}")
    public ResponseEntity<EserviceBuildingDetails> getOneEserviceBuildingDetails(@PathVariable("id") long id) {

            EserviceBuildingDetails e = entityService.getOne(id);
            if (e == null) {
            	return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(e, HttpStatus.OK);
    }

*/

}
