package com.example.demo.dto;

import com.example.demo.model.mysql.enums.AppointmentStatus;
import com.example.demo.model.mysql.enums.AppointmentType;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class AppointmentDTO {
    private Long id;
    private Long patientId;
    private Long doctorId;
    private LocalDateTime dateTime;
    private AppointmentType type;
    private AppointmentStatus status;
    private String notes;
    private String cancellationReason;
} 