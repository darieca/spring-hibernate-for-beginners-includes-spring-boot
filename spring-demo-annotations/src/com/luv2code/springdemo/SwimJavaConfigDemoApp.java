package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring config file - CHANGED TO AnnotationConfigApplicationContext
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get bean from spring container USING DEFAULT BEAN ID
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		//call bean method
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		
		System.out.println("email: " + theCoach.getEmail());
		System.out.println("team: " + theCoach.getTeam());
		
		//close context
		context.close();

	}

}
