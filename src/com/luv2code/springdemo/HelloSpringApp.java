package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {

		// load (create) the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from string container; give me a coach object - the implementation of the Coach interface, i.e. Coach.class is the interface, TrackCoach (or any other class) in the *.xml file is the actual class implemented
		// constructor injection - FortuneService 
		Coach theCoach = context.getBean("myCoach", Coach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call new methods
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();

	}
}