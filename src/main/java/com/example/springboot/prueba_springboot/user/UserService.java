package com.example.springboot.prueba_springboot.user;

import java.util.List;

public interface UserService {
	List<User> findAll();
	User newUser(User user);
	User updateUser(User user);
	void deleteById (User user);
}