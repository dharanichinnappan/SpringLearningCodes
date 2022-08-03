package com.spring.springdemo;

public class BaseballCoach implements Coach {

	//Defining a private feild for dependency
	private FortuneService fortuneService;
	//define a constructor for dependency injection
	public BaseballCoach (FortuneService myFortuneService) {
		fortuneService = myFortuneService;
	}
	public String getDailyWorkout() {
		return "Excerice 30 mins everyday";
		
	}

	@Override
	public String getDailyFortuneService() {
		
		return fortuneService.getDailyFortuneService();
	}
}
