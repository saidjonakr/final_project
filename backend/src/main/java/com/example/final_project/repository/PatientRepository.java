package com.example.final_project.repository;

//File: com.example.example.final_projectmanagement.repository.PatientRepository.java

import com.example.final_project.entity.Patient;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
	
	Optional<Patient> findByEmail(String email);

	Optional<Patient> findByPhoneNumber(String phoneNumber);
}
