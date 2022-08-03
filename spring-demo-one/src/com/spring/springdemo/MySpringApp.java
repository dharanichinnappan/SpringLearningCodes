package com.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//TrackCoach/BaseballCoach is the bean id mentioned in applicationContext.xml"  and Coach.class is the interface
		Coach myCoach=applicationContext.getBean("TrackCoach",Coach.class);
		
		String workout=myCoach.getDailyWorkout();
		System.out.println(workout);
		String fortune=myCoach.getDailyFortuneService();
		System.out.println(fortune);
		applicationContext.close();
	}

}
