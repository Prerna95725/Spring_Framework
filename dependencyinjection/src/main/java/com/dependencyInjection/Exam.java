package com.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Exam {
	 public static void main( String[] args )
	    {
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 Student stu=context.getBean("student",Student.class);
		 stu.displayStudentInfo();
		 
		 Student stu1=context.getBean("student1",Student.class);
		 stu1.displayStudentInfo();
		 System.out.println(stu1);
	    }
}
