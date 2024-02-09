package com.springcore.javaConfig;

import org.springframework.stereotype.Component;


public class Student {

	 private Samosa samosa;
	 
	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public void exam(){
		this.samosa.display();
		System.out.println("Student giving exam");
	}
}