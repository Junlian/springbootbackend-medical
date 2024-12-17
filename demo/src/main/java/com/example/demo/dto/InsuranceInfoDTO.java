package com.example.demo.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class InsuranceInfoDTO {
    private Long id;
    private Long patientId;
    private String provider;
    private String policyNumber;
    private String groupNumber;
    private LocalDate effectiveDate;
    private LocalDate expirationDate;
    private String planType;
    private CoverageDetailsDTO coverage;
} 