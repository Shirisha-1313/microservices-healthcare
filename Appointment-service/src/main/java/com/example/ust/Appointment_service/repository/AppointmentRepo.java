package com.example.ust.Appointment_service.repository;

import com.example.ust.Appointment_service.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment,String> {
    Appointment findAppointmentByPatientId(String patientId);

    List<Appointment> findAppointmentsByDoctorId(String doctorId);

    // Appointment findAppointmentByDoctorId(String doctorId);

}
