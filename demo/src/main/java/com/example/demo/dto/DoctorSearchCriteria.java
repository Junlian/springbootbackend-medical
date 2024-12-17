package com.example.demo.dto;

import lombok.Data;

@Data
public class DoctorSearchCriteria {
    private String name;
    private String specialization;
    private String availability;
    private String location;
    private Boolean acceptingNewPatients;
} 