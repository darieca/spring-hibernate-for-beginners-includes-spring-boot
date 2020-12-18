package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring config file - CHANGED TO AnnotationConfigApplicationContext
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get bean from spring container USING DEFAULT BEAN ID
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		//call bean method
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//close context
		context.close();

	}

}
