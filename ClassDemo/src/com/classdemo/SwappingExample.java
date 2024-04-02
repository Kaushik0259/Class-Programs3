package com.classdemo;

import java.util.Scanner;

public class SwappingExample {

	public void swapFunction(int a, int b)
	{
		int temp;
		temp=a;   //a
		a=b;
		b=temp;
	}
	
	public static void main(String[] args) {
		SwappingExample sx= new SwappingExample();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		
		sx.swapFunction(10,30);
	}

}
