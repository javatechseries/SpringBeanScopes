package com.explore.springbean.lifecycle;

import com.explore.springbean.scopes.Coach;
import com.explore.springbean.scopes.FortuneService;

public class BaseballCoach implements Coach {
	
	FortuneService fortuneService;
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}

	public String getDailyWorkOut() {
		return "Throw 1000 balls per day";
	}
	
	public String getDailyFortune() {
		return fortuneService.getFortune();
		
	}
	
	public void doIntitialization() {
		System.out.println("BaseballCoach: Inside doIntitialization ");
	}
	
	public void doCleanup() {
		System.out.println("BaseballCoach: Inside doCleanup ");
	}

}
