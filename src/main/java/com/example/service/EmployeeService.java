package com.example.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.pojo.Employee;

@Service
@Transactional
public class EmployeeService {
	
	//实体管理器
	@PersistenceContext
	EntityManager em;
	
	public List<Employee> findEmployees(){
		String jpql = "select e from Employee e";
		TypedQuery<Employee> typedQuery = em.createQuery(jpql, Employee.class);
		List<Employee> list = typedQuery.getResultList();
		return list;
	}
	public Employee queryOne(long id) {
		TypedQuery<Employee> query = em.createNamedQuery("queryByKey",Employee.class).setParameter("eid",id);
		Employee employee = query.getSingleResult();
		return employee;
	}	
	public Employee queryOne2(String ename) {
		TypedQuery<Employee> query = em.createQuery("select e from Employee e where e.ename=:ename",Employee.class).setParameter("ename", ename);
		Employee employee = query.getSingleResult();
		return employee;
	}	
	
}
