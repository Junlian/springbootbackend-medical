package com.example.demo.repository;

import com.example.demo.model.mysql.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    List<Doctor> findByIsAvailableTrue();
    Page<Doctor> findBySpecialization(String specialization, Pageable pageable);
} 