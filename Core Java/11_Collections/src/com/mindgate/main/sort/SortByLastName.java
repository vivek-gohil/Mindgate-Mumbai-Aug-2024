package com.mindgate.main.sort;

import java.util.Comparator;

import com.mindgate.main.domain.Employee;

public class SortByLastName implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getLastName().compareTo(e2.getLastName());
	}

}
