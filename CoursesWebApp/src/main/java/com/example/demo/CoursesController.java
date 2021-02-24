package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoursesController {
	@RequestMapping("/course")
	public String course() {
		System.out.println("Welcome to edureka");
		return "courses.jsp";
	}

}
