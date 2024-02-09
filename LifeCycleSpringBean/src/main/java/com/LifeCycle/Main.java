package com.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 /* Samosa s1=context.getBean("s1",Samosa.class);
		s1.giveprice();*/
		context.registerShutdownHook();
		
		pepsi p1=context.getBean("p1",pepsi.class);
		p1.pepsiprice();
	}

}
