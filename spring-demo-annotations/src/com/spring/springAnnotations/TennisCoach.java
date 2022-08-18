package com.spring.springAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Spring will automatically register this bean using @Component.. tennisCoach is the beanId
@Component
//@Scope("singleton")
@Scope("prototype")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	
	//spring will scan for a component the implements FortuneService... ie HappyFOrtuneService
	@Autowired
	//For constructor injection @Qualifier must be used here
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice Tennis Daily";
	}

	@Override
	public String getDailyFortune() {
		return "Tennis Coach --> "+fortuneService.getFortune();
	}

	@PostConstruct
	public void init() {
		System.out.println("This is inside init method of TennisCoach .. @PostConstruct");
	}
	//Spring will not call destroy method for prototype bean by default.. calls only for Singleton bean by default
	@PreDestroy
	public void destroy() {
		System.out.println("This is inside destroy method of TennisCoach .. @PreDestroy");
	}
}
