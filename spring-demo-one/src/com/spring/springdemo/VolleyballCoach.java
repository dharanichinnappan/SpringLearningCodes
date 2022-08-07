package com.spring.springdemo;

public class VolleyballCoach implements Coach {
	private String emailAddress;
	private String team;
	private String experience;
	private String country;

	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside volleyball coach emailAddress setter method ");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside volleyball coach  Team setter method ");
		this.team = team;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String getDailyWorkout() {

		return "play hard";
	}

	@Override
	public String getDailyFortuneService() {
		
		return null;
	}

}
