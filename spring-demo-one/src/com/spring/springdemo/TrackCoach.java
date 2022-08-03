package com.spring.springdemo;

public class TrackCoach implements Coach {

//Defining a private feild for dependency
	private FortuneService fortuneService;

	// define a constructor for dependency injection
	public TrackCoach(FortuneService myFortuneService) {
		fortuneService = myFortuneService;
	}

	public TrackCoach() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "auto aritten Trackcoach class by eclipse";
	}

	@Override
	public String getDailyFortuneService() {

		return "TrackCoach Fortune --> " + fortuneService.getDailyFortuneService();
	}

}
