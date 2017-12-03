package com.example.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pojo.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Serializable>{
	/**
	 * 根据员工姓名
	 * */
	public Employee findByEname(String ename);
	/**
	 * 根据员工编号
	 * */
	public Employee findByEid(long eid);
	
	
	
	
}
