package com.example.demo.model.mysql;

import lombok.Data;
import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Data
@Entity
@Table(name = "doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String firstName;
    
    @Column(nullable = false)
    private String lastName;
    
    @Column(nullable = false)
    private String specialization;
    
    @Column(unique = true)
    private String email;
    
    private String phone;
    
    @Column(unique = true, nullable = false)
    private String licenseNumber;
    
    @ElementCollection
    @CollectionTable(name = "doctor_qualifications", 
        joinColumns = @JoinColumn(name = "doctor_id"))
    @Column(name = "qualification")
    private List<String> qualifications;
    
    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Availability> availabilities = new ArrayList<>();
    
    public List<Availability> getAvailabilities() {
        return availabilities;
    }
} 