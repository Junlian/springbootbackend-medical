package com.example.demo.service.impl;

import com.example.demo.service.PrescriptionService;
import com.example.demo.dto.PrescriptionDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {
    @Override
    public PrescriptionDTO createPrescription(PrescriptionDTO prescriptionDTO) {
        return prescriptionDTO;
    }

    @Override
    public PrescriptionDTO getPrescriptionById(Long id) {
        return new PrescriptionDTO();
    }

    @Override
    public Page<PrescriptionDTO> getPatientPrescriptions(Long patientId, int page, int size) {
        return Page.empty();
    }

    @Override
    public PrescriptionDTO updatePrescription(Long id, PrescriptionDTO prescriptionDTO) {
        return prescriptionDTO;
    }

    @Override
    public PrescriptionDTO refillPrescription(Long id) {
        return new PrescriptionDTO();
    }
} 