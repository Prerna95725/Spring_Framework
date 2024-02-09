package com.springcore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext is a Interface
		// context is a reference
		//Classpath... is a implemenation of ApplicationContext 
	
 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	System.out.println("config loaded");
    //Airtel air =(Airtel)context.getBean("airtel");
   // air.calling();
   // air.data();
	
	Sim sim = context.getBean("sim",Sim.class);
	sim.calling();
	sim.data();
	
}
}
