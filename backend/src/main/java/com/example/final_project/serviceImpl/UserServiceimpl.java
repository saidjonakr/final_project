package com.example.final_project.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.final_project.entity.User;
import com.example.final_project.exception.EmailAlreadyExistsException;
import com.example.final_project.repository.UserRepository;
import com.example.final_project.service.UserService;

@Service
public class UserServiceimpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public User createUser(String email, String password, String role) {
		if (userRepository.findByEmail(email).isPresent()) {
			throw new EmailAlreadyExistsException("Email is already registered");
		}

		// Using Builder pattern to create the User object
		User user = User.builder().email(email).password(passwordEncoder.encode(password)).role(role).isActive(true)
				.build();

		return userRepository.save(user);
	}

}
