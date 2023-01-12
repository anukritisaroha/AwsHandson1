package com.cognizant.EmployeeApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.EmployeeApi.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
