package com.dependencyInjectionConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Exam {
	 public static void main( String[] args )
	    {
		 //before spring using constructor
		 /*Student stu = new Student(1,"prerna");
		 stu.displayStudentInfo();*/
		 
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 Student stu=context.getBean("student",Student.class);
		 stu.displayStudentInfo();
		 
		
	    }
}
