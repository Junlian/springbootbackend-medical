package com.example.demo.model.mongo;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "pharmacies")
public class Pharmacy {
    private String name;
    private String address;
    private String phone;
} 