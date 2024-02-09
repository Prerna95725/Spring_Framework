package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 Emp e =context.getBean("emp",Emp.class);
		 System.out.println(e);
	}

}
