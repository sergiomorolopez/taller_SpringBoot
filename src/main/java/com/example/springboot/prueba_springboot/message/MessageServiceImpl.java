package com.example.springboot.prueba_springboot.message;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService{
	 @Value("${course.message:course.default-message}")
	 private String message;
	 
	 @Override
	 public String getMessage() {
		 return message;
	 }
}