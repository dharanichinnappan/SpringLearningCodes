package com.spring.springdemo;

public class happyFortuneService implements FortuneService {

	@Override
	public String getDailyFortuneService() {
		
		return " Today is your lucky day!!";
	}

}
