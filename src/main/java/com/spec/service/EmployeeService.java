package com.spec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spec.entities.Employee;
import com.spec.repository.EmployeeRepository;

@Service 
public class EmployeeService implements EmployeeServiceInterface{

	@Autowired
	EmployeeRepository repository;
	
	@Override
	public List<Employee> getAllEmployees() {
		
		return repository.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return repository.save(employee);
	}
	@Override
	public Employee getEmployeeById(int id) {
		//findById(id) returns an Optional class object
		//get() method helps to read employee object from the Optional object
		return repository.findById(id).get();
	}

	@Override
	public Employee updateEmployee(int id) {
		Employee e=repository.findById(id).get();
		e.setEmployeeSalary(150000);
		return repository.save(e);
	}

	@Override
	public void  deleteEmployee(int id) {
		Employee e=repository.findById(id).get();
		repository.delete(e);
		System.out.println("Employee deleted");
	}
	
	
	

}
