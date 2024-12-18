package com.example.demo.dto;

import lombok.Data;

@Data
public class AvailabilityDTO {
    private Long id;
    private Long doctorId;
    private String dayOfWeek;
    private String startTime;
    private String endTime;
    private String date;
} 