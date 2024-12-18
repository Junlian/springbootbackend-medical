package com.example.demo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsuranceVerificationDTO {
    private String policyNumber;
    private String provider;
    private boolean verified;
} 