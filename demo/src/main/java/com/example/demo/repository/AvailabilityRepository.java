package com.example.demo.repository;

import com.example.demo.model.mysql.Availability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface AvailabilityRepository extends JpaRepository<Availability, Long> {
    @Query("SELECT a FROM Availability a WHERE a.doctor.id = :doctorId AND DATE(a.startTime) = :date")
    List<Availability> findByDoctorIdAndDate(Long doctorId, LocalDate date);
    
    Optional<Availability> findByIdAndDoctorId(Long id, Long doctorId);
    boolean existsByIdAndDoctorId(Long id, Long doctorId);
} 