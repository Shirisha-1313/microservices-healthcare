package com.example.ust.patient_service.repository;

import com.example.ust.patient_service.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<Patient,String> {

    Patient findByPatientId(String patientId);
}
