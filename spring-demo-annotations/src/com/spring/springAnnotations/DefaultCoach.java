package com.spring.springAnnotations;

import org.springframework.stereotype.Component;

//If beanId is not mentioned .. Spring will search for bean with small lettered classname .. TennisCoach --> tennisCoach
@Component
public class DefaultCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "This is bean with default beanID.. not explicitly mentioning beanId" ;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
