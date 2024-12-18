package com.example.demo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentSearchCriteria {
    private Long patientId;
    private Long doctorId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String status;
} 