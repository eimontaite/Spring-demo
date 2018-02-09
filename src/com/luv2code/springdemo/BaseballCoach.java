package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		// assigning the passed argument to the private FortuneService field
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune; needs a helper

		return fortuneService.getFortune();
	}

	@Override
	public String getRandomFortune() {
		
		return fortuneService.getRandomFortune();
	}
	
}
