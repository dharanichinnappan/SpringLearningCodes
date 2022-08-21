package com.spring.springMVC;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	// method to show the initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	//method to edit data from html form
	@RequestMapping("/editFormData")
	public String editData(HttpServletRequest request,Model model) {
		String studentName= request.getParameter("studentName");
		studentName=studentName.toUpperCase();
		String result="Name in uppsercase--> "+studentName;
		model.addAttribute("message", result);
		return "helloworld";
	}
//method to process form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
}
