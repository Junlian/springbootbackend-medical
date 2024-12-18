package com.example.demo.repository.mongo;

import com.example.demo.model.mongo.MedicalRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalRecordRepository extends MongoRepository<MedicalRecord, String> {
    Page<MedicalRecord> findByPatientId(Long patientId, Pageable pageable);
    Page<MedicalRecord> findByDoctorId(String doctorId, Pageable pageable);
    Page<MedicalRecord> findByPatientIdAndStatus(Long patientId, String status, Pageable pageable);
} 