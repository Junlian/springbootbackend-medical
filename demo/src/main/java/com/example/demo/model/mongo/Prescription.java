package com.example.demo.model.mongo;

import com.example.demo.model.mongo.enums.PrescriptionStatus;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Document(collection = "prescriptions")
public class Prescription {
    
    @Id
    private String id;
    
    @Indexed
    private Long patientId;
    
    private String medication;
    private String dosage;
    private String frequency;
    private LocalDate startDate;
    private LocalDate endDate;
    
    @Indexed
    private Long prescribedBy;
    
    @Indexed
    private PrescriptionStatus status;
    
    private Integer refills;
    private Pharmacy pharmacy;
    
    // Getters and Setters
}