package com.spring.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cricketCoach")
public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCOach Constructor");
	}

	//setter method for dependency injection
	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService thefortuneService) {
		fortuneService=thefortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		 return "Cricket Coach -->"+fortuneService.getDailyFortune();
	}

	
}
