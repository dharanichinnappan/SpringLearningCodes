package com.spring.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach {
   
	//This if for field injection .. No need for setter method
	@Autowired
	@Qualifier("restFortuneService")
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
