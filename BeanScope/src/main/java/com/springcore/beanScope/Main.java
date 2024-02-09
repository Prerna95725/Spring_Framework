package com.springcore.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
       Student stu = con.getBean("student", Student.class);
       System.out.println(stu);
       System.out.println(stu.hashCode());
       
       Student stu1 = con.getBean("student", Student.class);
       System.out.println(stu1);
       System.out.println(stu1.hashCode());
       
	}

}
