package com.haripriyaa.springexpensetracker.services;

import com.haripriyaa.springexpensetracker.models.User;

public interface UserService {
	public User createUser(User user);
	public User getUserByUsername(String username);
	public User saveUser(User user);
}
