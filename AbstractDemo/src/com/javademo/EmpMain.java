package com.javademo;

import java.util.Date;

/*
 * OOPS
 * Class
 * Object
 * Encapsulation - wrapping of data into single unit
 * Abstraction - show essential data(abstract class and interface)
 * Inheritance - Is-a
 * Polymorphism - compile time and runtime 
 * 					Method overloading and overriding
 * 					constructor overloading
 */

class employee
{
	int id ;
	String name;
	String desig;
	private String sal;
	Date dob;
	String username;
	private String password;
	
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employee(int id, String name, String desig, String sal, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.desig = desig;
		this.sal = sal;
		this.dob = dob;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", desig=" + desig + ", sal=" + sal + ", dob=" + dob
				+ ", username=" + username + ", password=" + password + "]";
	}
	
	
}
public class EmpMain {

	public static void main(String[] args) {
		
		employee emp= new employee();
		System.out.println(emp);

	}

}
