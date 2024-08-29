package com.mindgate.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.service.EmployeeService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
@RequestMapping("/employeecrud")
public class EmployeeCRUDController {
	private final EmployeeService employeeService;

	@RequestMapping("/")
	public ModelAndView getAllEmployeesFromDB() {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("employeeList", employeeService.getAllEmployees());
		return modelAndView;
	}

	@RequestMapping("/addnewemployee")
	public String showAddNewEmployeePage(Model model) {
		model.addAttribute("employee", new Employee());
		return "newemployee";
	}

	@RequestMapping("/saveemployee")
	public String saveEmployeeToDB(@Valid Employee employee, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			System.out.println("in controller start");
			System.out.println(bindingResult.getFieldValue("firstName"));
			System.out.println("in controller end");
			return "newemployee";
		} else {
			employeeService.addNewEmployee(employee);
			return "redirect:/employeecrud/";
		}
	}

	@RequestMapping("/update/{employeeId}")
	public ModelAndView showSingleEmployeePage(@PathVariable int employeeId) {
		System.out.println("Selected employeeId = " + employeeId);
		Employee employee = employeeService.getEmployeeByEmployeeId(employeeId);

		ModelAndView modelAndView = new ModelAndView("updateemployee");
		modelAndView.addObject("employee", employee);
		return modelAndView;

	}

	@RequestMapping("/saveupdatedemployee")
	public String updateEmployeeToDB(Employee employee) {
		employeeService.updateEmployee(employee);
		return "redirect:/employeecrud/";
	}

	@RequestMapping("/delete/{employeeId}")
	public String deleteEmployeeFromDB(@PathVariable int employeeId) {
		employeeService.deleteEmployeeByEmployeeId(employeeId);
		return "redirect:/employeecrud/";
	}
}
