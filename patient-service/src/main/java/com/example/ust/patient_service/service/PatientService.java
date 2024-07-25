package com.example.ust.patient_service.service;

import com.example.ust.patient_service.Feign.AppointmentClient;
import com.example.ust.patient_service.Feign.PrescriptionClient;
import com.example.ust.patient_service.client.Appointment;
import com.example.ust.patient_service.client.Fullresponse;
import com.example.ust.patient_service.client.Prescription;
import com.example.ust.patient_service.model.Patient;
import com.example.ust.patient_service.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepo repo;
    @Autowired
    private AppointmentClient client;
    @Autowired
    private PrescriptionClient client2;
    public Patient SavePatient(Patient patient) {
        return repo.save(patient);
    }

    public Fullresponse findPatientByPatientId(String patientId) {

        Patient p = repo.findByPatientId(patientId);
        Appointment list = client.FindAppointmentByPatientId(patientId);
        Fullresponse res = new Fullresponse();
        res.setPatientId(p.getPatientId());
        res.setFirstName(p.getFirstName());
        res.setLastName(p.getLastName());
        res.setDob(p.getDob());
        res.setGender(p.getGender());
        res.setMedical_history(p.getMedical_history());
        res.setAppointment(list);
        return res;

    }
    public Fullresponse getPrescriptionByPatientId(String patientId){
        Patient p = repo.findByPatientId(patientId);
        Prescription list = client2.FindPrescriptionByPatientId(patientId);
        Fullresponse res = new Fullresponse();
        res.setPatientId(p.getPatientId());
        res.setFirstName(p.getFirstName());
        res.setLastName(p.getLastName());
        res.setDob(p.getDob());
        res.setGender(p.getGender());
        res.setMedical_history(p.getMedical_history());
        res.setPrescription(list);
        return res;

    }
}
