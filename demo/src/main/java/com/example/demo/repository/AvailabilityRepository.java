package com.example.demo.repository;

import com.example.demo.model.mysql.DoctorAvailability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface AvailabilityRepository extends JpaRepository<DoctorAvailability, Long> {
    @Query("SELECT a FROM DoctorAvailability a WHERE a.doctor.id = :doctorId AND DATE(a.startTime) = :date")
    List<DoctorAvailability> findByDoctorIdAndDate(Long doctorId, LocalDate date);
    
    Optional<DoctorAvailability> findByIdAndDoctorId(Long id, Long doctorId);
    boolean existsByIdAndDoctorId(Long id, Long doctorId);
} 