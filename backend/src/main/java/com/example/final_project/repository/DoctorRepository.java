package com.example.final_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.final_project.entity.Doctor;

import java.util.Optional;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
	
	Optional<Doctor> findByEmail(String email);
	
	
}
