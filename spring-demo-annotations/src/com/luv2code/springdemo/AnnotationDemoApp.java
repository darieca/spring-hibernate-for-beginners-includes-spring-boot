package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from spring container
//		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		
		//get bean from spring container USING DEFAULT BEAN ID
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		
		//call bean method
		System.out.println(theCoach.getDailyWorkout());
		
		//close context
		context.close();

	}

}
