package com.example.demo.criteria;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorSearchCriteria {
    private String name;
    private String specialization;
    private String city;
    private Boolean isAvailable;
} 