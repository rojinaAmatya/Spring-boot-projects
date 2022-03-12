package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	
	@RequestMapping(value ={"/", "/register"})
	public String loadForm() {
		return "register";
	}

}
