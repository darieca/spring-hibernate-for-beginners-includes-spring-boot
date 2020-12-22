package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/") // Map request to actual method. ALL CRUD INCLUDED
	public String showPage() {
		return "main-menu"; // spring-mvc-demo-servlet auto configure view path to ../main-menu.jsp
	}

}
