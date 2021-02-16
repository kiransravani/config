package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class Hello  {
	@Value("${app.envi}")
	private String env;
	@RequestMapping("/")
	
	public String hello() {
		return "Hello!!! Your Env is : "+ env;
		
	}
}
