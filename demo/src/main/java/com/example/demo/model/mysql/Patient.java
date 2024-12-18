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
    private String name;
    
    @Column(nullable = false, unique = true)
    private String email;
    
    @Column(name = "phone_number")
    private String phone;
    
    @Column(name = "insurance_number")
    private String insuranceNumber;
    
    @Column(nullable = false)
    private LocalDate dateOfBirth;
    
    @Embedded
    private Address address;
    
    @OneToOne(mappedBy = "patient", cascade = CascadeType.ALL)
    private InsuranceInfo insuranceInfo;
    
    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;
} 