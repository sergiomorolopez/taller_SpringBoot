package com.example.springboot.prueba_springboot.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository usersRepository;
	
	public List<User> findAll() {
		return usersRepository.findAll();
	}
	
	public User newUser(User user) {
		System.out.println("Usuario"+user.getId()+ " guardado");
		return usersRepository.save(user);
	}
	
	public User updateUser(User user) {
		System.out.println("Usuario"+user.getId()+ " modificado");
		return usersRepository.save(user);
	}
	
	public void deleteById (User user) {
		usersRepository.delete(user);
		System.out.println("Usuario"+user.getId()+ " borrado");
	}
}
