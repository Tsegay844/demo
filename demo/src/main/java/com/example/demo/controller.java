package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@GetMapping("/Welcome")
	public String Welcome() {
		return "welcome buddy";
	}

}
