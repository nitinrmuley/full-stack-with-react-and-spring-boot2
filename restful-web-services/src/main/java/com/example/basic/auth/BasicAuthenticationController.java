package com.example.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class BasicAuthenticationController {
	
	//return bean
	@GetMapping(path="/basicauth")
	public AuthenticationBean helloWorlBean() {
		return new AuthenticationBean("You are authenticated..");
	}
}
