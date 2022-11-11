package com.BikkadIT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Usercontroller {

	@GetMapping("/")
	public String Welcome() {
		
		return "index";
	}
	
	
	
}
