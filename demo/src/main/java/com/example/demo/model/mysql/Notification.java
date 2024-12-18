package com.example.demo.model.mysql;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "notifications")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String type;
    
    @Column(nullable = false)
    private String message;
    
    @Column(nullable = false) 
    private String recipient;
    
    @Column(nullable = false)
    private String status;
    
    @Column(nullable = false)
    private LocalDateTime sentTime;
    
    private LocalDateTime deliveredTime;
    
    @ManyToOne
    @JoinColumn(name = "appointment_id")
    private Appointment appointment;
}