package com.classdemo;

class A
{
	int nonStaticVariable;//instance variable
	static int staticVariable;// static variable
	
	static void staticmethod()// static method
	{
		System.out.println("Satic variable: " +staticVariable);
		//System.out.println(nonStaicVariable);// non static methods can't be accessible into static method
	}	
		void nonSaticMethod() // instance method
		{
			System.out.println("Satic variable: "+staticVariable);
			System.out.println("Non-Satic variable: "+nonStaticVariable);
		}
	
}



public class MainInstanceClass {

	public static void main(String[] args) {
		
		A.staticVariable=10;
		//A.nonStaticVariable=10;//no object created so can't call the variable
		A a1=new A();
		A a2=new A();
		System.out.println("Non-Satic variable: "+a1.nonStaticVariable);
		System.out.println("Satic variable: "+a1.staticVariable);
		a1.nonSaticMethod();
		a1.staticmethod();
		
		System.out.println("Satic variable: "+a2.staticVariable);
		a1.staticVariable=20;
		System.out.println("Satic variable: "+a2.staticVariable);
	}

}
