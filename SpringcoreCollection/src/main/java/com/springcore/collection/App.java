package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("col.xml");
       Address p=context.getBean("address",Address.class);
       System.out.println(p);
    }
}
