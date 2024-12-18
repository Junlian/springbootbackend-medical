package com.example.demo.repository;

import com.example.demo.entity.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Long> {
    Page<Claim> findByPolicyId(Long policyId, Pageable pageable);
} 