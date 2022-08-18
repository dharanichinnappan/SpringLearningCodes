package com.spring.springAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigAnnotationApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SportConfig.class);
		Coach tennisCoach1 = applicationContext.getBean("tennisCoach", Coach.class);
		System.out.println("\n Memory location of Coach1" + tennisCoach1);
		applicationContext.close();
	}

}
