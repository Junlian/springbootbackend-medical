package com.example.demo.specification;

import com.example.demo.criteria.PatientSearchCriteria;
import com.example.demo.model.mysql.Patient;
import org.springframework.data.jpa.domain.Specification;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PatientSpecifications {
    
    public static Specification<Patient> withSearchCriteria(PatientSearchCriteria criteria) {
        return (Root<Patient> root, CriteriaQuery<?> query, CriteriaBuilder cb) -> {
            List<Predicate> predicates = new ArrayList<>();
            
            if (criteria.getName() != null && !criteria.getName().isEmpty()) {
                predicates.add(cb.like(cb.lower(root.get("name")), 
                    "%" + criteria.getName().toLowerCase() + "%"));
            }
            
            if (criteria.getEmail() != null && !criteria.getEmail().isEmpty()) {
                predicates.add(cb.like(root.get("email"), 
                    "%" + criteria.getEmail() + "%"));
            }
            
            if (criteria.getPhone() != null && !criteria.getPhone().isEmpty()) {
                predicates.add(cb.like(root.get("phone"), 
                    "%" + criteria.getPhone() + "%"));
            }
            
            if (criteria.getInsuranceNumber() != null && !criteria.getInsuranceNumber().isEmpty()) {
                predicates.add(cb.like(root.get("insuranceNumber"), 
                    "%" + criteria.getInsuranceNumber() + "%"));
            }
            
            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }
} 