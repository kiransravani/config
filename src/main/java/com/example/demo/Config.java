package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration

public class Config {
	@Value("${app.envi}")
	private String env;
	//@Scheduled(fixedRate = 1000)
	public void test() {
		System.out.println("Env is"+ env);
	}
}
