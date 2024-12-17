package com.example.demo.dto;

import com.example.demo.model.mongo.enums.RecordStatus;
import com.example.demo.model.mongo.enums.RecordType;
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
    private LocalDateTime date;
    private RecordType type;
    private RecordStatus status;
    private String diagnosis;
    private String notes;
    
    // Associated data
    private List<String> attachments; // Store attachment IDs as strings
    private MetadataDTO metadata;
    
    // Treatment information
    private List<String> prescriptions;
    private List<String> treatments;
    private String followUpInstructions;
}