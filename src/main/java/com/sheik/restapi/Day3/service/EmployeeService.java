package com.sheik.restapi.Day3.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sheik.restapi.Day3.model.Employee;
import com.sheik.restapi.Day3.repository.EmpRepo;

@Service
public class EmployeeService {
	@Autowired
	EmpRepo em;
	
	public Employee saveDetails(Employee E) {
		return em.save(E);
	}
	
	public List<Employee> getDetails(){
		return em.findAll();
	}
	
}