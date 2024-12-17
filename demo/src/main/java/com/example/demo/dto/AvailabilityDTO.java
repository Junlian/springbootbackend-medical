package com.example.demo.dto;

import com.example.demo.model.mysql.enums.DayOfWeek;
import lombok.Data;
import java.time.LocalTime;

@Data
public class AvailabilityDTO {
    private Long id;
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;
} 