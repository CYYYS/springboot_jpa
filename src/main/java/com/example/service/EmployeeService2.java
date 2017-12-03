package com.example.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pojo.Department;
import com.example.pojo.Employee;
import com.example.repo.DepartmentRepository;
import com.example.repo.EmployeeRepository;
@Service
public class EmployeeService2{
	
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DepartmentRepository departmentRepository;
	
	public Employee findByEname(String ename) {
		Employee emp = employeeRepository.findByEname("小明");
		return emp;
	}
	
	public Employee findByEid(long id) {
		Employee emp = employeeRepository.findByEid(2);
		return emp;
	}
	//查询所有
	public List<Employee> findAll(){
		List<Employee> list = employeeRepository.findAll();
		return list;
	}
	//查询单个
	public Employee findOneEmp() {
		Employee one = employeeRepository.findOne(1);
		System.out.println(one);
		return one;
	}
	//更新
	public void updateOne() {
		Employee one = employeeRepository.findOne(1);
		one.setSalary(new BigInteger("88888"));
		employeeRepository.saveAndFlush(one);
	}
	//删除
	public void deleteOne() {
		Employee one = employeeRepository.findOne(1);
		employeeRepository.delete(one);
	}
	//增加
	public void addOneEmp() {
		Employee one = new Employee ();
		one.setEid("10");
		Department department = departmentRepository.findOne(1);
		one.setDepartment(department);
		one.setEname("小黑");
		one.setSalary(new BigInteger("666"));
		employeeRepository.saveAndFlush(one);
	}
}
