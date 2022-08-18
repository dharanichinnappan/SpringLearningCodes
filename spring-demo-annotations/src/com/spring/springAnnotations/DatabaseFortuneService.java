package com.spring.springAnnotations;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
	
		return "This is DatabaseFortuneService ";
	}

}
