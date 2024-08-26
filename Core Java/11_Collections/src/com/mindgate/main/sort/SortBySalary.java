package com.mindgate.main.sort;

import java.util.Comparator;

import com.mindgate.main.domain.Employee;

public class SortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return (int) (e1.getSalary() - e2.getSalary());
	}

}
