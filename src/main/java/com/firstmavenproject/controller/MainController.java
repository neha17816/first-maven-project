package com.firstmavenproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping
	public String helloworld() {
		return "Hello World!";
	}
	
	@GetMapping("/{user}")
	public String printuser(@PathVariable String user) {
		return "Hello "+ user;
	}
}
