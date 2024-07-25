package com.example.ust.patient_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    //@GeneratedValue(strategy= GenerationType.IDENTITY)
    private String patientId;//pk//fk
    private String firstName;
    private String lastName;
    private String dob;
    private String gender;
    private String medical_history;
}
