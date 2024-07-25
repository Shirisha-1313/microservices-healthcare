package com.example.ust.patient_service.controller;



import com.example.ust.patient_service.client.Fullresponse;
import com.example.ust.patient_service.client.Prescription;
import com.example.ust.patient_service.model.Patient;
import com.example.ust.patient_service.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    private PatientService service;
    @PostMapping("/add")
    public Patient addPatient(Patient patient){
        return service.SavePatient(patient);
    }
    @GetMapping("get/{patientId}")
    public ResponseEntity<Fullresponse> findPatientByPatientId(@PathVariable("patientId") String patientId){
        return ResponseEntity.ok(service.findPatientByPatientId(patientId));
    }
    @GetMapping("getPrescription/{patientId}")
    public ResponseEntity<Fullresponse> findPrescriptionByPatientId(@PathVariable("patientId") String patientId){
        return ResponseEntity.ok(service.getPrescriptionByPatientId(patientId));
    }


}
