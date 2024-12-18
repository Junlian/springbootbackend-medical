package com.example.demo.model.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

@Data
@Document(collection = "medical_records")
public class MedicalRecord {
    @Id
    private String id;
    
    @Field("patient_id")
    private Long patientId;
    
    private LocalDateTime date;
    private String diagnosis;
    private String symptoms;
    private String treatment;
    private List<String> prescriptions = new ArrayList<>();
    private String notes;
    
    @Field("follow_up_instructions")
    private String followUpInstructions;
    
    @Field("next_appointment")
    private LocalDateTime nextAppointment;
    
    @Field("created_at")
    private LocalDateTime createdAt;
    
    @Field("updated_at")
    private LocalDateTime updatedAt;
    
    @Field("attachments")
    private List<Attachment> attachments = new ArrayList<>();
}