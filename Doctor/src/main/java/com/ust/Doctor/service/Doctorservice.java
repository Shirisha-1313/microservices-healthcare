package com.ust.Doctor.service;

import com.ust.Doctor.model.Doctor;
import com.ust.Doctor.repository.Doctorrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Doctorservice {
    @Autowired
    private Doctorrepo repo;
    public Doctor addDoctor(Doctor doctor){
        return repo.save(doctor);
    }
    public Fullresponse findPatientByPatientId(String patientId){
        Patient p=repo.findByPatientId(patientId);
        Appointment list=client.FindAppointmentByPatientId(patientId);
        Fullresponse res=new Fullresponse();
        res.setPatientId(p.getPatientId());
        res.setFirstName(p.getFirstName());
        res.setLastName(p.getLastName());
        res.setDob(p.getDob());
        res.setGender(p.getGender());
        res.setMedical_history(p.getMedical_history());
        res.setAppointment(list);
        return res;

    }
//    public List<Doctor> getAllDoctors(){
//        return repo.findAll();
//    }

}
