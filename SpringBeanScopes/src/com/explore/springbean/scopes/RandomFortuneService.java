package com.explore.springbean.scopes;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String[] fortunes= {"Today is yor lucky day!","Today you will win jackpot!","Today is awesome day for you!"};
	Random random = new Random();
	
	public String getFortune() {
		
		int index=random.nextInt(fortunes.length);
		return fortunes[index];
		
	}

}
