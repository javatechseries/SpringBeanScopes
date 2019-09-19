package com.explore.springbean.scopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanScopesApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctxt=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach trackCoach1=ctxt.getBean("trackCoach",Coach.class);
		Coach trackCoach2=ctxt.getBean("trackCoach",Coach.class);
		
		System.out.println("Did it return the same object when the scope is singleton? " +(trackCoach1==trackCoach2));
		System.out.println("Memory location is trckCoach1 is: "+trackCoach1);
		System.out.println("Memory location is trckCoach1 is: "+trackCoach2);
		
		
		Coach cricketCoach1=ctxt.getBean("cricketCoach",Coach.class);
		Coach cricketCoach2=ctxt.getBean("cricketCoach",Coach.class);
		
		System.out.println("Did it return the same object when the scope is prototype ? " +(cricketCoach1==cricketCoach2));
		System.out.println("Memory location is trckCoach1 is: "+cricketCoach1);
		System.out.println("Memory location is trckCoach1 is: "+cricketCoach2);
		
				
		ctxt.close();
	}

}
