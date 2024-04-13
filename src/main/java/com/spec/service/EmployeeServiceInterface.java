package com.spec.service;

import java.util.List; 

import com.spec.entities.Employee;

public interface EmployeeServiceInterface {
	
	public List<Employee> getAllEmployees();
	public Employee addEmployee(Employee employee);
	public Employee getEmployeeById(int id);
	public Employee updateEmployee(int id);
	public void deleteEmployee(int id);
}
