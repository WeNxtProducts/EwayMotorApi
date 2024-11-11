package com.maan.eway.common.service;

import java.util.List;


import org.springframework.http.ResponseEntity;

import com.maan.eway.bean.EserviceBuildingDetails;
import com.maan.eway.common.req.AccidentDamageSaveRequest;
import com.maan.eway.common.req.AllRiskDetailsReq;
import com.maan.eway.common.req.AllSectionSaveReq;
import com.maan.eway.common.req.BondCommonReq;
import com.maan.eway.common.req.BondRes;
import com.maan.eway.common.req.BurglaryAndHouseBreakingSaveReq;
import com.maan.eway.common.req.ChangeOfCurrencyReq;
import com.maan.eway.common.req.CommonGetReq;
import com.maan.eway.common.req.CommonRequest;
import com.maan.eway.common.req.ContentSaveReq;
import com.maan.eway.common.req.ElectronicEquipSaveReq;
import com.maan.eway.common.req.EmployeeDetailsReq;
import com.maan.eway.common.req.EservieMotorDetailsViewRes;
import com.maan.eway.common.req.FireAndAlliedPerillsSaveReq;
import com.maan.eway.common.req.FireDelete;
import com.maan.eway.common.req.FireReq;
import com.maan.eway.common.req.FirstLossPayeeReq;
import com.maan.eway.common.req.HealthInsureGetRes;
import com.maan.eway.common.req.MainInfoValidationReq;
import com.maan.eway.common.req.MedMalDropDownReq;
import com.maan.eway.common.req.NonMotorSaveReq;
import com.maan.eway.common.req.ProductLevelReq;
import com.maan.eway.common.req.SaveAddinfoHI;
import com.maan.eway.common.req.SlideBuildingSaveReq;
import com.maan.eway.common.req.SlideBusinessInterruptionReq;
import com.maan.eway.common.req.SlideCommonSaveReq;
import com.maan.eway.common.req.SlideEmpLiabilitySaveReq;
import com.maan.eway.common.req.SlideFidelityGuarantySaveReq;
import com.maan.eway.common.req.SlideFireAndPerillsSaveReq;
import com.maan.eway.common.req.SlideGoodsInTransitSaveReq;
import com.maan.eway.common.req.SlideHealthInsureSaveReq;
import com.maan.eway.common.req.SlideMachineryBreakdownSaveReq;
import com.maan.eway.common.req.SlideMoneySaveReq;
import com.maan.eway.common.req.SlidePersonalAccidentSaveReq;
import com.maan.eway.common.req.SlidePlateGlassSaveReq;
import com.maan.eway.common.req.SlidePublicLiabilitySaveReq;
import com.maan.eway.common.req.SlideSectionGetReq;
import com.maan.eway.common.req.WhatsappPremiumCalcReq;
import com.maan.eway.common.res.AccidentDamageSaveResponse;
import com.maan.eway.common.res.AllRiskDetailsRes;
import com.maan.eway.common.res.BurglaryAndHouseBreakingSaveRes;
import com.maan.eway.common.res.BusinessInterruptionRes;
import com.maan.eway.common.res.CommonRes;
import com.maan.eway.common.res.CommonResponse;
import com.maan.eway.common.res.CommonSlideSaveRes;
import com.maan.eway.common.res.ContentSaveRes;
import com.maan.eway.common.res.DropdownCommonRes;
import com.maan.eway.common.res.ElectronicEquipSaveRes;
import com.maan.eway.common.res.EserviceBuildingSaveRes;
import com.maan.eway.common.res.FireAndAlliedPerillsSaveRes;
import com.maan.eway.common.res.FirstLossPayeeRes;
import com.maan.eway.common.res.GoodInTransitRes;
import com.maan.eway.common.res.NonMotorComRes;
import com.maan.eway.common.res.NonMotorRes;
import com.maan.eway.common.res.NonMotorSaveRes;
import com.maan.eway.common.res.ProductCommonSaveRes;
import com.maan.eway.common.res.SlideBuildingGetRes;
import com.maan.eway.common.res.SlideCommonSaveRes;
import com.maan.eway.common.res.SlideEmpLiabilitySaveRes;
import com.maan.eway.common.res.SlideFidelityGuarantySaveRes;
import com.maan.eway.common.res.SlideMachineryBreakdownSaveRes;
import com.maan.eway.common.res.SlideMoneySaveRes;
import com.maan.eway.common.res.SlidePersonalAccidentGetRes;
import com.maan.eway.common.res.SlidePlateGlassSaveRes;
import com.maan.eway.common.res.SlidePublicLiabilitySaveRes;
import com.maan.eway.common.res.SlideSectionSaveRes;
import com.maan.eway.common.res.SuccessRes;
import com.maan.eway.error.Error;

import com.maan.eway.req.ProfessionalIndeminityReq;
import com.maan.eway.res.DropDownRes;

public interface EserviceSlideSaveService {

	
	CommonSlideSaveRes saveCommonDetails(SlideCommonSaveReq req);

	List<SlideSectionSaveRes> saveEmpLiabilityDetails(List<SlideEmpLiabilitySaveReq> req);

	List<SlideSectionSaveRes> saveSlideFidelityGuarantyDetails(List<SlideFidelityGuarantySaveReq> req);

	List<SlideSectionSaveRes> saveSlideMachineryBreakdownDetails(SlideMachineryBreakdownSaveReq req);

	List<SlideSectionSaveRes> saveSlideMoneyDetails(List<SlideMoneySaveReq> req);

	List<SlideSectionSaveRes> saveSlidePlateGlassDetails(SlidePlateGlassSaveReq req);

	List<SlideSectionSaveRes> saveSlidePublicLiablityDetails(SlidePublicLiabilitySaveReq req);

	List<SlideSectionSaveRes> saveAccidentDamageDetails(AccidentDamageSaveRequest req);

	List<SlideSectionSaveRes> saveAllRiskDetails(AllRiskDetailsReq req);

	List<SlideSectionSaveRes> saveBurglaryAndHouseBreakingDetails(BurglaryAndHouseBreakingSaveReq req);

	List<SlideSectionSaveRes> saveFireAndAlliedPerillsDetails(FireAndAlliedPerillsSaveReq req);

	List<SlideSectionSaveRes> saveContentDetails(ContentSaveReq req);

	List<SlideSectionSaveRes> saveElectronicEquipDetails(List<ElectronicEquipSaveReq> reqList);

	SlideCommonSaveRes getCommonDetails(CommonGetReq req);

	AccidentDamageSaveResponse getAccidentDamgeDetails(SlideSectionGetReq req);

	AllRiskDetailsRes getAllRiskDetails(SlideSectionGetReq req);

	List<BurglaryAndHouseBreakingSaveRes> getBurglaryAndHouseBreakingDetails(SlideSectionGetReq req);

	FireAndAlliedPerillsSaveRes getFireAndAlliedPerils(SlideSectionGetReq req);

	ContentSaveRes getContentDetails(SlideSectionGetReq req);

	List<ElectronicEquipSaveRes> getElectronicEquipDetails(SlideSectionGetReq req);

	List<SlideEmpLiabilitySaveRes> getEmpLiabilityDetails(SlideSectionGetReq req);

	List<SlideFidelityGuarantySaveRes> getSlideFidelityGuarantyDetails(SlideSectionGetReq req);

	SlideMachineryBreakdownSaveRes getSlideMachineryBreakdownDetails(SlideSectionGetReq req);

	List<SlideMoneySaveRes> getSlideMoneyDetails(SlideSectionGetReq req);

	SlidePlateGlassSaveRes getSlidePlateGlassDetails(SlideSectionGetReq req);

	SlidePublicLiabilitySaveRes getSlidePublicLiablityDetails(SlideSectionGetReq req);
	
     SuccessRes saveadditionalinfoHI(SaveAddinfoHI req);

	SuccessRes deleteAccidentDamgeDetails(SlideSectionGetReq req);

	SuccessRes deleteAllRiskDetails(SlideSectionGetReq req);

	SuccessRes deleteBurglaryAndHouseBreakingDetails(SlideSectionGetReq req);

	SuccessRes deleteFireAndAlliedPerils(SlideSectionGetReq req);

	SuccessRes deleteContentDetails(SlideSectionGetReq req);

	SuccessRes deleteElectronicEquipDetails(SlideSectionGetReq req);

	SuccessRes deleteEmpLiabilityDetails(SlideSectionGetReq req);

	SuccessRes deleteSlideFidelityGuarantyDetails(SlideSectionGetReq req);

	SuccessRes deleteSlideMoneyDetails(SlideSectionGetReq req);

	SuccessRes deleteSlideMachineryBreakdownDetails(SlideSectionGetReq req);

	SuccessRes deleteSlidePlateGlassDetails(SlideSectionGetReq req);

	SuccessRes deleteSlidePublicLiablityDetails(SlideSectionGetReq req);

	List<DropDownRes> getAooDropdown(MedMalDropDownReq req);

	List<DropDownRes> getAggDropdown(MedMalDropDownReq req);

	List<SlideSectionSaveRes> saveBuilding(SlideBuildingSaveReq req , List<EserviceBuildingDetails> NewDataList);

	List<SlideBuildingGetRes> getSlideBuilding(SlideSectionGetReq req);

	SuccessRes deleteSlideBuilding(SlideSectionGetReq req);

	List<SlidePersonalAccidentGetRes> getSlidePersonalAccident(SlideSectionGetReq req);

	SuccessRes deleteSlidePersonalAccident(SlideSectionGetReq req);

	List<SlideSectionSaveRes> savePersonalAccident(List<SlidePersonalAccidentSaveReq> req);

	CommonRes saveRiskDetailsWithPremiumCalc(WhatsappPremiumCalcReq req, String string);
	
	List<SlideSectionSaveRes> saveBusinessInterruption(SlideBusinessInterruptionReq req);

	 BusinessInterruptionRes getBusinessInterruption(SlideSectionGetReq req);
	 
	 List<SlideSectionSaveRes> saveGoodsInTransit(SlideGoodsInTransitSaveReq req);

	 GoodInTransitRes getGoodsInTransit(SlideSectionGetReq req);

	List<SlideSectionSaveRes> saveHealthInsureDetails(List<SlideHealthInsureSaveReq> req);

	List<HealthInsureGetRes> getHealthInsure(SlideSectionGetReq req);

	List<SlideSectionSaveRes> saveprofindernity(ProfessionalIndeminityReq req);

	List<HealthInsureGetRes> getHumantype(ProductLevelReq req);

	ResponseEntity<CommonResponse> saveAllSectionDetails(AllSectionSaveReq req, CommonResponse data,
			List<Object> objects);

	List<SlidePersonalAccidentSaveReq> fetchOriginalRequest(List<SlidePersonalAccidentSaveReq> req);

	List<SlideEmpLiabilitySaveReq> fetchOriginalRequestData(List<SlideEmpLiabilitySaveReq> req);

	SlideSectionSaveRes saveFire(FireReq req);
	
	boolean DeleteFire(CommonRequest req);

    String generaterequestno(CommonRequest req);

	boolean saveSectiondetails(FireReq req);

	CommonRes deletefire(List<FireDelete> req);

	List<SlideSectionSaveRes> saveBond(BondCommonReq req);

	List<BondRes> getBoundDetails(SlideSectionGetReq req);

	List<SlideSectionSaveRes> saveBurglaryAndHouseBreakingDetailsList(List<BurglaryAndHouseBreakingSaveReq> req);

	List<SlideSectionSaveRes> nonMotorSaveDetails(NonMotorSaveReq req);
	
	
	NonMotorRes getAllNonMotorDetails(NonMotorComRes Req);

	NonMotorSaveRes getNonMotorDetails(NonMotorComRes req);

	SuccessRes SaveFirstLossPayee(List<FirstLossPayeeReq> req);

	List<FirstLossPayeeRes> getFirstLossPayee(FirstLossPayeeReq req);

	


}
