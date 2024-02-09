package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
       StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
    
       /*Student student=new Student(2345,"komal","boakro");
       int r=studentDao.insert(student);
       System.out.println("done" +r);*/
       
       BufferedReader br= new  BufferedReader(new InputStreamReader(System.in));
        boolean go=true;
       while(go){
    	   System.out.println("PRESS 1 for add new student");
    	   System.out.println("PRESS 2 for display all students");
    	   System.out.println("PRESS 3 for get details of single student");
    	   System.out.println("PRESS 4 for delete student");
    	   System.out.println("PRESS 5 for update student");
    	   System.out.println("PRESS 6 for exit");
    	   
    	   try{
    		   int input = Integer.parseInt(br.readLine());
    		   switch(input)
    		   {
    		   case 1:
    			   //add a new student
    			   //taking input from users
    			   System.out.println("Enter student id:");
    			   int sId=Integer.parseInt(br.readLine());
    			   
    			   System.out.println("Enter student name:");
    			   String sName=(br.readLine());
    			   
    			   System.out.println("Enter student city:");
    			   String sCity=(br.readLine());
    			   
    			   //creating student object and setting values
    			   Student s= new Student();
    			   s.setStudentId(sId);
    			   s.setStudentName(sName);
    			   s.setStudentCity(sCity);
    			   
    			   //saving student object to database by calling insert of student dao
    			   int r =studentDao.insert(s);
    			   System.out.println(r+"student added");
    			   System.out.println("************************");
    			   System.out.println();
    			   
    			   break;
    		  
    	       case 2:
			   //display all students
    	    	   System.out.println("***********************");
    	    	   List<Student> allStudents = studentDao.getAllStudents();
    	    	   for(Student st: allStudents){
    	    		   System.out.println("Id: "+ st.getStudentId());
    	    		   System.out.println("Name: "+ st.getStudentName());
    	    		   System.out.println("City: " + st.getStudentCity());
    	    		   System.out.println("---------------------------------");
    	    	   }
    	    	   
			       break;
		  
    	       case 3:
    		   //get details of single student
    	    	   System.out.println("Enter st3udent id:");
    			   int studentId=Integer.parseInt(br.readLine());
    			   Student student = studentDao.getStudent(studentId);
    			   System.out.println("Id: "+ student.getStudentId());
	    		   System.out.println("Name: "+ student.getStudentName());
	    		   System.out.println("City: " + student.getStudentCity());
	    		   System.out.println("---------------------------------");
	    	   
    		       break;
    		       
    	       case 4:
    	    	   //delete student
    	    	   System.out.println("Enter st3udent id:");
    			   int deleteId=Integer.parseInt(br.readLine());
    			    studentDao.deleteStudent(deleteId);
    			    System.out.println("Student deleted");
    	    	   break;
    	    	   
    	       case 5:
    	    	   //update student
    	    	   break;
    		   
    	       case 6:
    	    	   //exit
    	    	   go=false;
    	    	   break;
    	       
    	    	   default:
    	    		   System.out.println("Invalid Input");
    	    		   System.out.println();
    	    		   System.out.println("Choose from 1 to 6");
    	    		   System.out.println();
    		   }
    	   } catch(Exception e){
        	   System.out.println("Invalid Input try with another one!!");
        	   System.out.println(e.getMessage());
    	   }
       }
       System.out.println("Thankyou for using application");
       
    }
}
