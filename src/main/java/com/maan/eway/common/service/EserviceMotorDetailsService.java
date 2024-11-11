/*
*  Copyright (c) 2019. All right reserved
* Created on 2022-10-11 ( Date ISO 2022-10-11 - Time 15:28:59 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.maan.eway.common.service;
import java.util.List;

import com.maan.eway.common.req.DepreciationReq;
import com.maan.eway.common.req.DriverDetailsGetReq;
import com.maan.eway.common.req.DriverDetailsRes;
import com.maan.eway.common.req.DriverSaveRes;
import com.maan.eway.common.req.EserviceMotorDetailsGetReq;
import com.maan.eway.common.req.EserviceMotorDetailsGetallReq;
import com.maan.eway.common.req.EserviceMotorDetailsSaveReq;

import com.maan.eway.common.req.EserviceMotorDetailsSaveRes;
import com.maan.eway.common.req.EserviceMotorUwReq;
import com.maan.eway.common.req.ExistingMotorDetailsReq;
import com.maan.eway.common.req.FleetDetailsSaveReq;
import com.maan.eway.common.req.MotorDriverSaveReq;
import com.maan.eway.common.req.OtherVehicleInfoGetReq;
import com.maan.eway.common.req.OtherVehicleInfoReq;
import com.maan.eway.common.req.UpdateLapsedQuoteReq;
import com.maan.eway.common.res.CommonRes;
import com.maan.eway.common.res.EserviceCustomerDetailsRes;
import com.maan.eway.common.res.EserviceMotorDetailsRes;
import com.maan.eway.common.res.FleetDetailsRes;
import com.maan.eway.common.res.GetAllMotorDetailsRes;
import com.maan.eway.common.res.GetOtherVehicleInfoRes;
import com.maan.eway.common.res.SuccessRes;
import com.maan.eway.common.res.UwQuestionsRes;
import com.maan.eway.error.Error;
/**
* <h2>PersonalInfoServiceimpl</h2>
*/
public interface EserviceMotorDetailsService  {

	List<String> validateMotorDetails(EserviceMotorDetailsSaveReq req,String tokens);

	List<EserviceMotorDetailsSaveRes> saveMotorDetails(EserviceMotorDetailsSaveReq req,String tokens);

	EserviceMotorDetailsRes getMotorDetails(EserviceMotorDetailsGetReq req);

	List<GetAllMotorDetailsRes> getallMotorDetails(EserviceMotorDetailsGetallReq req);

	SuccessRes uwquestions(EserviceMotorUwReq req);

	UwQuestionsRes getuwquestions(EserviceMotorUwReq req);

	List<EserviceCustomerDetailsRes> getallMotorDetails(ExistingMotorDetailsReq req);

	List<EserviceCustomerDetailsRes> getallExistingQuoteDetails(ExistingMotorDetailsReq req);

	List<EserviceCustomerDetailsRes> getallLapsedQuoteDetails(ExistingMotorDetailsReq req);

	List<EserviceCustomerDetailsRes> getallRejectedQuoteDetails(ExistingMotorDetailsReq req);

	SuccessRes updateLapsedQuote(UpdateLapsedQuoteReq req);

	SuccessRes deleteMotorDetails(EserviceMotorDetailsGetReq req);

	List<Error> validateDriverDetails(List<MotorDriverSaveReq> req);

	DriverSaveRes saveDriverDetails(List<MotorDriverSaveReq> req);

	List<DriverDetailsRes> getDriverDetails(DriverDetailsGetReq req);

	FleetDetailsRes updateFleetDetails(FleetDetailsSaveReq req);

	CommonRes depreciationCalculation(DepreciationReq req);

	DriverSaveRes saveOtherVehicleInfo(OtherVehicleInfoReq req);

	GetOtherVehicleInfoRes getOthervehicle(OtherVehicleInfoGetReq req);

}
