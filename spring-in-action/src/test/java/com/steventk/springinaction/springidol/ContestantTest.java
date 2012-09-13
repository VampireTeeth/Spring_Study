package com.steventk.springinaction.springidol;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContestantTest {
	
	@Test
	public void testReceiveAward(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext(Constants.SPRING_IN_ACTION_APP_CTX);
		
		Performer guitarist = (Performer) ctx.getBean("guitarist");
		guitarist.perform();
		Assert.assertTrue(guitarist instanceof Contestant);
		Contestant contestant = (Contestant)guitarist;
		contestant.receiveAward();
	}
}
