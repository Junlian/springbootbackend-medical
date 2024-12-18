package com.example.demo.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class CoverageDetailsDTO {
    private Long id;
    private BigDecimal deductible;
    private BigDecimal copayment;
    private BigDecimal outOfPocketMax;
    private String coverageType;
} 