package com.spring.springMVC;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	//without this method.. white space will pass through @notnull validation for last name..
	//add an InitBinder.. to convert trim input strings
	//remove leading and trailing white spaces 
	//resolve issue for validation
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor= new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		// create a new student object
		Student theStudent = new Student();

		// add the created student object to the model
		// student is name.. theStudent is value
		model.addAttribute("student", theStudent);

		return "student-form";
	}

	@RequestMapping("/processForm")
	// @ModelAttribute name should match what is given in jsp file .. "student"
	// @valid performs validation on student object and store the result in bindingResult
	//In the method signature, the BindingResult parameter must appear immediately after the model attribute. 
	public String processForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "student-form";
		} else {
			System.out.println("Student's Name is :" + theStudent.getFirstName() + " " + theStudent.getLastName());
			return "student-confirmation";
		}

	}
}
