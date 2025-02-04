package com.jsp.controler;

import java.util.List;

import org.eclipse.tags.shaded.org.apache.xpath.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.entity.Employee;
import com.jsp.services.EmployeeServices;

@Controller
public class EmpControler {
	@Autowired
	private EmployeeServices service;

	@RequestMapping("/login")
	public ModelAndView login() {
		Employee e1 = new Employee();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login.jsp");
		mv.addObject("employee", e1);
		return mv;
	}

	@RequestMapping("/save")
	public ModelAndView saveEmp(Employee e1) {
		service.saveEmployee(e1);
		System.out.println(e1);
		return new ModelAndView("save.jsp");
	}

	@RequestMapping("/menu")
	public ModelAndView menu() {
		return new ModelAndView("index.jsp");
	}

	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView("Viewlist.jsp");
		List<Employee> list = service.listEmployee();
		mv.addObject("emp", list);
		return mv;
	}

	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam("id") int id) {
		service.deleteEmp(id);
		ModelAndView mv = new ModelAndView("Viewlist.jsp");
		mv.addObject("emp",service.listEmployee());
		return mv;
	}
}
