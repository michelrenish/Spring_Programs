package com.jsp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

@Component
public class EmployeeDao {
	@Autowired
	private EntityManager em;
	
	public void saveEmployee(Employee employee) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(employee);
		et.commit();
	}
	public List<Employee> listEmployee() {
		Query query = em.createQuery("select e from Employee e");
		List<Employee> list=query.getResultList();
		return list;
	}
	public void deleteEmp(int id) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		Employee e1 =getEmpById(id);
		em.remove(e1);
		et.commit();
	}
	public Employee getEmpById(int id) {
		return em.find(Employee.class,id);
	}
}
