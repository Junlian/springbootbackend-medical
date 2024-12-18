package com.example.demo.repository;

import com.example.demo.model.mysql.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Long> {
    Page<Claim> findByPatientId(Long patientId, Pageable pageable);
} 