package com.example.demo.repository.jpa;

import com.example.demo.model.mysql.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import java.time.LocalDateTime;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>, JpaSpecificationExecutor<Appointment> {
    
    @Query("SELECT a FROM Appointment a WHERE a.doctor.id = :doctorId AND a.dateTime BETWEEN :start AND :end")
    List<Appointment> findByDoctorAndDateTimeBetween(Long doctorId, LocalDateTime start, LocalDateTime end);
    
    @Query("SELECT COUNT(a) > 0 FROM Appointment a WHERE a.doctor.id = :doctorId AND a.dateTime = :dateTime AND a.status = 'SCHEDULED'")
    boolean existsByDoctorAndDateTime(Long doctorId, LocalDateTime dateTime);
} 