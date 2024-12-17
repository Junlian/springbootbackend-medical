package com.example.demo.repository.mongo;

import com.example.demo.model.mongo.MedicalRecord;
import com.example.demo.model.mongo.enums.RecordType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import java.time.LocalDateTime;
import java.util.List;

public interface MedicalRecordRepository extends MongoRepository<MedicalRecord, String> {
    
    List<MedicalRecord> findByPatientIdOrderByDateDesc(Long patientId);
    
    List<MedicalRecord> findByDoctorIdAndDateBetween(Long doctorId, LocalDateTime start, LocalDateTime end);
    
    @Query("{'patientId': ?0, 'type': ?1}")
    List<MedicalRecord> findByPatientIdAndType(Long patientId, RecordType type);
    
    @Query("{'patientId': ?0, 'date': {$gte: ?1, $lte: ?2}}")
    List<MedicalRecord> findByPatientIdAndDateRange(Long patientId, LocalDateTime start, LocalDateTime end);
} 