package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.PolicyChecking;

public interface PolicyCheckingRepository extends JpaRepository<PolicyChecking,Long> {

	PolicyChecking findByBikeId(Long bikeId);

}
