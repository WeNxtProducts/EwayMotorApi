/*
*  Copyright (c) 2019. All right reserved
* Created on 2022-11-18 ( Date ISO 2022-11-18 - Time 11:38:42 )
* Generated by Telosys Tools Generator ( version 3.3.0 )
*/
package com.maan.eway.common.service;
import com.maan.eway.bean.EserviceBuildingDetails;
import com.maan.eway.common.req.BuildDetailsGetByLocIdReq;
import com.maan.eway.common.req.BuildingSaveReq;
import com.maan.eway.common.req.BuldingDetailsGetReq;
import com.maan.eway.common.req.ExistingBuildingDetailsReq;
import com.maan.eway.common.req.ExistingMotorDetailsReq;
import com.maan.eway.common.res.EserviceBuildingSaveRes;
import com.maan.eway.common.res.GetAllBuldingDetailsRes;
import com.maan.eway.common.res.GetBuildingDetailsRes;
import com.maan.eway.common.res.SuccessRes;
import com.maan.eway.error.Error;

import java.util.List;
/**
* <h2>EserviceBuildingDetailsServiceimpl</h2>
*/
public interface EserviceBuildingDetailsService  {

EserviceBuildingDetails create(EserviceBuildingDetails d);
EserviceBuildingDetails update(EserviceBuildingDetails d);
//EserviceBuildingDetails getOne(long id) ;
 List<EserviceBuildingDetails> getAll();
long getTotal();
//boolean delete(long id);
List<Error> validateBuildingDetails(BuildingSaveReq req);
List<EserviceBuildingSaveRes> saveBuildingDetails(BuildingSaveReq req);
GetBuildingDetailsRes getBuildingDetailsByLocationId(BuildDetailsGetByLocIdReq req);
List<GetBuildingDetailsRes> getBuildingDetailsByRefNo(BuldingDetailsGetReq req);
SuccessRes deleteBuidingDetailsByLocId(BuildDetailsGetByLocIdReq req);
List<GetAllBuldingDetailsRes> getallExistingQuoteDetails(ExistingBuildingDetailsReq req);

}
