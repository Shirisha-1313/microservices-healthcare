package com.ust.Prescription.repository;

import com.ust.Prescription.model.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Prescriptionrepo extends JpaRepository<Prescription,String> {
    Prescription findPrescriptiontByPatientId(String patientId);

}
