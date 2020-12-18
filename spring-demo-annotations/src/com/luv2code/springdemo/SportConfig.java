package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// PropertySource - inject sports properties file
@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	//define bean for sad fortune service
	//sadFortuneService is from SadFortuneService.java bean id
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	//define bean for swimcoach and inject dependency 
	// swimcoach is from SwimCoach.java bean id
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
