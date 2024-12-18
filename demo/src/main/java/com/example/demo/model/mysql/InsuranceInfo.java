package com.example.demo.model.mysql;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDate;
import com.example.demo.entity.Patient;

@Data
@Entity
@Table(name = "insurance_info")
public class InsuranceInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String provider;
    
    @Column(name = "policy_number", nullable = false, unique = true)
    private String policyNumber;
    
    @Column(name = "group_number")
    private String groupNumber;
    
    @Column(name = "valid_from")
    private LocalDate validFrom;
    
    @Column(name = "valid_until")
    private LocalDate validUntil;
    
    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "coverage_details_id")
    private CoverageDetails coverageDetails;
} 