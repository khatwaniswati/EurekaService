package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondServiceController {

	@GetMapping("/heartbeat")
	public String heartbeat() {
		return new String("heartbeat");
	}
	
	@GetMapping("/displayB")
	public String displayB() {
		String str = "Working from serviceB";
		return str;
	}
}
