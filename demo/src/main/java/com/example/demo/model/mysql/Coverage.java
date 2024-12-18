package com.example.demo.model.mysql;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "coverages")
public class Coverage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String insuranceNumber;
    private String coverageType;
    private Double coverageLimit;
    private Double deductible;
    private Boolean isActive;
    
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
} 