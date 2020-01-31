package com.abdo.restSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloRest {
	
	@GetMapping("/hello")
	public String sayHello() {
		
		return "Hello Rest";
	}

}
