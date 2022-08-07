package com.spring.springdemo;

import java.util.Random;

public class randomFortuneService implements FortuneService {

	private String[] fortunesList = { "Have a good day", "Have a good day", "ALL the best", "best of luck", "Be happy",
			"happy life", "fresh day", "healthy life", "you will get a job", "you will get a job sooon",
			"start a job soon" };
	private Random randomNumber = new Random();

	@Override
	public String getDailyFortuneService() {
		int index = randomNumber.nextInt(fortunesList.length);
		String fortune = fortunesList[index];
		return fortune;
	}

}
