package com.example.final_project.service;

import java.util.List;

import com.example.final_project.dto.request.PatientRegistrationRequest;
import com.example.final_project.dto.response.PatientResponse;

public interface PatientService {

	PatientResponse getPatientByEmail(String email);

	public PatientResponse registerPatient(PatientRegistrationRequest request);

	public PatientResponse updatePatient(String email, PatientResponse response);

	public boolean deletePatient(String email);

	List<PatientResponse> getAllPatients();

}
