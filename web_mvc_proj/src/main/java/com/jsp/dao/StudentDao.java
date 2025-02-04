package com.jsp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

@Component
public class StudentDao {
	@Autowired
	private EntityManager em;

	public void saveStudent(Student student) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(student);
		et.commit();
	}
	public List<Student> getAllStudent() {
		String query = "select s from Student s";
		Query q = em.createQuery(query);
		List<Student> s = q.getResultList();
		return s;
	}
	public void deleteStudent(int id) {
		EntityTransaction et=em.getTransaction();
		Student s1=em.find(Student.class,id);
		et.begin();
		em.remove(s1);
		et.commit();
	}
	public Student getStudentById(int id) {
		return em.find(Student.class,id);
	}
	public void updateStudent(Student student) {
		EntityTransaction tr = em.getTransaction();
		tr.begin();
		em.merge(student);
		tr.commit();
	}
}
