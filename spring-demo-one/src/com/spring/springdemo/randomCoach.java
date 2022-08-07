package com.spring.springdemo;

public class randomCoach implements Coach {
//This class is to get randomFortune Service -- Exercise
	
	private FortuneService fortuneService;
	
	public randomCoach(FortuneService fortuneService) {
	this.fortuneService = fortuneService;
}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortuneService() {
		
		return fortuneService.getDailyFortuneService();
	}

}
