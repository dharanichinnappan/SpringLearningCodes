package com.spring.springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Coach tennisCoach1 = applicationContext.getBean("tennisCoach", Coach.class);
		Coach tennisCoach2 = applicationContext.getBean("tennisCoach", Coach.class);
		boolean result = (tennisCoach1 == tennisCoach2);
		System.out.println("\n Are Both  pointing to same bean?-- >" + result );
		System.out.println("\n Memory location of Coach1"+ tennisCoach1);
		System.out.println("\n Memory location of Coach2"+ tennisCoach2);
		applicationContext.close();
	}

}
