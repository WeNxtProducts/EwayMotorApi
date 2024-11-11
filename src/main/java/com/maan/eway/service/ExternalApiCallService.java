package com.maan.eway.service;

import com.maan.eway.req.MotorVehicleInfoGetReq;
import com.maan.eway.req.TiraMsg;
import com.maan.eway.req.acknowledge.TiraM;
import com.maan.eway.req.acknowledge.TiraMsgAcknowlege;
import com.maan.eway.req.acknowledge.TiraMsgAcknowlegeFleet;
import com.maan.eway.req.fleet.TiraMsgVehiclePushFleet;
import com.maan.eway.req.push.TiraMsgCoverPush;
import com.maan.eway.req.push.TiraMsgVehiclePush;
import com.maan.eway.req.verification.TiraMsgVehicleVerification;
import com.maan.eway.res.MotorTiraMsgRes;
import com.maan.eway.res.NonMotorTiraMsgRes;
import com.maan.eway.res.verification.MotorTiraMsgVerificationRes;

public interface ExternalApiCallService {

	MotorTiraMsgRes getSampleData(TiraMsg req);

	MotorTiraMsgRes pushVehicleInfo(TiraMsgVehiclePush req, String tokens);

	MotorTiraMsgVerificationRes coverVerification(TiraMsgVehicleVerification req,String tokens, MotorVehicleInfoGetReq request);

	//TiraMsgAcknowlege saveAcknowledge(TiraMsgAcknowlege req);

	NonMotorTiraMsgRes pushNonMotorInfo(TiraMsgCoverPush req,String tokens);

	TiraMsgAcknowlege saveAcknowledgeForNonMotor(TiraMsgAcknowlege req,String tokens);

	MotorTiraMsgRes pushVehicleInfoFleet(TiraMsgVehiclePushFleet req,String tokens);

	TiraM saveAcknowledgeForFleetMotor(TiraMsgAcknowlegeFleet req,String tokens);

	TiraMsgAcknowlege saveAcknowledge(TiraMsgAcknowlege req, String tokens);


}
