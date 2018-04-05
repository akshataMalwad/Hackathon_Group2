package com.hackathonG2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HackthonUsersController {

	@RequestMapping("/")
	public ModelAndView welcome() {
		System.out.println("IN COntroller..");
		String message = "HELLO SPRING MVC";  
		return new ModelAndView("welcome", "message", message);  
	}
}
