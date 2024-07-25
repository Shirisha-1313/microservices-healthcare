package com.ust.Prescription.service;

import com.ust.Prescription.dto.Prescriptiondto;
import com.ust.Prescription.model.Prescription;
import com.ust.Prescription.repository.Prescriptionrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Prescriptionservice {
    @Autowired
    private Prescriptionrepo repo;

    public Prescription addPrescription(Prescriptiondto PrescriptionList) {
        Prescription prescrip1 = Prescription.builder()
                .id(PrescriptionList.getId())
                .patientId(PrescriptionList.getPatientId())
                .doctorId(PrescriptionList.getDoctorId())
                .dosage(PrescriptionList.getDosage())
                .medication(PrescriptionList.getMedication())
                .dosage(PrescriptionList.getDosage())
                .instructions(PrescriptionList.getInstructions())
                .build();
        return repo.save(prescrip1);
    }

    public Prescription getPrescriptionByPatientId(String patientId) {
        return repo.findPrescriptiontByPatientId(patientId);
    }
}
