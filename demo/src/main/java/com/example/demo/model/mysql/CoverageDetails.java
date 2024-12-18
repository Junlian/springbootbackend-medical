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
    
    private BigDecimal deductible;
    private BigDecimal copayment;
    
    @Column(name = "out_of_pocket_max")
    private BigDecimal outOfPocketMax;
    
    @Column(name = "coverage_type")
    private String coverageType;
}