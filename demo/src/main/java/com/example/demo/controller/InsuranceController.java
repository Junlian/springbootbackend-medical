package com.example.demo.controller;

import com.example.demo.dto.InsuranceDTO;
import com.example.demo.dto.ClaimDTO;
import com.example.demo.dto.ErrorResponse;
import com.example.demo.dto.InsuranceVerificationDTO;
import com.example.demo.service.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.extern.slf4j.Slf4j;
import com.example.demo.entity.Claim;

@Slf4j
@RestController
@RequestMapping("/api/v1/insurance")
public class InsuranceController {

    @Autowired
    private InsuranceService insuranceService;

    @PostMapping("/verify")
    public ResponseEntity<InsuranceVerificationDTO> verifyInsurance(
            @RequestParam String policyNumber,
            @RequestParam String provider) {
        return ResponseEntity.ok(insuranceService.verifyInsurance(policyNumber, provider));
    }

    @GetMapping("/coverage/{patientId}")
    public ResponseEntity<InsuranceVerificationDTO> getPatientCoverage(@PathVariable Long patientId) {
        return ResponseEntity.ok(insuranceService.getPatientCoverage(patientId));
    }

    @PostMapping("/claims")
    public ResponseEntity<ClaimDTO> submitClaim(@Valid @RequestBody ClaimDTO claimDTO) {
        return ResponseEntity.ok(insuranceService.submitClaim(claimDTO));
    }

    @GetMapping("/claims/{claimId}")
    public ResponseEntity<ClaimDTO> getClaimStatus(@PathVariable Long claimId) {
        return ResponseEntity.ok(insuranceService.getClaimStatus(claimId));
    }

    @GetMapping("/claims")
    public ResponseEntity<?> getPatientClaims(
            @RequestParam(required = false) Long patientId,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        try {
            if (page < 0 || size <= 0) {
                return ResponseEntity
                    .badRequest()
                    .body(new ErrorResponse("Invalid pagination parameters"));
            }

            if (patientId == null) {
                return ResponseEntity.ok(insuranceService.getAllClaims(page, size));
            }
            return ResponseEntity.ok(insuranceService.getPatientClaims(patientId, page, size));
        } catch (Exception e) {
            log.error("Error fetching claims: ", e);
            return ResponseEntity
                .badRequest()
                .body(new ErrorResponse("Failed to fetch claims: " + e.getMessage()));
        }
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleException(Exception e) {
        return ResponseEntity
            .badRequest()
            .body(new ErrorResponse("An error occurred: " + e.getMessage()));
    }
} 