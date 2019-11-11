package com.explore.springbean.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.explore.springbean.scopes.Coach;

public class SpringBeanScopesApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctxt=new ClassPathXmlApplicationContext("beanlifecycle-applicationContext.xml");
		
		Coach baseballCoach=ctxt.getBean("baseballCoach",Coach.class);
		System.out.println("Baseball Coach: "+ baseballCoach.getDailyWorkOut());
		
		/*
		 * Spring does not manage the complete lifecycle of a prototype bean: the
		 * container instantiates, configures, and otherwise assembles a prototype
		 * object, and hands it to the client, with no further record of that prototype
		 * instance.
		 * 
		 * Thus, although initialization lifecycle callback methods are called on all
		 * objects regardless of scope, in the case of prototypes, configured
		 * destruction lifecycle callbacks are not called. The client code must clean up
		 * prototype-scoped objects and release expensive resources that the prototype
		 * bean(s) are holding.
		 * 
		 * For "prototype" scoped beans, Spring does not call the destroy method.
		 */ 
		Coach swimmingCoach=ctxt.getBean("swimmingCoach",Coach.class);
		System.out.println("Swimming Coach: "+swimmingCoach.getDailyWorkOut());
				
		ctxt.close();
	}

}
