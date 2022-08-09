package com.spring.springdemo;

public class TrackCoach implements Coach {

//Defining a private feild for dependency
	private FortuneService fortuneService;

	// define a constructor for dependency injection -- Constructor Injection
	public TrackCoach(FortuneService myFortuneService) {
		fortuneService = myFortuneService;
	}

	public TrackCoach() {
		super();

	}

	@Override
	public String getDailyWorkout() {
		
		return "auto written Trackcoach class by eclipse";
	}

	@Override
	public String getDailyFortuneService() {

		return "TrackCoach Fortune --> " + fortuneService.getDailyFortuneService();
	}

	
}
