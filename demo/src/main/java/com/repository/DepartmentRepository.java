package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.entity.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {

}
