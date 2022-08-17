package com.spring.springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		//Calling bean with default bean Id.. 
				Coach myCoach1 = applicationContext.getBean("defaultCoach", Coach.class);
				System.out.println("Default bean Id"+ myCoach1.getDailyWorkout());
				
		//Calling bean with explicitly mentioned bean Id..
		Coach myCoach = applicationContext.getBean("tennisCoach", Coach.class);
		
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		
		applicationContext.close();
	}
}
