package com.spring.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		//create a new student object
		Student theStudent=new Student();
		
		//add the created student object to the model
		//student is name.. theStudent is value
		model.addAttribute("student",theStudent);
		
		return "student-form";
	}

	@RequestMapping("/processForm")
	//@ModelAttribute name should match what is given in jsp file .. "student"
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println("Student's Name is :"+theStudent.getFirstName()+" " +theStudent.getLastName());
		return "student-confirmation";
	}
	}
