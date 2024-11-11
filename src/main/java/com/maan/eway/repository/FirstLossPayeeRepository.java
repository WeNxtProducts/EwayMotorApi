package com.maan.eway.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.maan.eway.bean.FirstLossPayee;
import com.maan.eway.common.req.FirstLossPayeeReq;

public interface FirstLossPayeeRepository extends JpaRepository<FirstLossPayee,Integer> {

	List<FirstLossPayee> findByRequestReferenceNo(String requestReferenceNo);

	List<FirstLossPayee> findByRequestReferenceNoAndLocationId(String requestReferenceNo, Integer valueOf);



}
