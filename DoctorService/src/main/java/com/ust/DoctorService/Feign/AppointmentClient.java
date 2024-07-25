package com.ust.DoctorService.Feign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import  com.ust.DoctorService.client.Appointment;
import java.util.List;

@FeignClient(name="AppointmentService", url="http://localhost:9002/appointment")
public interface AppointmentClient {
    @GetMapping("getAppointmentsByDoctorId/{doctorId}")
   List<Appointment> FindAppointmentByDoctorId(@PathVariable("doctorId") String doctorId);

}
