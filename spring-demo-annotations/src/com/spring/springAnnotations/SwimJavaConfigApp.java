package com.spring.springAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SwimSportConfig.class);
		Coach swimCoach = applicationContext.getBean("swimCoach", Coach.class);
		System.out.println(swimCoach.getDailyFortune());
		applicationContext.close();
	}

}
