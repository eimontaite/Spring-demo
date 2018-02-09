package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasketballTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BasketballCoach bBallCoach = context.getBean("myBBallCoach", BasketballCoach.class);
		BasketballCoach bBallCoachTwo = context.getBean("myBBallCoach", BasketballCoach.class);

		System.out.println(bBallCoach.getDailyWorkout());
		System.out.println(bBallCoach.getDailyFortune());
		System.out.println(bBallCoach.getRandomFortune());

		boolean result = (bBallCoach == bBallCoachTwo);
		System.out.println("\nPointing to the same object? " + result);
		System.out.println("\nbBallCoach memory address: " + bBallCoach);
		System.out.println("\nbBallCoach memory address: " + bBallCoachTwo);
		
		context.close();

	}

}
