package com.ust.DoctorService.service;
import com.ust.DoctorService.Feign.AppointmentClient;
import com.ust.DoctorService.client.Appointment;
import com.ust.DoctorService.client.Fullresponse;
import com.ust.DoctorService.model.Doctor;
import com.ust.DoctorService.repository.Doctorrepo;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private Doctorrepo repo;
    @Autowired
    private AppointmentClient client;

    public Doctor addDoctor(Doctor doctor) {
        return repo.save(doctor);
    }


    public Fullresponse findDoctorByDoctorId(String doctorId) {
        Doctor d = repo.findByDoctorId(doctorId);
        List<Appointment> list = client.FindAppointmentByDoctorId(doctorId);
        Fullresponse res = new Fullresponse();
        res.setDoctorId(d.getDoctorId());
        res.setDoctorName(d.getDoctorName());
        res.setSpeciality(d.getSpeciality());
        res.setDepartment(d.getDepartment());
        res.setContactno(d.getContactno());
        res.setSpeciality(d.getSpeciality());
        res.setHospital_name(d.getHospital_name());
        res.setAppointment(list);

        return res;

    }

}





