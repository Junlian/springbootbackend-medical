package com.example.demo.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class MetadataDTO {
    private String facility;
    private String department;
    private Long createdBy;
    private Long lastModifiedBy;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
} 