package com.ust.Doctor.repository;

import com.ust.Doctor.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Doctorrepo extends JpaRepository<Doctor,String> {
}
