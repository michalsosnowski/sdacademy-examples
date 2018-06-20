package pl.sdacademy.hr;

import java.util.ArrayList;
import java.util.List;

class HrMenager {

	private final List<Employee> allEmployees= new ArrayList<>();

	 Employee create(String firstName, String lastName, String dateOfBirth) {
		Employee employee =new Employee(firstName,lastName,dateOfBirth);
		allEmployees.add(employee);
		return employee;
	}

	 List<Employee> findAll() {
		return allEmployees;
	}
 }
