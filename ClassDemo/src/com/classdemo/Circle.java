package com.classdemo;

import java.util.Scanner;

public class Circle 
{
	double r,area,circle;
	
	void calArea()
	{
		area =3.14*r*r;
		System.out.println("Area of Circle is:"+area);
	}
	
	void calCircle()
	{
		circle= 2*3.14*r;
		System.out.println("Circumference of circle:"+circle);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
        double r = sc.nextDouble();
        
        Circle c1= new Circle();
        c1.r=r;
        c1.calArea();
        c1.calCircle();
	}

}