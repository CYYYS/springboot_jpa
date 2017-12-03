package com.example;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.pojo.Employee;
import com.example.service.DepartmentService;
import com.example.service.EmployeeService;
import com.example.service.EmployeeService2;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	
	@Autowired
	EmployeeService2 employeeService2;
	@Autowired
	DepartmentService departmentService;
	@Test
	public void contextLoads() {
	}

	//**********测试Department的方法
	//查询所有
	@Test
	public void testFindAll() {
		departmentService.findAll();
	}
	//查询一个
	@Test
	public void testFindOne() {
		departmentService.find();
	}
	//更新
	@Test
	public void testUpdate() {
		departmentService.update();
	}
	//删除
	@Test
	public void testDelete() {
		departmentService.delete();
	}
	//增加一个
	@Test
	public void testInsert() {
		departmentService.addOne();
	}
	//************对Employee的测试
	//查询所有
	@Test
	public void testQueryAll() {
		List<Employee> list = employeeService2.findAll();
	}
	//查询单个
	@Test
	public void find1() {
		employeeService2.findOneEmp();
	}
	//增加
	@Test
	public void insertOneEmp() {
		employeeService2.addOneEmp();
	}
	//更新
	@Test
	public void updateOneEmp() {
		employeeService2.updateOne();
	}
	@Test
	public void deleteOneEmp() {
		employeeService2.deleteOne();
	}
}
