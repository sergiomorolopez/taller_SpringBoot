package com.example.springboot.prueba_springboot.message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/")
public class MessageRestController {
	
	@Autowired
	private MessageService service;
	
	@GetMapping(value = "messages")
	public String holaMundo(){
		return service.getMessage();
	}
}