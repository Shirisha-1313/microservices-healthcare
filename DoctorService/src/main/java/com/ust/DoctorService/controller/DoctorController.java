package com.ust.DoctorService.controller;


import com.ust.DoctorService.client.Fullresponse;
import com.ust.DoctorService.model.Doctor;
import com.ust.DoctorService.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorService service;

    @PostMapping("/addDoctor")
    public Doctor addDoctor(@RequestBody Doctor doctor) {
        return service.addDoctor(doctor);
    }

    @GetMapping("getAppointmentsByDoctorId/{doctorId}")
    public ResponseEntity<Fullresponse> findDoctorByDoctorId(@PathVariable("doctorId") String doctorId){
        return ResponseEntity.ok(service.findDoctorByDoctorId(doctorId));
    }
}
