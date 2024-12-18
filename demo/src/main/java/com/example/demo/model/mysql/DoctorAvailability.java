package com.example.demo.model.mysql;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import com.example.demo.entity.Doctor;

@Data
@Entity
@Table(name = "availability")
public class DoctorAvailability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "start_time")
    private LocalDateTime startTime;
    
    @Column(name = "end_time")
    private LocalDateTime endTime;
    
    @Column(name = "is_available")
    private Boolean isAvailable;
    
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
} 