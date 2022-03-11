package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WelcomeController {
	
	@RequestMapping("/first")
	//@ResponseBody
	public String index(Model model) {
		//set data in Model to send to UI
		
		model.addAttribute("msg","Hey User, how are you?");
		return "index";
		
		
	}

}
