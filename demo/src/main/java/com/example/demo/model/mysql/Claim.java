package com.example.demo.model.mysql;

import com.example.demo.model.mysql.enums.ClaimStatus;
import lombok.Data;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "claims")
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "appointment_id", nullable = false)
    private Appointment appointment;
    
    @Column(unique = true, nullable = false)
    private String claimNumber;
    
    @Column(nullable = false)
    private LocalDateTime submissionDate;
    
    @Column(nullable = false)
    private BigDecimal claimAmount;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ClaimStatus status;
    
    private String denialReason;
    private LocalDateTime processedDate;
    private BigDecimal approvedAmount;
}