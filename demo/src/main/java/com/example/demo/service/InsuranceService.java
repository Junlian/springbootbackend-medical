package com.example.demo.service;

import com.example.demo.dto.InsuranceInfoDTO;
import com.example.demo.dto.ClaimDTO;
import com.example.demo.model.mysql.InsuranceInfo;
import com.example.demo.model.mysql.Claim;
import com.example.demo.model.mysql.Patient;
import com.example.demo.repository.jpa.InsuranceRepository;
import com.example.demo.repository.jpa.ClaimRepository;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.exception.InvalidOperationException;
import com.example.demo.mapper.InsuranceMapper;
import com.example.demo.mapper.ClaimMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.time.LocalDate;
import com.example.demo.model.mysql.enums.ClaimStatus;
import com.example.demo.exception.DuplicateResourceException;
import com.example.demo.repository.jpa.PatientRepository;

@Service
@RequiredArgsConstructor
public class InsuranceService {
    
    private final InsuranceRepository insuranceRepository;
    private final ClaimRepository claimRepository;
    private final InsuranceMapper insuranceMapper;
    private final ClaimMapper claimMapper;
    private final NotificationService notificationService;
    private final PatientRepository patientRepository;

    @Transactional
    public InsuranceInfoDTO verifyInsurance(Long patientId, String policyNumber) {
        InsuranceInfo insurance = insuranceRepository.findByPatientId(patientId);
        if (insurance == null || !insurance.getPolicyNumber().equals(policyNumber)) {
            throw new ResourceNotFoundException("Insurance information not found or invalid");
        }
        
        if (insurance.getExpirationDate() != null && 
            insurance.getExpirationDate().isBefore(LocalDate.now())) {
            throw new InvalidOperationException("Insurance policy has expired");
        }
        
        return insuranceMapper.toDTO(insurance);
    }

    @Transactional
    public InsuranceInfoDTO updateInsurance(Long patientId, InsuranceInfoDTO insuranceDTO) {
        InsuranceInfo insurance = insuranceRepository.findByPatientId(patientId);
        if (insurance == null) {
            throw new ResourceNotFoundException("Insurance information not found");
        }
        
        insurance.setPolicyNumber(insuranceDTO.getPolicyNumber());
        insurance.setProvider(insuranceDTO.getProvider());
        insurance.setExpirationDate(insuranceDTO.getExpirationDate());
        insurance = insuranceRepository.save(insurance);
        
        return insuranceMapper.toDTO(insurance);
    }

    @Transactional
    public ClaimDTO submitClaim(ClaimDTO claimDTO) {
        validateClaim(claimDTO);
        
        Claim claim = claimMapper.toEntity(claimDTO);
        claim.setSubmissionDate(LocalDateTime.now());
        claim.setStatus(ClaimStatus.SUBMITTED);
        
        claim = claimRepository.save(claim);
        
        return claimMapper.toDTO(claim);
    }

    @Transactional(readOnly = true)
    public ClaimDTO getClaimStatus(String claimNumber) {
        Claim claim = claimRepository.findByClaimNumber(claimNumber);
        if (claim == null) {
            throw new ResourceNotFoundException("Claim not found");
        }
        return claimMapper.toDTO(claim);
    }

    @Transactional(readOnly = true)
    public List<ClaimDTO> getPatientClaims(Long patientId) {
        List<Claim> claims = claimRepository.findByPatientIdOrderBySubmissionDateDesc(patientId);
        return claimMapper.toDTOList(claims);
    }

    @Transactional
    public InsuranceInfoDTO createInsurance(Long patientId, InsuranceInfoDTO insuranceDTO) {
        if (insuranceRepository.existsByPolicyNumber(insuranceDTO.getPolicyNumber())) {
            throw new DuplicateResourceException("Insurance policy number already exists");
        }
        
        Patient patient = patientRepository.findById(patientId)
            .orElseThrow(() -> new ResourceNotFoundException("Patient not found"));
             
        InsuranceInfo insurance = insuranceMapper.toEntity(insuranceDTO);
        insurance.setPatient(patient);
        insurance = insuranceRepository.save(insurance);
        
        return insuranceMapper.toDTO(insurance);
    }

    private void validateClaim(ClaimDTO claimDTO) {
        InsuranceInfo insurance = insuranceRepository.findByPatientId(claimDTO.getPatientId());
        if (insurance == null) {
            throw new InvalidOperationException("Patient has no insurance information");
        }
        
        if (insurance.getExpirationDate() != null && 
            insurance.getExpirationDate().isBefore(LocalDate.now())) {
            throw new InvalidOperationException("Insurance policy has expired");
        }
        
        // Add more validation rules as needed
    }
}