package com.spring.springAnnotations;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Swim 1k everyday";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
