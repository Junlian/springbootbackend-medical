package com.example.demo.dto;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import java.time.LocalDate;

@Data
public class InsuranceDTO {
    private Long id;
    
    @NotBlank(message = "Provider is required")
    private String provider;
    
    @NotBlank(message = "Policy number is required")
    @Pattern(regexp = "^[A-Z0-9-]{5,20}$", message = "Invalid policy number format")
    private String policyNumber;
    
    private String groupNumber;
    private LocalDate validFrom;
    private LocalDate validUntil;
    private CoverageDetailsDTO coverage;
} 