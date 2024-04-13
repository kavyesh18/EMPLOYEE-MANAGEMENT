package com.spec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spec.entities.Employee;
import com.spec.service.EmployeeService;
@CrossOrigin("*")
@Controller
@ResponseBody
public class EmployeeController {
	@Autowired
	EmployeeService service;
	@RequestMapping("/employee")
	public List<Employee> getAllEmployees(){
		return service.getAllEmployees();
	}
	@RequestMapping(value="/employee",method=RequestMethod.POST)
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}
	@RequestMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {
		return service.getEmployeeById(id);
	}
	@RequestMapping(value="/employee/{id}",method=RequestMethod.PUT)
	public Employee updateEmployee(@PathVariable("id") int id) {
		return service.updateEmployee(id);
	}
	@RequestMapping(value="/employee/{id}",method=RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable("id") int id) {
	service.deleteEmployee(id);
	}

}
