package com.springcore.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student student = context.getBean("apple",Student.class);
		System.out.println(student);
		student.exam();
	}

}