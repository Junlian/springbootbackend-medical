package com.example.demo.dto;

import lombok.Data;
import com.example.demo.model.mysql.ClaimStatus;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Data
public class ClaimDTO {
    private Long id;
    private String claimNumber;
    private LocalDateTime submissionDate;
    private BigDecimal amount;
    private ClaimStatus status;
    private Long patientId;
    private String description;
    private String serviceProvider;
    private LocalDateTime serviceDate;
} 