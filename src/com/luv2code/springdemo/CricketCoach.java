package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;

	// add new fields for emailAddress and team
	private String emailAddress; 
	private String team; 
	
	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("Cricket Coach: inside no-arg constructor");
	}
	
	// add setter methods for emailAddress and team 
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println("Cricket Coach: inside setter method - setEmailAddress");

	}

	public void setTeam(String team) {
		this.team = team;
		System.out.println("Cricket Coach: inside setter method - setTeam");

	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
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
