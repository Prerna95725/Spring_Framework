package com.AmbiguityProblemResolve;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 Addition sum = context.getBean("Add",Addition.class);
		 sum.doSum();
		 
	}

}
