package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Model.PolicyChecking;
import com.example.Repository.PolicyCheckingRepository;

@Service
public class PolicyCheckingService {
	
	@Autowired
	private PolicyCheckingRepository policyRepository;
	
	public List<PolicyChecking>  getPolicyChecking(){
		return (List<PolicyChecking>) policyRepository.findAll();
		
	}
	public PolicyChecking getPolicyCheckingByBikeId(Long bikeId){
		return policyRepository.findByBikeId(bikeId);
	}

}
