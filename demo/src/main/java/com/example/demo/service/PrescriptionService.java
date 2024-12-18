package com.example.demo.service;

import com.example.demo.dto.PrescriptionDTO;
import org.springframework.data.domain.Page;

public interface PrescriptionService {
    PrescriptionDTO createPrescription(PrescriptionDTO prescriptionDTO);
    PrescriptionDTO getPrescriptionById(Long id);
    Page<PrescriptionDTO> getPatientPrescriptions(Long patientId, int page, int size);
    PrescriptionDTO updatePrescription(Long id, PrescriptionDTO prescriptionDTO);
    PrescriptionDTO refillPrescription(Long id);
} 