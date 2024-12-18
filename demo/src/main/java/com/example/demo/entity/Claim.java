package com.example.demo.entity;

import lombok.Data;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "claims")
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "policy_id")
    private Long policyId;
    
    @Column(name = "claim_date")
    private LocalDate claimDate;
    
    @Column(name = "claim_amount")
    private BigDecimal claimAmount;
    
    @Column(name = "status")
    private String status;
} 