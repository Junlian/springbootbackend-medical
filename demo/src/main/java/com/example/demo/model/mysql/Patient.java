package com.example.demo.model.mysql;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String firstName;
    
    @Column(nullable = false)
    private String lastName;
    
    @Column(nullable = false)
    private LocalDate dateOfBirth;
    
    @Column(nullable = false)
    private String gender;
    
    @Column(unique = true)
    private String email;
    
    private String phone;
    private String address;
    
    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EmergencyContact> emergencyContacts;
} 