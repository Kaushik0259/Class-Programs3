package com.classdemo;

public class SampleSecond { // class declaration
	
	int x=10; // variable declaration and initialization
	
	public void method1()// method defination
	{
		System.out.println("Values of x"+x); // login in method
	}

	public static void main(String[] args) { // starting point for the 
		
		SampleSecond ss1 = new SampleSecond();// object get created and 
		ss1.method1(); // calling method
	}

}
