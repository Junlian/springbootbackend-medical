package com.example.demo.model.mongo;

import com.example.demo.model.mongo.enums.RecordType;
import com.example.demo.model.mongo.enums.RecordStatus;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Document(collection = "medical_records")
public class MedicalRecord {
    @Id
    private String id;
    
    @NotNull @Indexed private Long patientId;
    @NotNull @Indexed private Long doctorId;
    @NotNull @Indexed private LocalDateTime date;
    @NotNull @Indexed private RecordType type;
    @NotNull @Indexed private RecordStatus status;
    
    private String diagnosis;
    private String notes;
    private List<Attachment> attachments;
    private Metadata metadata;
    
    @Data
    public static class Attachment {
        private String fileId;
        private String fileName;
        private String fileType;
        private LocalDateTime uploadDate;
    }
    
    @Data
    public static class Metadata {
        private String facility;
        private String department;
        private Long createdBy;
        private Long lastModifiedBy;
        private LocalDateTime createdAt;
        private LocalDateTime lastModifiedAt;
    }
}