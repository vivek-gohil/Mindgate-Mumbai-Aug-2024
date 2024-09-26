package com.mindgate.main.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.dto.EmployeeDto;
import com.mindgate.main.dto.ResponseDto;
import com.mindgate.main.service.EmployeeService;

@RestController
@RequestMapping("employeecrudapi")
public class EmployeeCRUDController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeCRUDController.class);
	private final EmployeeService employeeService;

	public EmployeeCRUDController(EmployeeService employeeService) {
		this.employeeService = employeeService;
		LOGGER.info("EmployeeCRUDController Object Created");
	}

	@GetMapping("employees/employee/{employeeId}")
	public ResponseEntity<EmployeeDto> getSingleEmployeeFromDB(@PathVariable int employeeId) {
		return ResponseEntity.status(HttpStatus.OK).body(employeeService.getEmployeeByEmployeeId(employeeId));
	}

	@GetMapping("employees")
	public ResponseEntity<List<EmployeeDto>> getAllEmployeeFromDB() {
		return ResponseEntity.status(HttpStatus.OK).body(employeeService.getAllEmployees());
	}

	@PostMapping("employees/employee")
	public ResponseEntity<EmployeeDto> saveEmployeeToDB(@RequestBody EmployeeDto employeedto) {
		return ResponseEntity.status(HttpStatus.OK).body(employeeService.addNewEmployee(employeedto));
	}

	@PutMapping("employees/employee")
	public ResponseEntity<EmployeeDto> updateEmployeeToDB(@RequestBody EmployeeDto employeedto) {
		return ResponseEntity.status(HttpStatus.OK).body(employeeService.updateEmployee(employeedto));
	}

	@DeleteMapping("employees/employee/{employeeId}")
	public ResponseEntity<ResponseDto> deleteEmployeeFromDB(@PathVariable int employeeId) {
		boolean result = employeeService.deleteEmployeeByEmployeeId(employeeId);
		if (result)
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseDto("200", "Employee deleted successfully"));
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseDto("404", "Failed to delete employee"));
	}

}
