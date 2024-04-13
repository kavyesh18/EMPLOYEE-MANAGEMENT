package com.spec.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="employeeName")
public class Employee {
	@NotBlank
	private String empName;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;

	private double employeeSalary;
	@Pattern(regexp="^[6789][0-9]{9}$" ,message="Please enter a valid mobile number")
	private String mobilenum;
	@Email
	private String email;
	private String address;
	@NotBlank
	private String department;
	private String designation;
	@Digits(fraction = 0, integer = 10, message ="Add your age")

	private int age;
	private char gender;
	public Employee() {
		super();
	}
	public Employee(@NotBlank String empName, int empId, double employeeSalary,
			@Pattern(regexp = "^[6789][0-9]{9}$", message = "Please enter a valid mobile number") String mobilenum,
			@Email String email, String address, @NotBlank String department, String designation,
			@Digits(fraction = 0, integer = 10, message = "Add your age") int age, char gender) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.employeeSalary = employeeSalary;
		this.mobilenum = mobilenum;
		this.email = email;
		this.address = address;
		this.department = department;
		this.designation = designation;
		this.age = age;
		this.gender = gender;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getMobilenum() {
		return mobilenum;
	}
	public void setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
}
