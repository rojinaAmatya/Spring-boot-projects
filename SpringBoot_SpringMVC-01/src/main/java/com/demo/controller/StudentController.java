package com.demo.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {
	
	
	//@RequestMapping(value ={"/", "/login"})
	@GetMapping(value ={"/", "/login"})
	public String loadForm() {
		return "register";
	}
	
	
	//@RequestMapping(value = "/register", method =RequestMethod.POST)
	@PostMapping("/register")
	public String handleStudentForm(HttpServletRequest req, Model m) {
		
		int sno = Integer.parseInt(req.getParameter("sno"));
		String sname = req.getParameter("sname");
		String sadd = req.getParameter("sadd");
		m.addAttribute("sno", sno);
		m.addAttribute("sname", sname);
		m.addAttribute("sadd", sadd);
		return "sucess";
	}

}
