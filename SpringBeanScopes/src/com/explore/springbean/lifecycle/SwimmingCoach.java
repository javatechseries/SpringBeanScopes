package com.explore.springbean.lifecycle;

import com.explore.springbean.scopes.Coach;
import com.explore.springbean.scopes.FortuneService;

public class SwimmingCoach implements Coach {
	
	FortuneService fortuneService;
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}

	public String getDailyWorkOut() {
		return "Swim 600 feet every day";
	}
	
	public String getDailyFortune() {
		return fortuneService.getFortune();
		
	}

	public void doIntitialization() {
		System.out.println("SwimmingCoach: Inside doIntitialization ");
	}
	
	public void doCleanup() {
		System.out.println("SwimmingCoach: Inside doCleanup ");
	}
}
