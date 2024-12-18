package com.example.demo.dto;

import lombok.Data;

@Data
public class AttachmentDTO {
    private String id;
    private String fileName;
    private String fileType;
    private String filePath;
    private Long size;
    private String uploadDate;
} 