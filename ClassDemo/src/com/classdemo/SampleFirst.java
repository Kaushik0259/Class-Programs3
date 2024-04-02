package com.classdemo;

class Sample{
	
	int x=5;
}

public class SampleFirst {
	final int x=10; //instance variable
					//10 will  be the constant value for variable x

	public static void main(String[] args) {
		
		SampleFirst sf1= new SampleFirst();
		//sf1.x = 40;
		
		System.out.println(sf1.x);
		
		SampleFirst sf2= new SampleFirst();
		
		Sample sm= new Sample();
		
		System.out.println(sf1.x);
		System.out.println(sf2.x);
		System.out.println(sm.x);

	}

}
