package com.example.springboot.prueba_springboot.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	List<User> findAll();
	
	User save(User user);

	void delete(User user);
}