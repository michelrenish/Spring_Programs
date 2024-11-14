package com.jsp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.StudentDao;
import com.jsp.entity.Student;

@Component
public class StudentService {
	@Autowired
	private StudentDao dao;
	
	public void saveStudent(Student student) {
		dao.saveStudent(student);
	}
	public List<Student> getAllStudents(){
		return dao.getAllStudent();
	}
	public void deleteStudent(int id) {
		dao.deleteStudent(id);
	}
	public Student getStudentById(int id) {
		 return dao.getStudentById(id);
	}
	public void updateStudent(Student student) {
		dao.updateStudent(student);
	}
}
