package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	private String[] fortuneArray = new String[] {"Today is your lucky day!", "You rock!", "Have a cookie!"};
	private int index = new Random().nextInt(fortuneArray.length);
	
	@Override
	public String getFortune() {
		return "This is a default fortune; have a nice day!"; 
	}

	@Override
	public String getRandomFortune() {
		return fortuneArray[index];
	}

}
