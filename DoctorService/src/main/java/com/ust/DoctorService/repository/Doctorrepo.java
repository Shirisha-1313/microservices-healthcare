package com.ust.DoctorService.repository;

import com.ust.DoctorService.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface Doctorrepo extends JpaRepository<Doctor,String> {
    Doctor findByDoctorId(String doctorId);
}
