package com.classdemo;
//every thing in java is associated with class and object
//an object is created form a class.
//naming convention for declaration of class variable and methods
//give meaningful names to class variable and method
//class is not a real world entity.It is just a template 
class Student //
{
	//data member
	int studId;
	String studName;
	String studAddress;
	String studEmail;
	float marks;
	//method //member functions
	
	public void studentData()
	{
		//body of the method
		//write a logic to store the student id name address email
	}
	
	public void viewStudentdata()
	{
		System.out.println("One student record can fetch");
	}
	
	public void editstoredata()
	{
		//body of the method
		//write a logic to store the student id name address email
	}
	
	public void marksofstudent()
	{
		//body of the method
		//write a logic to store the student id name address email
	}
}

public class ClassSample {

	public static void main(String[] args) {
		Student obj1= new Student();// object creation
		//new keyword is responsible to occupy memory in java 
		obj1.viewStudentdata();
		System.out.println("StudentName"+ obj1.studName);
		obj1.marksofstudent();
		
		
	}

}
