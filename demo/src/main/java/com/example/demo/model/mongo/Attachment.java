package com.example.demo.model.mongo;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@Document(collection = "attachments")
public class Attachment {
    private String fileId;
    private String fileName;
    private String fileType;
    private LocalDateTime uploadDate;
}