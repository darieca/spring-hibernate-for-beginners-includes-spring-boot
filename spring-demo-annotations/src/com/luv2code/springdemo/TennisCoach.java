package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	// FIELD INJECTION - directly on the object, no need for method
	// Qualifier - specify bean id of a multi implement
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// CONSTRUCTOR INJECTION
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	public TennisCoach() {
		System.out.println("INSIDE TENNIS COACH INSTRUCTOR");
	}
	
	
	
	@Override
	public String getDailyWorkout() {
		return "practice backhand volley!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}


	// SETTER INJECTION
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("-- IN SETFORTUNESERVICE --");
//		this.fortuneService = fortuneService;
//	}
//	
	// METHOD INJECTION - like setter, but on ANY MEHOTD
//	@Autowired
//	public void LALALALA(FortuneService fortuneService) {
//		System.out.println("-- IN SETFORTUNESERVICE MTEHOS INJECT --");
//		this.fortuneService = fortuneService;
//	}
	

}
