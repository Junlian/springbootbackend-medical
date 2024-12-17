package com.example.demo.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class AttachmentDTO {
    private String fileId;
    private String fileName;
    private String fileType;
    private LocalDateTime uploadDate;
} 