package com.springcore.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaConfig")
//@ComponentScan is used when you insert @Component in student class...without @bean create 
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}

	@Bean(name={"apple","mango","orange"})//i can use our manmade id for get the data
	public Student get(){
		//getStudent 
		//creating a new student object
		Student student = new Student(getSamosa());
		return student;
	}
}
