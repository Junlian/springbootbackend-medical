package com.example.demo.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class PatientDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private String insuranceNumber;
} 