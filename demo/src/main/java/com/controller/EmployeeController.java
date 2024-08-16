package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.repository.EmployeeRepository;


import jakarta.transaction.Transactional;

@RestController
@Transactional
@CrossOrigin
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	

}
