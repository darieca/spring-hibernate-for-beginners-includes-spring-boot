package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// crete array of strings
	private String[] data = {
			"Beware of the wolf in seep clothing",
			"Diligence is the mother of good luck",
			"the journey is the reward"
	};
	
	// create random no generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// pick random string from array
		int index = myRandom.nextInt(data.length);
		
		return data[index];
	}

}
