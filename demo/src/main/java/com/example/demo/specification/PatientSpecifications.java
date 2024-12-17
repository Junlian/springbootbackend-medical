package com.example.demo.specification;

import com.example.demo.criteria.PatientSearchCriteria;
import com.example.demo.model.mysql.Patient;
import org.springframework.data.jpa.domain.Specification;
import jakarta.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

public class PatientSpecifications {
    public static Specification<Patient> withCriteria(PatientSearchCriteria criteria) {
        return (root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<>();
            
            if (criteria.getName() != null) {
                predicates.add(cb.like(cb.lower(root.get("name")), "%" + criteria.getName().toLowerCase() + "%"));
            }
            
            if (criteria.getEmail() != null) {
                predicates.add(cb.equal(root.get("email"), criteria.getEmail()));
            }
            
            if (criteria.getPhone() != null) {
                predicates.add(cb.equal(root.get("phone"), criteria.getPhone()));
            }
            
            if (criteria.getInsuranceNumber() != null) {
                predicates.add(cb.equal(root.get("insuranceNumber"), criteria.getInsuranceNumber()));
            }
            
            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }
} 