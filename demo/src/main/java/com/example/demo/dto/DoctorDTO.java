package com.example.demo.dto;

import lombok.Data;
import java.util.List;

@Data
public class DoctorDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String specialization;
    private String email;
    private String phone;
    private String licenseNumber;
    private List<String> qualifications;
    private List<AvailabilityDTO> availability;
} 