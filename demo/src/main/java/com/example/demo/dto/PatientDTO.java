package com.example.demo.dto;

import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
public class PatientDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String email;
    private String phone;
    private String address;
    private List<EmergencyContactDTO> emergencyContacts;
} 