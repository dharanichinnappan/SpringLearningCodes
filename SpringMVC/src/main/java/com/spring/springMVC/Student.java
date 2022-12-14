package com.spring.springMVC;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {

	private String firstName;
	
	@NotNull(message = "last name is required")
	@Size(min=1,message = "last name is required")
	private String lastName;
	
	@NotNull(message = "is required")
	@Min(value = 1,message = "must be greater than 0")
	@Max(value= 10,message = "must be smaller or equal to 10")
	//@Notnull will not work on int data type.. so use Integer
	private Integer freePasses;
	
	//private int freePasses;
	
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	private String postalCode;
	//Hard coded country options (dropdown list..select tag) in jsp page
	private String country;
	
	// dropdown list options given in java class.. (select tag)
	private String language;
	private LinkedHashMap<String, String> languageOptions;
	
	//can also be given options in java files exactly similar to dropdown list
	private String techLanguage;
	//check box..options hard coded in jsp file
	private String operatingSystem;
	//check box..listed using list in student form page
	private String[] companies;
	public Student() {
		languageOptions=new LinkedHashMap<>();
		languageOptions.put("ta", "Tamil");
		languageOptions.put("de", "Deutsch");
		languageOptions.put("sp", "Spanish");
		languageOptions.put("en", "English");
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public LinkedHashMap<String, String> getLanguageOptions() {
		return languageOptions;
	}
	public String getTechLanguage() {
		return techLanguage;
	}
	public void setTechLanguage(String techLanguage) {
		this.techLanguage = techLanguage;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public String[] getCompanies() {
		return companies;
	}
	public void setCompanies(String[] companies) {
		this.companies = companies;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
}
