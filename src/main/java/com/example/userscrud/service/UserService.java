package com.example.userscrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.userscrud.entity.User;

@Service
public interface UserService {
	
	List<User> getAllUsers();
	User createUser(User user);
	User getUser(String email);
	void deleteUser(String email);
	
	List<User> findByName(String name);
	
}
