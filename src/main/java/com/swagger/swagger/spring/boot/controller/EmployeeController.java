package com.swagger.swagger.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/employee")
	public String getEmployee() {
		return "welcome to swagger UI";
	}
	
	@PostMapping("/welcome")
    public String welcome(@RequestBody String name) {
        return "Welcome " + name;
    }

}
