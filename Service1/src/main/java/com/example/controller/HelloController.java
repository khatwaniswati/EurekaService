package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.data.MyPojo;

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
	
	@PostMapping(value = "/createPojoFromA", consumes = "application/json",produces = "application/json")
	public MyPojo createPojo(@RequestBody MyPojo pojo) {
		MyPojo result = restTemplate.postForObject("http://serviceB/createPojo",pojo, MyPojo.class);
		System.out.println(result);
		return result;

	}

	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name") String name) {
		return new String("GM : " + name);
	}
}
