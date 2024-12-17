package com.example.demo.model.mysql;

import com.example.demo.model.mysql.enums.DayOfWeek;
import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "doctor_availability")
public class Availability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DayOfWeek dayOfWeek;
    
    @Column(nullable = false)
    private LocalTime startTime;
    
    @Column(nullable = false)
    private LocalTime endTime;
} 