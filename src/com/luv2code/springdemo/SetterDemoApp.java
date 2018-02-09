package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container. CricketCoach.class - we use this class instead of the Coach interface because the setter method is only defined in this class
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call methods on the bean 
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getRandomFortune());
		
		//call the new methods to get literal values 
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		// close the context 
		context.close();

	}

}
