package com.example.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pojo.Department;

public interface DepartmentRepository extends JpaRepository<Department, Serializable>{
	
}
