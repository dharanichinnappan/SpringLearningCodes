package com.spring.springMVC;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//adding @RequestMapping to controller helps to avoid conflict when 2 methods have same @RequestMapping names. 
//using controller @RequestMapping name.. Spring will distinguish methods with same names
@RequestMapping("/helloWorldController")
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
	
	//instead of using HttpServletRequest, @RequestParam("studentName") can be used.
	@RequestMapping("/editFormDataVersion2")
	public String editDataVersion2(@RequestParam("studentName") String studentName ,Model model) {
		studentName=studentName.toUpperCase();
		String result="Name in uppsercase using Version2--> "+studentName;
		model.addAttribute("message", result);
		return "helloworld";
	}
//method to process form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
}
