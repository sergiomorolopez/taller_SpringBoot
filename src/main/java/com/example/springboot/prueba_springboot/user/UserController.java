package com.example.springboot.prueba_springboot.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping(value = "/users")
	public List<User> getUsers(){
		List<User> users = service.findAll();
		return users;
	}
	
	@PostMapping(value = "/user")
	public User newUser(User user) {
		return service.newUser(user);
	}
	
	@PutMapping(value = "/user/{id}")
	public User updateUser(User user) {
		return service.updateUser(user);
	}
	
	@DeleteMapping(value = "/user/{id}")
	public void deleteById(User user) {
		service.deleteById(user);
	}
}