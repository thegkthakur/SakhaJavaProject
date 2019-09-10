package com.sakha.sakhaBoot.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int empId;
	String empName;
	String password;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	 LocalDate dob;
	float salary;
	
	public Employee(String empName, String password, LocalDate dob, float salary) {
		super();
		this.empName = empName;
		this.password = password;
		this.dob = dob;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", password=" + password + ", dob=" + dob
				+ ", salary=" + salary + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	

}