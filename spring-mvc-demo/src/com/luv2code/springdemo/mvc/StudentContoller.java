package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentContoller {
	
	// GIVE HTML VIEW AND INITIALISE EMPTY STUDENT OBJECT
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// create student object
		Student theStudent = new Student();
		
		// add student attribute to model
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	// GET THE HTML STUDENT OBJECT TRU @ModelAttribute
	// SEND TO NEW HTML VIEW
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {

		// log input data
		System.out.println("STUDENT INFO: " + theStudent.getFirstName() + " " + theStudent.getLastName());
		return "student-confirmation";
	}
	
	

}
