package com.example.demo.service;

import com.example.demo.dto.InsuranceVerificationDTO;
import com.example.demo.dto.ClaimDTO;
import org.springframework.data.domain.Page;

public interface InsuranceService {
    InsuranceVerificationDTO verifyInsurance(String policyNumber, String patientId);
    ClaimDTO submitClaim(ClaimDTO claimDTO);
    Page<ClaimDTO> getPatientClaims(Long patientId, int page, int size);
    Page<ClaimDTO> getAllClaims(int page, int size);
    ClaimDTO getClaimStatus(Long claimId);
    InsuranceVerificationDTO getPatientCoverage(Long patientId);
}