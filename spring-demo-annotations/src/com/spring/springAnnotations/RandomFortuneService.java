package com.spring.springAnnotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of Strings
	private String[] data= {"Fortune 1","Fortune 2","Fortune 3"};
	
	//create a random number generator
	private Random randomNumer=new Random();
	
	@Override
	public String getFortune() {
		
		//pick a random string from the array
		int index=randomNumer.nextInt(data.length);
		System.out.println("This is the random number"+ index);
		String fortune= data[index];
		
		return fortune;
	}

}
