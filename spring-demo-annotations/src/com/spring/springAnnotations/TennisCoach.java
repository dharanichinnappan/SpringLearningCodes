package com.spring.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Spring will automatically register this bean .. tennisCoach is the beanId
@Component("tennisCoach")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	//spring will scan for a component the implements FortuneService... ie HappyFOrtuneService
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice Tennis Daily";
	}

	@Override
	public String getDailyFortune() {
		return "Tennis Coach --> "+fortuneService.getDailyFortune();
	}

}
