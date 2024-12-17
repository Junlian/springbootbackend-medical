package com.example.demo.repository.jpa;

import com.example.demo.model.mysql.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Long> {
    List<Claim> findByPatientIdOrderBySubmissionDateDesc(Long patientId);
    Claim findByClaimNumber(String claimNumber);
} 