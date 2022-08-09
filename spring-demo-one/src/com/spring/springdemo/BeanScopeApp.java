package com.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"beanScopeApplicationContext.xml");

		// Checking if both bean are same -- Singleton Scope Bean
		Coach myTrackCoach = applicationContext.getBean("TrackCoach", Coach.class);
		Coach myAplhaCoach = applicationContext.getBean("TrackCoach", Coach.class);

		System.out.println("Checking if two instances are same in Singleton scope");
		boolean result = (myTrackCoach == myAplhaCoach);

		System.out.println("Are both bean same?" + " " + result);

		System.out.println("\n Memory Loaction of myCoach" + " " + myTrackCoach);
		System.out.println("\n Memory Loaction of myCoach" + " " + myAplhaCoach);

		// Checking if both bean are same -- for Prototype Scope Bean
		System.out.println("Checking if two instances are diffrefent in prototype Scope");
		Coach myBaseballCoach1 = applicationContext.getBean("BaseballCoach", Coach.class);
		Coach myBaseballCoach2 = applicationContext.getBean("BaseballCoach", Coach.class);

		// Checking if both bean are same -- Singleton Scope Bean
		boolean results = (myBaseballCoach1 == myBaseballCoach2);

		System.out.println("Are both bean same?" + " " + results);

		System.out.println("\n Memory Loaction of myCoach" + " " + myBaseballCoach1);
		System.out.println("\n Memory Loaction of myCoach" + " " + myBaseballCoach2);

		// Loading init and destroy method
		Coach myCricketCoach = applicationContext.getBean("CricketCoach", Coach.class);
		
		// Loading init and destroy method for prototype Scoped bean -- Football Coach
		// for prototype beab .. destroy method has to be called by custom coding via customBeanProcessor
		Coach myFootballCoach = applicationContext.getBean("FootballCoach", Coach.class);
		applicationContext.close();

	}

}
