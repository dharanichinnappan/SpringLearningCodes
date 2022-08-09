package com.spring.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	public CricketCoach() {
		System.out.println("CrikcetCoach COnstructor");
	}

// Setter method for Dependency Injection
	public void setFortuneService(FortuneService myFortuneService) {
		this.fortuneService = myFortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Run 5k everyday";
	}

	@Override
	public String getDailyFortuneService() {

		return "Cricket Coach" + fortuneService.getDailyFortuneService();
	}
	
	// add an init method
		public void doMyStartUpStuff() {
			System.out.println("Inside init method");
		}

		// add a destroy method()
		private void doMyCleanUpStuff() {
			System.out.println("Inside destroy method");
		}

}
