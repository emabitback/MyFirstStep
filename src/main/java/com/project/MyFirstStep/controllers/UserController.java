package com.project.MyFirstStep.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.MyFirstStep.models.User;

@RestController
@RequestMapping("user")
public class UserController {
	
	@RequestMapping(value = "/holamundo", method = RequestMethod.GET)
	String getString() {
		return "Hola Mundo desde Spring";
	}
	
	@RequestMapping(value = "/getuser", method = RequestMethod.GET)
	User getUser() {
		User user = new User();
		user.setName("Emanuel");
		user.setLastName("Ramirez");
		user.setEmail("emanuel_ramirez123@hotmail.com");
		return user;
	}

}