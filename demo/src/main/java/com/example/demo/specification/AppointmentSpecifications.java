package com.example.demo.specification;

import com.example.demo.model.mysql.Appointment;
import org.springframework.data.jpa.domain.Specification;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import com.example.demo.dto.AppointmentSearchCriteria;

public class AppointmentSpecifications {
    
    public static Specification<Appointment> withCriteria(AppointmentSearchCriteria criteria) {
        return (Root<Appointment> root, CriteriaQuery<?> query, CriteriaBuilder cb) -> {
            Predicate predicate = cb.conjunction();
            
            if (criteria.getPatientId() != null) {
                predicate = cb.and(predicate,
                    cb.equal(root.get("patient").get("id"), criteria.getPatientId())
                );
            }
            
            if (criteria.getDoctorId() != null) {
                predicate = cb.and(predicate,
                    cb.equal(root.get("doctor").get("id"), criteria.getDoctorId())
                );
            }
            
            if (criteria.getStartDate() != null && criteria.getEndDate() != null) {
                predicate = cb.and(predicate,
                    cb.between(root.get("dateTime"), 
                        criteria.getStartDate(), 
                        criteria.getEndDate())
                );
            }
            
            if (criteria.getStatus() != null) {
                predicate = cb.and(predicate,
                    cb.equal(root.get("status"), criteria.getStatus())
                );
            }
            
            return predicate;
        };
    }
}