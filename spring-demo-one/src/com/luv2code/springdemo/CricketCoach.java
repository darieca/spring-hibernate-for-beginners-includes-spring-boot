package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// add new field for email and team
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("cricketcoach: inside setter metod - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("cricketcoach: inside setter metod - setTeam");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("in no arg cons");
	}

	@Override
	public String getDailyWorkout() {
		return"Prac fast bowling for 1 5min";
	}

	// right click -> source -> generate getters and setters
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("cricketcoach: inside setter metod - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
