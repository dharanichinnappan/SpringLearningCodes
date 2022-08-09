package com.spring.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class FootballCoach implements Coach, DisposableBean {

	private FortuneService fortuneService;

	// define a constructor for dependency injection -- Constructor Injection
	public FootballCoach(FortuneService myFortuneService) {
		fortuneService = myFortuneService;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy method... Calling destroy() via custom bean processor");

	}

	@Override
	public String getDailyWorkout() {

		return "Watch Ronaldo";
	}

	@Override
	public String getDailyFortuneService() {
		return fortuneService.getDailyFortuneService();
	}
	// add an init method --> Singleton Bean scope
		public void doMyStartUpStuff() {
			System.out.println("Inside init method of FootballCoach --> Prototype bean ");
		}
}
