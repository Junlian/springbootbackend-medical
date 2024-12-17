package com.example.demo.dto;

import com.example.demo.model.mysql.enums.ClaimStatus;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ClaimDTO {
    private Long id;
    private Long patientId;
    private Long appointmentId;
    private String claimNumber;
    private LocalDateTime submissionDate;
    private BigDecimal claimAmount;
    private ClaimStatus status;
    private String denialReason;
    private LocalDateTime processedDate;
    private BigDecimal approvedAmount;
} 