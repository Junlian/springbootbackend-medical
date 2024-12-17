package com.example.demo.specification;

import com.example.demo.criteria.DoctorSearchCriteria;
import com.example.demo.model.mysql.Doctor;
import org.springframework.data.jpa.domain.Specification;
import jakarta.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

public class DoctorSpecifications {
    public static Specification<Doctor> withCriteria(DoctorSearchCriteria criteria) {
        return (root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<>();
            
            if (criteria.getName() != null) {
                predicates.add(cb.like(cb.lower(root.get("name")), "%" + criteria.getName().toLowerCase() + "%"));
            }
            
            if (criteria.getSpecialization() != null) {
                predicates.add(cb.equal(root.get("specialization"), criteria.getSpecialization()));
            }
            
            if (criteria.getCity() != null) {
                predicates.add(cb.like(root.get("city"), "%" + criteria.getCity() + "%"));
            }
            
            if (criteria.getIsAvailable() != null) {
                predicates.add(cb.equal(root.get("isAvailable"), criteria.getIsAvailable()));
            }
            
            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }
}