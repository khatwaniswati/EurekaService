package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.data.MyPojo;

@RestController
public class SecondServiceController {

	@GetMapping("/heartbeat")
	public String heartbeat() {
		System.out.println("Hi heartbeat");
		return new String("heartbeat");
	}

	@GetMapping("/displayB")
	public String displayB() {
		String str = "Working from serviceB";
		return str;
	}

	@PostMapping(value = "/createPojo", consumes = "application/json",produces = "application/json")
	public MyPojo createPojo(@RequestBody MyPojo pojo) {
		System.out.println("Hi");
		return pojo;
	}
}
