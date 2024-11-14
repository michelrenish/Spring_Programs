package com.jsp.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.entity.Student;
import com.jsp.services.StudentService;

@Controller
public class Studentcontroler {
	
	@Autowired
	private StudentService service; 
	
	@RequestMapping("/hi")
	public String hi() {
		return "hi.jsp";
	}
	@RequestMapping("/student")
	public String student() {
		return "student.jsp";
	}
	@RequestMapping("/register")
	public ModelAndView register() {
		Student s1 = new Student();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("registration.jsp");
		mv.addObject("student",s1);
		return mv;
	}
	@RequestMapping("/save")
	public ModelAndView saveStudent(Student s1) {
		service.saveStudent(s1);
//		List<Student> list =service.getAllStudents();
//		for (Student student : list) {
//			System.out.println(student);
//		}
		return new ModelAndView("index.jsp");
	}
	@RequestMapping("/view")
	public ModelAndView getstudent() {
		ModelAndView mv = new ModelAndView("view.jsp");
		List<Student> list =service.getAllStudents();
		mv.addObject("std", list);
		return mv;
	}
	@RequestMapping("/delete")
	public ModelAndView deleteStudent(@RequestParam("id") int id) {
		service.deleteStudent(id);
		ModelAndView mv = new ModelAndView("view.jsp");
		mv.addObject("std",service.getAllStudents());
		return mv;
	}
	@RequestMapping("/update")
	public ModelAndView updateStudent(@RequestParam("id") int id) {
		Student student =service.getStudentById(id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("edit.jsp");
		mv.addObject("student",student);
		return mv;
	}
	@RequestMapping("/edit")
	public ModelAndView editStudent(Student student) {
		service.updateStudent(student);
		ModelAndView mv = new ModelAndView("view.jsp");
		mv.addObject("std",service.getAllStudents());
		return mv;
	}
	
	
	
	
}