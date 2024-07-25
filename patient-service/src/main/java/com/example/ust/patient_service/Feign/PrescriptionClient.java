package com.example.ust.patient_service.Feign;

import com.example.ust.patient_service.client.Appointment;
import com.example.ust.patient_service.client.Prescription;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="Prescription", url="http://localhost:9005/prescription")
public interface PrescriptionClient {
    @GetMapping("getPrescription/{patientId}")
    Prescription FindPrescriptionByPatientId(@PathVariable("patientId") String patientId);
}
