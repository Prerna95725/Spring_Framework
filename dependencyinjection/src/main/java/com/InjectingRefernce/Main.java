package com.InjectingRefernce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
	A a= context.getBean("aref",A.class);
	System.out.println(a.getX());
	}
	

}
