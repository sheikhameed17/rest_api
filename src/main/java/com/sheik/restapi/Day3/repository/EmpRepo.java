package com.sheik.restapi.Day3.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sheik.restapi.Day3.model.Employee;

@Repository

public interface EmpRepo extends JpaRepository<Employee,Integer> {
		
	}