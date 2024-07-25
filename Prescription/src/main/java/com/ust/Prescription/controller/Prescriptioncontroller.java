package com.ust.Prescription.controller;

import com.ust.Prescription.dto.Prescriptiondto;
import com.ust.Prescription.model.Prescription;
import com.ust.Prescription.service.Prescriptionservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prescription")
public class Prescriptioncontroller {
    @Autowired
    private Prescriptionservice service;
    @PostMapping("/add")
    public Prescription addPrescription(@RequestBody Prescriptiondto prescription){
        return service.addPrescription(prescription);

    }
    @GetMapping("/getPrescription/{patientId}")
    public Prescription getPrescriptionByStudentId(@PathVariable String patientId){
        return service.getPrescriptionByPatientId(patientId);
    }
}
