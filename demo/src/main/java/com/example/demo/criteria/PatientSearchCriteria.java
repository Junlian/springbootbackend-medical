package com.example.demo.criteria;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientSearchCriteria {
    private String name;
    private String email;
    private String phone;
    private String insuranceNumber;
} 