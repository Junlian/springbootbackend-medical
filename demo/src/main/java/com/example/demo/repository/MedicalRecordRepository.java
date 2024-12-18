package com.example.demo.repository;

import com.example.demo.model.mongo.MedicalRecord;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface MedicalRecordRepository extends MongoRepository<MedicalRecord, String> {
    Optional<MedicalRecord> findByIdAndPatientId(String id, Long patientId);
    Page<MedicalRecord> findByPatientId(Long patientId, Pageable pageable);
} 