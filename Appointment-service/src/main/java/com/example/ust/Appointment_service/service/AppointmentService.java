package com.example.ust.Appointment_service.service;

import com.example.ust.Appointment_service.dto.Appointmentdto;
import com.example.ust.Appointment_service.model.Appointment;
import com.example.ust.Appointment_service.repository.AppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepo repo;
    public Appointment addAppointment(Appointmentdto appointmentList){
        Appointment appoint1=Appointment.builder()
                .appointmentId(appointmentList.getAppointmentId())
                .patientId(appointmentList.getPatientId())
                .doctorId(appointmentList.getDoctorId())
                .appointmentDate(appointmentList.getAppointmentDate())
                .appointmentTime(appointmentList.getAppointmentTime())
                .status(appointmentList.getStatus())
                .build();
        return repo.save(appoint1);


    }
    public Appointment getAppointmentByPatientId(String patientId){
        return repo.findAppointmentByPatientId(patientId);
    }
   public List<Appointment> getAppointmentsByDoctorId(String doctorId){
        return repo.findAppointmentsByDoctorId(doctorId);
   }


}
