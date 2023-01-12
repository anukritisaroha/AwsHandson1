package com.cognizant.EmployeeApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.EmployeeApi.model.Employee;
import com.cognizant.EmployeeApi.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepo employeeRepo;
	

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepo.save(employee);
		return employee;
	}

	@Override
	public Employee deleteEmployee(int id) {
		// TODO Auto-generated method stub
		Employee emp=employeeRepo.findById(id).get();
		employeeRepo.deleteById(id);
		return emp;
	}

	@Override
	public Employee updateEmployee(int id, Employee employee) {
		// TODO Auto-generated method stub
		Optional<Employee> optEmp=employeeRepo.findById(id);
		if(!optEmp.isPresent()) {
			throw new RuntimeException("Employee doesn't exist");
			
		}
		Employee emp=optEmp.get();
		if(employee.getName()!=null) {
			emp.setName(employee.getName());
			
		}
		if(employee.getGender()!=null) {
			emp.setGender(employee.getGender());
		}
		if(employee.getAge()!=0) {
			emp.setAge(employee.getAge());
		}
		if(employee.getSalary()!=0) {
			emp.setSalary(employee.getSalary());
		}
		employeeRepo.save(emp);
		return employee;
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(id).get();
	}

	
}
