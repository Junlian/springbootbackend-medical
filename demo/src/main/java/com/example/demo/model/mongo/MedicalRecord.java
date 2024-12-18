package com.example.demo.model.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Document(collection = "medical_records")
public class MedicalRecord {
    @Id
    private String id;
    private Long patientId;
    private String diagnosis;
    private String treatment;
    private List<String> prescriptions;
    private List<String> attachments;
    private String notes;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String doctorId;
    private String status;
}