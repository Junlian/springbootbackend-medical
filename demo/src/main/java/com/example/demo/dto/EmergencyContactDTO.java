package com.example.demo.dto;

import lombok.Data;

@Data
public class EmergencyContactDTO {
    private Long id;
    private String name;
    private String relationship;
    private String phone;
    private String email;
} 