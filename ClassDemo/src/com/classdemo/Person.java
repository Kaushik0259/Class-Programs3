//Write a Java program to create a class called "Person" with a name and age attribute. 
//Create two instances of the "Person" class, set their attributes using the constructor, 
//and print their name and age.
package com.classdemo;

import java.util.Scanner;

public class Person
{
	static String name;
	static int age;
	
//	public void display(String name, int age)
//	{
//		System.out.println("Enter Name:"+name);
//		System.out.println("Enter Age:"+age);
//	}
	
	public  String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		name = sc.nextLine();
		System.out.println("Enter Age:");
		age=sc.nextInt();
		
		Person p1 = new Person();
		System.out.println("Name :"+p1.getName()+", Age : "+p1.getAge());
		
	}

}

