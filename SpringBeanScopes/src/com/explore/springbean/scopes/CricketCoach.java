package com.explore.springbean.scopes;

public class CricketCoach implements Coach {
	
	FortuneService fortuneService;
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}

	public String getDailyWorkOut() {
		return "50 balls per hour";
	}
	
	public String getDailyFortune() {
		return fortuneService.getFortune();
		
	}

}
