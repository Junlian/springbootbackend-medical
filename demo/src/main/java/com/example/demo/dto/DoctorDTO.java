package com.example.demo.dto;

import lombok.Data;
import java.util.List;

@Data
public class DoctorDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String specialization;
    private String licenseNumber;
    private String email;
    private String phoneNumber;
    private List<AvailabilityDTO> availabilities;
} 