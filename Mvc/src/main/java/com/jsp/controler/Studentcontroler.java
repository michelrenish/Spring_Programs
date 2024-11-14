package com.jsp.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Studentcontroler {
	@RequestMapping("/hi")
	public String hi() {
		return "hi.jsp";
	}
	@RequestMapping("/student")
	public String student() {
		return "student.jsp";
	}
}
