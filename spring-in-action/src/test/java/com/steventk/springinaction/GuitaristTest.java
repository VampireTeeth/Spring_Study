package com.steventk.springinaction;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GuitaristTest {
	
	@Test
	public void testPerform(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-in-action-ch03.xml");
		Performer guitarist = (Performer) ctx.getBean("guitarist");
		guitarist.perform();
	}
}
