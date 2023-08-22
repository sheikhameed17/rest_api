package com.sheik.restapi.Day2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController2 {
	
	@Value("${var}")
	private String name;
	@GetMapping("/disp")
	public String getName() {
		return "Welcome "+name;
	}
}