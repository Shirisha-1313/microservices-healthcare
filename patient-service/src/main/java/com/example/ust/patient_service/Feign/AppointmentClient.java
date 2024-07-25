package com.example.ust.patient_service.Feign;

import com.example.ust.patient_service.client.Appointment;
import com.example.ust.patient_service.client.Fullresponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="AppointmentService", url="http://localhost:9002/appointment")
public interface AppointmentClient {
    @GetMapping("get/{patientId}")
    Appointment FindAppointmentByPatientId(@PathVariable("patientId") String patientId);
}
