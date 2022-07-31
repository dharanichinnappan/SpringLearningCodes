package com.spring.springdemo;

public class MyApp {

	public static void main(String[] args) {
		Coach myCoach=new TrackCoach();
		//BaseballCoach baseballCoach = new BaseballCoach();
		System.out.println(myCoach.getDailyWorkout());
	}

}
