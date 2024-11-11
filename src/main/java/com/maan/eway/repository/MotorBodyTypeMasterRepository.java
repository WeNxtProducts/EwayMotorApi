package com.maan.eway.repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.maan.eway.bean.MotorBodyTypeMaster;
import com.maan.eway.bean.MotorBodyTypeMasterId;

public interface MotorBodyTypeMasterRepository extends JpaRepository<MotorBodyTypeMaster, MotorBodyTypeMasterId> , JpaSpecificationExecutor<MotorBodyTypeMaster>{

	List<MotorBodyTypeMaster> findByBodyId(Integer valueOf);

	List<MotorBodyTypeMaster> findByBodyNameEnAndBranchCodeAndCompanyIdOrderByAmendIdDesc(String resBodyType,
			String string, String insuranceId);
	List<MotorBodyTypeMaster> findAllByCompanyIdAndBranchCodeAndBodyIdAndEffectiveDateStartLessThanEqualAndEffectiveDateEndGreaterThan(
			String insuranceId, String string, Integer bodyId, Date today, Date today2);


}
