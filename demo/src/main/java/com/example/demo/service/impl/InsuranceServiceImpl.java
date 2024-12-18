package com.example.demo.service.impl;

import com.example.demo.dto.InsuranceVerificationDTO;
import com.example.demo.dto.ClaimDTO;
import com.example.demo.entity.Claim;
import com.example.demo.repository.ClaimRepository;
import com.example.demo.service.InsuranceService;
import com.example.demo.mapper.ClaimMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@Service
public class InsuranceServiceImpl implements InsuranceService {

    @Autowired
    private ClaimRepository claimRepository;

    @Autowired
    private ClaimMapper claimMapper;

    @Override
    public InsuranceVerificationDTO verifyInsurance(String policyNumber, String patientId) {
        InsuranceVerificationDTO verificationDTO = new InsuranceVerificationDTO();
        verificationDTO.setPolicyNumber(policyNumber);
        verificationDTO.setProvider("Sample Insurance Co.");
        verificationDTO.setVerified(true);
        return verificationDTO;
    }

    @Override
    public ClaimDTO submitClaim(ClaimDTO claimDTO) {
        Claim claim = claimMapper.toEntity(claimDTO);
        claim.setStatus("SUBMITTED");
        Claim savedClaim = claimRepository.save(claim);
        return claimMapper.toDTO(savedClaim);
    }

    @Override
    public Page<ClaimDTO> getPatientClaims(Long patientId, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Claim> claims = claimRepository.findByPolicyId(patientId, pageable);
        return claims.map(claimMapper::toDTO);
    }

    @Override
    public Page<ClaimDTO> getAllClaims(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Claim> claims = claimRepository.findAll(pageable);
        return claims.map(claimMapper::toDTO);
    }

    @Override
    public ClaimDTO getClaimStatus(Long claimId) {
        Claim claim = claimRepository.findById(claimId)
            .orElseThrow(() -> new RuntimeException("Claim not found"));
        return claimMapper.toDTO(claim);
    }

    @Override
    public InsuranceVerificationDTO getPatientCoverage(Long patientId) {
        InsuranceVerificationDTO coverage = new InsuranceVerificationDTO();
        coverage.setVerified(true);
        coverage.setProvider("Sample Insurance Co.");
        return coverage;
    }
}