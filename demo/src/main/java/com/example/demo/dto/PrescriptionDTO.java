package com.example.demo.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class PrescriptionDTO {
    private Long id;
    private Long patientId;
    private Long doctorId;
    private String medication;
    private String dosage;
    private String frequency;
    private String instructions;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;
    private Integer refillsRemaining;
} 