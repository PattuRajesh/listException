package com.example.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="policyChecking")
public class PolicyChecking {
	
	@Id
    private Long bikeId;
	
	private Long regId;
	
	private int schemeId;
	
	private int planId;
	
	public PolicyChecking() {
		
	}
	public PolicyChecking(Long bikeId, Long regId, int schemeId, int planId) {
		super();
		this.bikeId = bikeId;
		this.regId = regId;
		this.schemeId = schemeId;
		this.planId = planId;
	}


	public Long getBikeId() {
		return bikeId;
	}


	public void setBikeId(Long bikeId) {
		this.bikeId = bikeId;
	}


	public Long getRegId() {
		return regId;
	}


	public void setRegId(Long regId) {
		this.regId = regId;
	}


	public int getSchemeId() {
		return schemeId;
	}


	public void setSchemeId(int schemeId) {
		this.schemeId = schemeId;
	}


	public int getPlanId() {
		return planId;
	}


	public void setPlanId(int planId) {
		this.planId = planId;
	}
	

}
