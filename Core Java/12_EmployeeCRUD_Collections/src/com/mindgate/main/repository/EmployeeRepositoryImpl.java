package com.mindgate.main.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.mindgate.main.domain.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	private List<Employee> employeeList = new ArrayList<Employee>();

	@Override
	public Employee addNewEmployee(Employee employee) {
		employeeList.add(employee);
		return employee;
	}

	@Override
	public Employee updateSalary(Employee employee) {

		Employee employeeFromDB = getEmployeeByEmployeeId(employee.getEmployeeId());

		if (employeeFromDB != null) {
			employeeFromDB.setSalary(employee.getSalary());
			return employeeFromDB;
		}
		return null;
	}

	@Override
	public Employee updateFirstNameLastName(Employee employee) {
		Employee employeeFromDB = getEmployeeByEmployeeId(employee.getEmployeeId());

		if (employeeFromDB != null) {
			employeeFromDB.setFirstName(employee.getFirstName());
			employeeFromDB.setLastName(employee.getLastName());
			return employeeFromDB;
		}
		return null;
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		Iterator<Employee> employeeIterator = employeeList.iterator();

		while (employeeIterator.hasNext()) {
			Employee employee = (Employee) employeeIterator.next();
			if (employee.getEmployeeId() == employeeId) {
				employeeIterator.remove();
				return true;
			}
		}
		return false;
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		Iterator<Employee> employeeIterator = employeeList.iterator();

		while (employeeIterator.hasNext()) {
			Employee employee = (Employee) employeeIterator.next();
			if (employee.getEmployeeId() == employeeId) {
				return employee;
			}
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeList;
	}

}
