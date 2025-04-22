package com.example.final_project.service;

import com.example.final_project.entity.User;

public interface UserService {

	public User createUser(String email, String password, String role);

}
