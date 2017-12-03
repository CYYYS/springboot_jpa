package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pojo.Department;
import com.example.repo.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	//查询所有
	public List<Department> findAll() {
		List<Department> list = departmentRepository.findAll();
		for(Department dept:list) {
			System.out.println(dept);
		}
		return list;
	}
	//查询一个
	public Department find() {
		Department one = departmentRepository.findOne(4);
		System.out.println(one);
		return one;
	}
	//更新
	public void update() {
		Department one = departmentRepository.findOne(4);
		one.setName("广播室");
		departmentRepository.saveAndFlush(one);
	}
	//删除
	public void delete() {
		Department one = departmentRepository.findOne(4);
		departmentRepository.delete(one);
	}
	//增加
	public void addOne() {
		Department dept = new Department();
		dept.setId(4);
		dept.setName("董事会");
		departmentRepository.saveAndFlush(dept);
	}
}
