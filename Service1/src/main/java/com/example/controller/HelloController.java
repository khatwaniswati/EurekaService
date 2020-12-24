package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/display")
	public String displayServiceA() {
		// return "Service A working";
		String result = restTemplate.getForObject("http://serviceB/displayB", String.class);
		System.out.println(result);
		return result;

	}

	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name") String name) {
		return new String("GM : " + name);
	}
}
