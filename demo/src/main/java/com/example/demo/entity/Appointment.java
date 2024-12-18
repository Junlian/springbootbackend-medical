package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Data;
import com.example.demo.entity.Patient;
import com.example.demo.entity.Doctor;

@Entity
@Table(name = "appointments")
@Data  // This will generate getters, setters, toString, etc.
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "appointment_date_time", nullable = false)
    private LocalDateTime appointmentDateTime;
    
    private String status;
    private String notes;
    
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
    
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
} 