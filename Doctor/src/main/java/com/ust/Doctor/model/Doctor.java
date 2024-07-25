package com.ust.Doctor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
    @Id
    private String doctorId;
    private String doctorName;
    private String speciality;
    private int experience;
    private String contactno;
    private String hospital_name;
    private String department;
    private String appointentDate;
}
