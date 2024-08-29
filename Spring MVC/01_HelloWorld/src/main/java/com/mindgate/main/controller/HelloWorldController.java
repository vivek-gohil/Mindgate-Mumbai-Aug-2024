package com.mindgate.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	public HelloWorldController() {
		System.out.println("HelloWorldController Object Created");
	}

	// http://localhost:8181/springmvc/
	// Mapping to index.jsp
	@RequestMapping("/")
	public String showHomePage() {
		System.out.println("in showHomePage()");
		return "index";
	}

	@RequestMapping("/next")
	public String showNextPage() {
		System.out.println("in showNextPage()");
		return "employeedetails";
	}

}
