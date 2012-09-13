package com.steventk.springinaction.springidol;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MagicianTest {
	
	
	@Test
	public void testInterceptThoughts(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext(Constants.SPRING_IN_ACTION_APP_CTX);
		Thinker volunteer = (Thinker)ctx.getBean("volunteer");
		MindReader magician = (MindReader)ctx.getBean("magician");
		String thoughts = "I wanna have a big house";
		volunteer.thinkOfSomething(thoughts);
		System.out.println("Magician thoughts: " + magician.getThoughts());
		System.out.println("Volunteer thoughts: " + volunteer.getThoughts());
		Assert.assertEquals(volunteer.getThoughts(), magician.getThoughts());
		
	}
}
