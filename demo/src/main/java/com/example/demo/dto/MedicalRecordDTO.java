package com.example.demo.dto;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

/**
 * DTO for transferring medical record data between layers.
 * Contains only the necessary fields for medical record operations.
 */
@Data
public class MedicalRecordDTO {
    // Unique identifier for the medical record
    private String id;
    
    // References to associated entities
    private Long patientId;
    private Long doctorId;
    
    // Core medical record data
    private LocalDateTime visitDate;
    private String diagnosis;
    private String treatment;
    
    // Associated data
    private String prescription;
    private String notes;
    private List<AttachmentDTO> attachments;
}