package com.ust.Doctor.Feign;

@FeignClient(name="AppointmentService", url="http://localhost:9002/appointment")
public interface AppointmentClient {
}
