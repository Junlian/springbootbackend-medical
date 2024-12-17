package com.example.demo.model.mysql;

import com.example.demo.model.mysql.enums.AppointmentStatus;
import com.example.demo.model.mysql.enums.AppointmentType;
import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;
    
    @Column(nullable = false)
    private LocalDateTime dateTime;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AppointmentType type;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AppointmentStatus status = AppointmentStatus.SCHEDULED;
    
    private String notes;
    private String cancellationReason;
} 