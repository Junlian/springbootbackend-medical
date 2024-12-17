package com.example.demo.model.mysql;

import lombok.Data;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "coverage_details")
public class CoverageDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "insurance_info_id", nullable = false)
    private InsuranceInfo insuranceInfo;
    
    @Column(nullable = false)
    private BigDecimal deductible;
    
    @Column(nullable = false)
    private BigDecimal copayment;
    
    @Column(nullable = false)
    private BigDecimal coinsurance;
    
    @Column(nullable = false)
    private BigDecimal outOfPocketMax;
    
    @Column(nullable = false)
    private Boolean requiresPreAuth;
    
    @Column(nullable = false)
    private String coverageLevel;
}