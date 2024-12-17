package com.example.demo.model.mysql;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "emergency_contacts")
public class EmergencyContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String relationship;
    
    @Column(nullable = false)
    private String phone;
    
    private String email;
} 