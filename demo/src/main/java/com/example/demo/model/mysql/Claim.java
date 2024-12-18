package com.example.demo.model.mysql;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "claims")
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String claimNumber;
    private LocalDateTime submissionDate;
    private BigDecimal amount;
    
    @Enumerated(EnumType.STRING)
    private ClaimStatus status;
    
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
    
    private String description;
    private String serviceProvider;
    private LocalDateTime serviceDate;
}