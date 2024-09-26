package com.mindgate.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mindgate.main.domain.Employee;
import com.mindgate.main.dto.EmployeeDto;
import com.mindgate.main.mapper.EmployeeMapper;
import com.mindgate.main.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public EmployeeDto addNewEmployee(EmployeeDto employeeDto) {
		Employee employee = EmployeeMapper.mapToEmployee(employeeDto, new Employee());
		employee = employeeRepository.addNewEmployee(employee);
		employeeDto = EmployeeMapper.mapToEmployeeDto(employee, new EmployeeDto());
		return employeeDto;
	}

	@Override
	public EmployeeDto updateEmployee(EmployeeDto employeeDto) {
		Employee employee = EmployeeMapper.mapToEmployee(employeeDto, new Employee());
		employee = employeeRepository.updateEmployee(employee);
		employeeDto = EmployeeMapper.mapToEmployeeDto(employee, new EmployeeDto());
		return employeeDto;
	}

	@Override
	public EmployeeDto getEmployeeByEmployeeId(int employeeId) {
		Employee employee = employeeRepository.getEmployeeByEmployeeId(employeeId);
		return EmployeeMapper.mapToEmployeeDto(employee, new EmployeeDto());
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		return employeeRepository.deleteEmployeeByEmployeeId(employeeId);
	}

	@Override
	public List<EmployeeDto> getAllEmployees() {
		List<EmployeeDto> employeeDtoList = new ArrayList<>();
		for (Employee employee : employeeRepository.getAllEmployees()) {
			employeeDtoList.add(EmployeeMapper.mapToEmployeeDto(employee, new EmployeeDto()));
		}
		return employeeDtoList;
	}

}
