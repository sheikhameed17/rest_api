package com.example.demo.q1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class Q1 {
	@GetMapping("/welcome")
	public String Welcome(){
		return "Welcome String Boot!";
}
}