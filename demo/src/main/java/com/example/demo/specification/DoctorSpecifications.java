package com.example.demo.specification;

import com.example.demo.criteria.DoctorSearchCriteria;
import com.example.demo.entity.Doctor;
import org.springframework.data.jpa.domain.Specification;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class DoctorSpecifications {
    
    public static Specification<Doctor> withSearchCriteria(DoctorSearchCriteria criteria) {
        return (Root<Doctor> root, CriteriaQuery<?> query, CriteriaBuilder cb) -> {
            List<Predicate> predicates = new ArrayList<>();
            
            if (criteria.getName() != null && !criteria.getName().isEmpty()) {
                predicates.add(cb.like(cb.lower(root.get("name")), 
                    "%" + criteria.getName().toLowerCase() + "%"));
            }
            
            if (criteria.getSpecialization() != null && !criteria.getSpecialization().isEmpty()) {
                predicates.add(cb.equal(root.get("specialization"), 
                    criteria.getSpecialization()));
            }
            
            if (criteria.getCity() != null && !criteria.getCity().isEmpty()) {
                predicates.add(cb.equal(root.get("city"), 
                    criteria.getCity()));
            }
            
            if (criteria.getIsAvailable() != null) {
                predicates.add(cb.equal(root.get("isAvailable"), 
                    criteria.getIsAvailable()));
            }
            
            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }
}