package com.example.demo.criteria;

import lombok.Data;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Data
public class PatientSearchCriteria {
    private String name;
    private String email;
    private String phone;
    private String insuranceNumber;
    private int page = 0;
    private int size = 20;
    private String sortBy = "name";
    private Sort.Direction direction = Sort.Direction.ASC;

    public Pageable toPageable() {
        return PageRequest.of(page, size, Sort.by(direction, sortBy));
    }
} 