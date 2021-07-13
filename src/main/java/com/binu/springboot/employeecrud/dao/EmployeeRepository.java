package com.binu.springboot.employeecrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.binu.springboot.employeecrud.entity.Employee;

// use @RepositoryRestResource annotation to change rest endpoint paths to use 'members' instead of 'employees'
//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
