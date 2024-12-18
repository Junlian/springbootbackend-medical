package com.example.demo.model.mysql;

import lombok.Data;
import jakarta.persistence.Embeddable;

@Data
@Embeddable
public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;
} 