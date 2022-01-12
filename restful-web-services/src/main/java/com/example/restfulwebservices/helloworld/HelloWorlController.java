package com.example.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class HelloWorlController {
	
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "hello world of spring boot";
	}
	
	@GetMapping(path="/hello-world/path-variable/{name}")
	public String helloWorlds(@PathVariable String name) {
		return "hello world of spring boot " + name;
	}
	
	
	//return bean
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorlBean() {
		return new HelloWorldBean("helloworldBean");
	}

	
	@GetMapping(path="/hello-world-bean/path-variable/{name}")
	public HelloWorldBean helloWorlBeanPath(@PathVariable String name) {
		return new HelloWorldBean(String.format("variable is %s", name));
	}
}
