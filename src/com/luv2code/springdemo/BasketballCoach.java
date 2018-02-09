package com.luv2code.springdemo;

public class BasketballCoach implements Coach {

	private FortuneService fortuneService;
	
	// creating a constructor for injection dependency 
	public BasketballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	// no-arg constructor because a custom constructor has been declared
	public BasketballCoach() {

	}

	@Override
	public String getDailyWorkout() {
		return ("Practice free throws for 60 minutes");
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getRandomFortune() {
		return fortuneService.getRandomFortune();
	}
}
