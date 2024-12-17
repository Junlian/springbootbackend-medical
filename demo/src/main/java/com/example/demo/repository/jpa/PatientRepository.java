package com.example.demo.repository.jpa;

import com.example.demo.model.mysql.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PatientRepository extends JpaRepository<Patient, Long>, JpaSpecificationExecutor<Patient> {
    boolean existsByEmail(String email);
} 