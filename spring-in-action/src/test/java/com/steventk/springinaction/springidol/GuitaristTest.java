package com.steventk.springinaction.springidol;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.steventk.springinaction.springidol.Performer;

public class GuitaristTest {
	
	@Test
	public void testPerform(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext(Constants.SPRING_IN_ACTION_APP_CTX);
		Performer guitarist = (Performer) ctx.getBean("guitarist");
		guitarist.perform();
	}
}
