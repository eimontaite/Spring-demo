package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		TrackCoach theCoach = context.getBean("myCoach", TrackCoach.class);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getRandomFortune());
		
		context.close();

		// // create the object
		// Coach theCoach = new TrackCoach();
		// // use the object
		// System.out.println(theCoach.getDailyWorkout());
		// System.out.println(theCoach.getRandomFortune());

	}

}
