package com.spring.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach {
   
	//This if for field injection .. No need for setter method
	@Autowired
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {

		return null;
	}

	@Override
	public String getDailyFortune() {

		return "VollyballCoach -- >" + fortuneService.getDailyFortune();
	}

}
