package com.example.demo.model.mongo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import java.time.LocalDateTime;

@Data
@Document(collection = "attachments")
public class Attachment {
    @Id
    private String id;
    private String fileName;
    private String fileType;
    private String filePath;
    private Long size;
    private LocalDateTime uploadDate;
    private String medicalRecordId;
}