package com.dependencyInjection;

public class Student {

	 private int id;
	private String studentName;
	
	
	
	
	public void setId(int id) {
		this.id = id;
	}




	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}




	public void displayStudentInfo(){
		System.out.println("Student name is "+studentName +" and Student Id is "+id);
	}




	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + "]";
	}
	
	
}
