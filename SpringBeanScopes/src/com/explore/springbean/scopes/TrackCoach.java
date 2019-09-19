package com.explore.springbean.scopes;

public class TrackCoach implements Coach {
	
	FortuneService fortuneService;
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}

	public String getDailyWorkOut() {
		return "Run 5 Miles per day";
	}
	
	public String getDailyFortune() {
		return fortuneService.getFortune();
		
	}

}
