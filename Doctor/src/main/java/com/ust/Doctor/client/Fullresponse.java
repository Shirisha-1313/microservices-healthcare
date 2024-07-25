package com.ust.Doctor.client;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fullresponse {
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
