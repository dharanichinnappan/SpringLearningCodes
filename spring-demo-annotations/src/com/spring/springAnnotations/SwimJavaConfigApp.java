package com.spring.springAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SwimSportConfig.class);
		Coach swimCoach = applicationContext.getBean("swimCoach", Coach.class);
		System.out.println(swimCoach.getDailyFortune());
		
		//To read values from property file
		//SwimCoach must be used instead of Coach. because properties(email,team) are only used in SwimCoach
		SwimCoach mySwimCoach = applicationContext.getBean("swimCoach", SwimCoach.class);
		System.out.println(mySwimCoach.getTeam()+ " and "+mySwimCoach.getEmail());
		
		applicationContext.close();
	}

}
