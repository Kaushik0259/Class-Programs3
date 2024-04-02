package com.classdemo;

public class ConstructorDemo {
	
	public ConstructorDemo()
	{
		System.out.println("Constructor start hua");
		
	}
	public void show()
	{
		System.out.println("Normal Method");
	}
	public static void main(String[] args) {
		ConstructorDemo cs= new ConstructorDemo();
		
		cs.show();

	}

}
