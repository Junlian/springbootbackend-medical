package com.example.demo.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class ClaimDTO {
    private Long id;
    private Long policyId;
    private LocalDate claimDate;
    private BigDecimal claimAmount;
    private String status;
} 