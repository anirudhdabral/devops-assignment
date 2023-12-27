package com.assignment.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsApplication {

	@GetMapping("/")
	public String home(){
		return "Welcome to home - devops assignment";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsApplication.class, args);
	}

}
