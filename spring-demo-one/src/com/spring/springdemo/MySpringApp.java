package com.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		// Steps to follow
		/*
		 * 1. Load spring configuration file 2.retreive bean from spring container
		 * 3.call methods on bean 4.close the context
		 */
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// TrackCoach/BaseballCoach is the bean id mentioned in applicationContext.xml"
		// and Coach.class is the interface
		Coach myCoach = applicationContext.getBean("randomCoach", Coach.class);

		String workout = myCoach.getDailyWorkout();
		System.out.println(workout);

		String fortune = myCoach.getDailyFortuneService();
		System.out.println(fortune);

		// Injecting literal values .. calling volleyballCoach class instead of Coach
		// interface
		VolleyballCoach volleyballCoach = applicationContext.getBean("VolleyballCoach", VolleyballCoach.class);
		System.out.println(volleyballCoach.getEmailAddress() + "  " + volleyballCoach.getTeam());

		// these values are loaded using properties file..sport.properties
		System.out.println(volleyballCoach.getCountry() + " " + volleyballCoach.getExperience());

		// It is to get a random Fortune Service
		System.out.println(myCoach.getDailyFortuneService());
		applicationContext.close();

	}

}
