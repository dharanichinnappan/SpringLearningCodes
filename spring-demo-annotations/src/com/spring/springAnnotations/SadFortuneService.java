package com.spring.springAnnotations;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Be sad resonably";
	}

}
