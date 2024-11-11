package com.maan.eway.common.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maan.eway.bean.EserviceCustomerDetails;
import com.maan.eway.bean.EserviceMotorDetails;
import com.maan.eway.bean.ListItemValue;
import com.maan.eway.bean.MotorDriverDetails;
import com.maan.eway.common.req.DriverLicenceReq;
import com.maan.eway.common.req.DriverSaveRes;
import com.maan.eway.common.req.MotorDriverSaveReq;
import com.maan.eway.repository.EServiceMotorDetailsRepository;
import com.maan.eway.repository.EserviceCustomerDetailsRepository;
import com.maan.eway.repository.MotorDriverDetailsRepository;

@Service
public class AngolaMotorDriverDetails {
	
	private Logger log = LogManager.getLogger(AngolaMotorDriverDetails.class);
	
	@Autowired
	private EServiceMotorDetailsRepository repo;
	
	@Autowired
	private EserviceCustomerDetailsRepository custRepo;
	
	@Autowired
	private MotorDriverDetailsRepository driverRepo;
	
	@Autowired
	private EserviceMotorDetailsServiceImpl eserMotDetServImpl;
	
	public List<String> validateDriverDetails(List<MotorDriverSaveReq> req) {
		List<String> error = new ArrayList<String>();
		Integer rowNo =  0 ;
		List<DriverLicenceReq> licenseNos =  new ArrayList<DriverLicenceReq>();
		
		for (MotorDriverSaveReq dri : req ) {
			rowNo = rowNo + 1 ;
			if (dri.getDrivingLicensingAge()==null) { 
				error.add("3317"+","+rowNo);
			}if (StringUtils.isBlank(dri.getLicenseNo()) ) {
				error.add("1944"+","+rowNo);
			} else if (dri.getLicenseNo().length()>20 ) { 
				error.add("1945"+","+rowNo);
			} else if (StringUtils.isNotBlank(dri.getRiskId()) ) {
				List<DriverLicenceReq> filterLicense = licenseNos.stream().filter( o ->  o.getRiskId().equalsIgnoreCase(dri.getRiskId()) && o.getLicenseNo().equalsIgnoreCase(dri.getLicenseNo())  ).collect(Collectors.toList());	
				if (filterLicense.size()>0 ) {
					error.add("1946"+","+rowNo);
					
				} else {
					DriverLicenceReq li = new DriverLicenceReq();
					li.setRiskId(dri.getRiskId());
					li.setLicenseNo(dri.getLicenseNo());
					licenseNos.add(li);
				}
				
			} 
			
		}
		return error;
	}

	public DriverSaveRes saveDriverDetails(List<MotorDriverSaveReq> req) {
		DriverSaveRes res = new DriverSaveRes();
		try {
			EserviceMotorDetails home = repo.findByRequestReferenceNo(req.get(0).getRequestReferenceNo()).get(0);
			EserviceCustomerDetails per = custRepo.findByCustomerReferenceNo(home.getCustomerReferenceNo());
			Map<String, List<MotorDriverSaveReq>> groupByRiskId = req.stream()
					.collect(Collectors.groupingBy(MotorDriverSaveReq::getRiskId));

			List<MotorDriverDetails> saveList = new ArrayList<MotorDriverDetails>();
			for (String riskId : groupByRiskId.keySet()) {
				Long riskIdCount = driverRepo.countByRequestReferenceNoAndRiskId(req.get(0).getRequestReferenceNo(),Integer.valueOf(riskId));
				if (riskIdCount > 0) {
					driverRepo.deleteByRequestReferenceNoAndRiskId(req.get(0).getRequestReferenceNo(),Integer.valueOf(riskId));
				}

				List<MotorDriverSaveReq> driList = groupByRiskId.get(riskId);
				Integer driId = 0;
				for (MotorDriverSaveReq dri : driList) {
					driId = driId + 1;
					MotorDriverDetails saveDri = new MotorDriverDetails();
					saveDri.setCompanyId(home.getCompanyId());
					saveDri.setCreatedBy(dri.getCreatedBy());
					saveDri.setDriverDob(dri.getDriverDob());
					saveDri.setDriverId(driId);
					saveDri.setDriverName(dri.getDriverName());
					saveDri.setPolicyHolderType(per.getPolicyHolderType() == null ? "" : per.getPolicyHolderType().toString());
					saveDri.setPolicyHolderTypeDesc(per.getPolicyHolderTypeDesc());
					saveDri.setIdType("4");
					List<ListItemValue> IdType = eserMotDetServImpl.getListItemDriver("99999", home.getBranchCode(),"POLICY_HOLDER_ID_TYPE", dri.getDriverType());
					saveDri.setIdTypeDesc(IdType.size() > 0 ? IdType.get(0).getItemValue() : "Driving License");
					saveDri.setIdTypeDescLocal((IdType.size() > 0 && StringUtils.isNotBlank(IdType.get(0).getItemValueLocal()))? IdType.get(0).getItemValueLocal(): "Driving License");
					saveDri.setIdNumber(dri.getLicenseNo());
					saveDri.setDriverType(dri.getDriverType());
					List<ListItemValue> DriDesc = eserMotDetServImpl.getListItemDriver(home.getCompanyId(), home.getBranchCode(),"DRIVER_TYPES", dri.getDriverType());
					saveDri.setDriverTypedesc(DriDesc.size() > 0 ? DriDesc.get(0).getItemValue() : "Driver");
					saveDri.setDriverTypeDescLocal((DriDesc.size() > 0 && StringUtils.isNotBlank(DriDesc.get(0).getItemValueLocal()))? DriDesc.get(0).getItemValue(): "Driver");
					saveDri.setEntryDate(new Date());
					saveDri.setProductId(Integer.valueOf(home.getProductId()));
					saveDri.setQuoteNo(home.getQuoteNo());
					saveDri.setRequestReferenceNo(home.getRequestReferenceNo());
					saveDri.setRiskId(Integer.valueOf(dri.getRiskId()));
					saveDri.setStatus("Y");
					saveDri.setSubscriber(dri.getSubscriber());
					saveDri.setCivility(dri.getCivility());
					saveDri.setDrivingLicenseNumber(dri.getLicenseNo());
					saveDri.setPlaceIssue(dri.getPlaceIssue());
					saveDri.setCategoryCode(dri.getCategoryCode());
					saveDri.setCategoryExDate(dri.getCategoryExDate());
					saveDri.setCategoryDate(dri.getCategoryDate());
					saveDri.setEmail(dri.getEmail());
					saveDri.setContact(dri.getContact());
					saveDri.setContactCode(dri.getContactCode());
					

					if (dri.getDriverDob() != null) {
						saveDri.setDriverDob(dri.getDriverDob());
						Date dob = dri.getDriverDob();
						Date today = new Date();
						int age = today.getYear() - dob.getYear();
						saveDri.setAge(age);

					} else {
						saveDri.setDriverDob(null);
						saveDri.setAge(18);
					}

					saveList.add(saveDri);
				}
			}
			driverRepo.saveAllAndFlush(saveList);
			res.setResponse("Success");

		} catch (Exception e) {

			log.error(e);
			e.printStackTrace();
			return null;
		}
		return res;
	}

}
