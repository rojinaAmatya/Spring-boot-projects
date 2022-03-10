package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welcome")

public class WelcomeController {
	
	@RequestMapping("/index")
	public String index(Model model) {
		//set data in Model to send to UI
		
		model.addAttribute("msg","Hey User, how are you?");
		return "index";
		
		
	}

}
