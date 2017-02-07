package com.tutorialspoint;

public class Student implements Performer{
	private String stud  = "Student";
	public Student(){}
	
	public Student(int beanBags){
		this.stud = stud ;
	}
	public void perform() {
		System.out.println("Hello, I'm a "+stud + ".");
	}
}

