package com.spring.springAnnotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	@Value("${swim.email}")
	private String email;
	@Value("${swim.team}")
	private String team;

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	private FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Swim 1k everyday";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
