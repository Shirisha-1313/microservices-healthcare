package com.example.ust.patient_service.client;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fullresponse {
    @Id
    //@GeneratedValue(strategy= GenerationType.IDENTITY)
    private String patientId;//pk//fk
    private String firstName;
    private String lastName;
    private String dob;
    private String gender;
    private String medical_history;
    public Appointment appointment;
    public Prescription prescription;
}
