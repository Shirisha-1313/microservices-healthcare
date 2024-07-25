package com.example.ust.Appointment_service.controller;

import com.example.ust.Appointment_service.dto.Appointmentdto;
import com.example.ust.Appointment_service.model.Appointment;
import com.example.ust.Appointment_service.service.AppointmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
    @Autowired
    private AppointmentService service;

    @PostMapping("/addAppointment")
    public ResponseEntity<Appointment> addAppointment(@RequestBody @Valid Appointmentdto appointmentList) {
        return new ResponseEntity<>(service.addAppointment(appointmentList), HttpStatus.CREATED);
    }

    @GetMapping("get/{patientId}")
    public ResponseEntity<Appointment> getAppointmentsByPatientId(@PathVariable String patientId) {
        return ResponseEntity.ok(service.getAppointmentByPatientId(patientId));
    }

    @GetMapping("getAppointmentsByDoctorId/{doctorId}")
    public ResponseEntity<List<Appointment>> getAppointmentsByDoctorId(@PathVariable String doctorId) {
        return ResponseEntity.ok(service.getAppointmentsByDoctorId(doctorId));
    }


}
