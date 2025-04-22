package com.example.final_project.serviceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.final_project.dto.response.AdminResponse;
import com.example.final_project.entity.Admin;
import com.example.final_project.repository.AdminRepository;
import com.example.final_project.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;

	@Override
	public AdminResponse getAdminData(String email) {
		Admin admin = this.adminRepository.findByEmail(email);
		AdminResponse adminResponse = new AdminResponse();
		BeanUtils.copyProperties(admin, adminResponse);
		return adminResponse != null ? adminResponse : null;
	}

}
