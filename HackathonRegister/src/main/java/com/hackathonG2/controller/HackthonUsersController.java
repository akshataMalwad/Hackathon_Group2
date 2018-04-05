package com.hackathonG2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hackathonG2.bean.HackethonUser;

@RestController
public class HackthonUsersController {

	@GetMapping("/")
	public ResponseEntity welcome() {
		System.out.println("In Controller.. welcome");
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity login (@RequestBody HackethonUser hacUser) {
		System.out.println("In Controller.. Login");
		if(hacUser.getSapId().equals("admin") && hacUser.getPassword().equalsIgnoreCase("admin123")){
			return new ResponseEntity(hacUser, HttpStatus.OK);
		} else {
			return new ResponseEntity(hacUser, HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/register")
	public ResponseEntity register(@RequestBody HackethonUser hacUser) {
		System.out.println("In Controller.. register");
		if(true) {
			return new ResponseEntity(hacUser, HttpStatus.OK);
		} else{
			return new ResponseEntity(hacUser, HttpStatus.NOT_FOUND);
		}
	}
}
