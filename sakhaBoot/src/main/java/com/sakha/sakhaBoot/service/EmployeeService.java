package com.sakha.sakhaBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakha.sakhaBoot.model.Employee;
import com.sakha.sakhaBoot.repository.EmployeeRepo;




@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo repo;
	
	public Employee save(Employee emp)
	{
		
		return repo.save(emp);	
	}
	
	public Employee getEmployee(int empId)
	{
		return repo.getOne(empId);
	}
	
	public Employee getEmployeeByName(String empName) {
		return repo.findByName(empName);
	}
	
	public List<Employee> getAllEmployee()
	{
		return repo.findAll();
	}
	
	
	public void deleteEmployee(int empId)
	{
		repo.deleteById(empId);
	}

	public void update(Employee emp) {
		 repo.save(emp);
	}

	public Employee getByName(String name) {
		// TODO Auto-generated method stub
		return repo.findByName(name);
	}

}