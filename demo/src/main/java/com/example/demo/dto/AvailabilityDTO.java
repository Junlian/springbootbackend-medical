package com.example.demo.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class AvailabilityDTO {
    private Long id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Boolean isAvailable;
} 