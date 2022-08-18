package com.spring.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestCoach implements Coach {

	private FortuneService fortuneService;
	
	public TestCoach() {
		System.out.println("Inside TestCoach Constructor");
	}
	//METHOD INJECTION
	//instead of using setter method for dependency injection using any method here
	//as long as method is @Autowired spring will consider this as dependency injection
	@Autowired
	@Qualifier("databaseFortuneService")
	public void getFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return null;
	}

	@Override
	public String getDailyFortune() {
		
		return "TestCoach-->" + fortuneService.getDailyFortune();
	}

}
