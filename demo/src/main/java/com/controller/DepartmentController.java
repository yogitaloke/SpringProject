package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.repository.DepartmentRepository;

import jakarta.transaction.Transactional;

@RestController
@Transactional
@CrossOrigin

public class DepartmentController {
	
	@Autowired
	DepartmentRepository departmentRepository;
	

}
