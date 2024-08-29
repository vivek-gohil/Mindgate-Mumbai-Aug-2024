package com.mindgate.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	public EmployeeController() {
		System.out.println("EmployeeController object created");
	}

	@RequestMapping("savedetails")
	public String getEmployeeName(@RequestParam String employeeName) {
		System.out.println("In getEmployeeName() ");
		System.out.println(employeeName);
		return "redirect:/";
	}

	@RequestMapping("getcities")
	public ModelAndView getAllCities() {
		System.out.println("in getAllCities");
		ModelAndView modelAndView = new ModelAndView();
		String[] cities = { "Mumbai", "Chennai", "Hyderabad", "Delhi" };

		modelAndView.setViewName("printcities");
		modelAndView.addObject("allCities", cities);
		return modelAndView;
	}
}
