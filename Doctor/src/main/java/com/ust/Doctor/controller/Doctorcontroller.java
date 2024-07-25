package com.ust.Doctor.controller;

import com.ust.Doctor.model.Doctor;
import com.ust.Doctor.service.Doctorservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class Doctorcontroller {
    @Autowired
    private Doctorservice doctorservice;
    @PostMapping("/addDoctor")
    public Doctor addDoctor(@RequestBody Doctor doctor){
        return doctorservice.addDoctor(doctor);
    }
    @GetMapping("/getAllDoctors")
    public List<Doctor> getAllDoctors(){
        return doctorservice.getAllDoctors();
    }

}
