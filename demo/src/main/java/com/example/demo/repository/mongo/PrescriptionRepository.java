package com.example.demo.repository.mongo;

import com.example.demo.model.mongo.Prescription;
import com.example.demo.model.mongo.enums.PrescriptionStatus;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrescriptionRepository extends MongoRepository<Prescription, String> {
    List<Prescription> findByPatientIdAndStatus(Long patientId, PrescriptionStatus status);
    List<Prescription> findByPrescribedBy(Long doctorId);
    List<Prescription> findByPatientIdAndStartDateBetween(Long patientId, LocalDate start, LocalDate end);
} 