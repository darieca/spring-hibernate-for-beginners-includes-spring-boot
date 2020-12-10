package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	// Source -> Generate constructor using fields..
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Ru hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "JUST DO IT TRACK " + fortuneService.getFortune();
	}

}
