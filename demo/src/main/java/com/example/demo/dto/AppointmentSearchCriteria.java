package com.example.demo.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class AppointmentSearchCriteria {
    private Long patientId;
    private Long doctorId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String status;
} 