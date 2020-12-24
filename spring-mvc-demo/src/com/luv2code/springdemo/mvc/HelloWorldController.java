package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	// controller method to show initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// controller method to process html form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// controller method to read form data
	// and ADD data to model - model is from spring framework
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		// read req parameter from HTML servlet - parameter is from HTML <name="studentName">
		String theName = request.getParameter("studentName");
		
		// convert data to all caps;
		theName = theName.toUpperCase();
		
		// create message
		String result = "Yoyo " + theName;
		
		// add msg to model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String letsShoutDudeThree(@RequestParam("studentName") String theName, Model model) {
		// read req parameter from HTML servlet - parameter is from HTML <name="studentName">
		
		// convert data to all caps;
		theName = theName.toUpperCase();
		
		// create message
		String result = "Yoyo " + theName;
		
		// add msg to model
		model.addAttribute("message", result);
		
		return "helloworld";
	}

}
