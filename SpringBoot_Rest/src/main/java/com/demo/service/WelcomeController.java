package com.demo.service;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/welcome")
@RestController
public class WelcomeController {
	
	@RequestMapping("/hi")
	public String sayHi(){
		return "Hello world";
	}
	
	@GetMapping(value = "/bye")
	public String sayBye(){
		return "Goodbye world";
	}
	
	
	@GetMapping("/hello")
	public String sayHello(@RequestParam("name") String name) {
		return "Welcome: " + name;
		}

}
