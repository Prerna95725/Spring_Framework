package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project started" );
         
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        //creating student
        Student st=new Student();
        st.setId(101);
        st.setName("prerna");
        st.setCity("Dhanbad");
        
       System.out.println(st);
       
       Session session = factory.openSession();
       
       Transaction tx=session.beginTransaction();
       
       session.save(st);
       
       tx.commit();
       
       session.close();
       
       
    }
}
