package com.jsp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.EmployeeDao;
import com.jsp.entity.Employee;

@Component
public class EmployeeServices {
	@Autowired
	private EmployeeDao dao; 
	
	public void saveEmployee(Employee employee) {
		dao.saveEmployee(employee);
	}
	public List<Employee> listEmployee() {
		return dao.listEmployee();
	}
	public void deleteEmp(int id) {
		dao.deleteEmp(id);
	}
}
