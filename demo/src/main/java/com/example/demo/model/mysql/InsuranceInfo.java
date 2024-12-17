package com.example.demo.model.mysql;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "insurance_info")
public class InsuranceInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;
    
    @Column(nullable = false)
    private String provider;
    
    @Column(nullable = false)
    private String policyNumber;
    
    private String groupNumber;
    
    @Column(nullable = false)
    private LocalDate effectiveDate;
    
    private LocalDate expirationDate;
    
    @Column(nullable = false)
    private String planType;
    
    @OneToOne(mappedBy = "insuranceInfo", cascade = CascadeType.ALL, orphanRemoval = true)
    private CoverageDetails coverage;
} 