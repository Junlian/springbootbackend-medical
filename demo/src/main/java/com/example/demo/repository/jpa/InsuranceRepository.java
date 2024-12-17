package com.example.demo.repository.jpa;

import com.example.demo.model.mysql.InsuranceInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceRepository extends JpaRepository<InsuranceInfo, Long> {
    InsuranceInfo findByPatientId(Long patientId);
    boolean existsByPolicyNumber(String policyNumber);
} 