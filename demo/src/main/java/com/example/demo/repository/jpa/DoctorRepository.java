package com.example.demo.repository.jpa;

import com.example.demo.model.mysql.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DoctorRepository extends JpaRepository<Doctor, Long>, JpaSpecificationExecutor<Doctor> {
    boolean existsByEmail(String email);
    boolean existsByLicenseNumber(String licenseNumber);
} 