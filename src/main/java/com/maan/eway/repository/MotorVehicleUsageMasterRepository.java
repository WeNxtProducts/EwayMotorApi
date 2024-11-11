package com.maan.eway.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.maan.eway.bean.MotorVehicleUsageMaster;
import com.maan.eway.bean.MotorVehicleUsageMasterId;

 
public interface MotorVehicleUsageMasterRepository  extends JpaRepository<MotorVehicleUsageMaster,MotorVehicleUsageMasterId > , JpaSpecificationExecutor<MotorVehicleUsageMaster> {

	List<MotorVehicleUsageMaster> findByBranchCodeAndCompanyIdAndVehicleUsageDescOrderByAmendIdDesc(String branchCode,
			String insuranceId, String resMotorUsage);

	

}
