package com.example.demo.specification;

import com.example.demo.dto.AppointmentSearchCriteria;
import com.example.demo.model.mysql.Appointment;
import org.springframework.data.jpa.domain.Specification;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class AppointmentSpecifications {
    
    public static Specification<Appointment> withSearchCriteria(AppointmentSearchCriteria criteria) {
        return (Root<Appointment> root, CriteriaQuery<?> query, CriteriaBuilder cb) -> {
            List<Predicate> predicates = new ArrayList<>();
            
            if (criteria.getPatientId() != null) {
                predicates.add(cb.equal(root.get("patient").get("id"), 
                    criteria.getPatientId()));
            }
            
            if (criteria.getDoctorId() != null) {
                predicates.add(cb.equal(root.get("doctor").get("id"), 
                    criteria.getDoctorId()));
            }
            
            if (criteria.getStartDate() != null && criteria.getEndDate() != null) {
                predicates.add(cb.between(root.get("appointmentDateTime"), 
                    criteria.getStartDate(), 
                    criteria.getEndDate()));
            }
            
            if (criteria.getStatus() != null && !criteria.getStatus().isEmpty()) {
                predicates.add(cb.equal(root.get("status"), 
                    criteria.getStatus()));
            }
            
            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }
}