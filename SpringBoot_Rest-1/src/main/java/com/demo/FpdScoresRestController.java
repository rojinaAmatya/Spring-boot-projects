package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FpdScoresRestController {

	//http://localhost:8081/score?ssn=1545454254154
	@GetMapping(value = "/score")
	public String getFpdScore(@RequestParam(value = "ssn", required = false,defaultValue = "15485454545") Long ssn) {
		
		System.out.println(ssn);
		
		//logic retrieve from db
		return "FPD Score is : 75";
	}
}
