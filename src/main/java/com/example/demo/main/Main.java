package com.example.demo.main;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/welcome")

public class Main {
	@GetMapping("/welcome")
	public String Welcome()
	{
		return "Welcome String Boot!";
	}

}
