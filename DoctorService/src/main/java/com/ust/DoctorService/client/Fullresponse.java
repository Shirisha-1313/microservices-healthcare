package com.ust.DoctorService.client;
import com.ust.DoctorService.client.Appointment;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Fullresponse {
    @Id
    private String doctorId;//pk//fk
    private String doctorName;
    private String speciality;
    private int experience;
    private String contactno;
    private String hospital_name;
    private String department;
    public
    List<Appointment> appointment;

}
