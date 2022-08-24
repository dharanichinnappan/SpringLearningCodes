package com.spring.springMVC;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	//Hard coded country options (dropdown list..select tag) in jsp page
	private String country;
	private String language;
	// dropdown list options given in java class.. (select tag)
	private LinkedHashMap<String, String> languageOptions;
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
	
	
}
