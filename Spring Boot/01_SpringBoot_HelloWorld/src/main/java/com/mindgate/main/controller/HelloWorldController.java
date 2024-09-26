package com.mindgate.main.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetingsapi")
public class HelloWorldController {

	// http://localhost:8080/greetingsapi/greet
	// @RequestMapping(value = "greet" , method = RequestMethod.GET)
//	@GetMapping("/greet")
//	public String doGreet() {
//		return "Hello World From Spring Boot";
//	}

	@GetMapping("/greet")
	public String doGreet(@RequestParam int employeeId) {
		return "Hello World From Spring Boot " + employeeId;
	}

	// http://localhost:8080/greetingsapi/greet
	// @RequestMapping(value = "greet" , method = RequestMethod.POST)
	@PostMapping("/greet")
	public String doPostGreet() {
		return "Hello World From Spring Boot - POST";
	}

	@PutMapping("/greet")
	public String doPutGreet() {
		return "Hello World From Spring Boot - PUT";
	}

	@DeleteMapping("/greet")
	public String doDeletGreet() {
		return "Hello World From Spring Boot - DELETE";
	}
}
