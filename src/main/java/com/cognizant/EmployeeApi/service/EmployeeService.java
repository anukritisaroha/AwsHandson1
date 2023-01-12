package com.cognizant.EmployeeApi.service;

import java.util.List;

import com.cognizant.EmployeeApi.model.Employee;

public interface EmployeeService {
	
	List<Employee> getEmployees();
	Employee addEmployee(Employee employee);
	Employee deleteEmployee(int id);
	Employee updateEmployee(int id,Employee employee);
	Employee getEmployeeById(int id);
	
	

}
