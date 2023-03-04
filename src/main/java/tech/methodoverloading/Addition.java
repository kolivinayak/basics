package tech.methodoverloading;

public class Addition {

	void add(int a,int b) {
		System.out.println("The addition of numbers is " + (a+b));
	}
	 
	void add(int a, int b, int c) {
		
		System.out.println("The addition of numbers is "+ (a+b+c));
	}
	 
	float add(float a, float b) {
		//System.out.println("The addition of numbers is " + (a+b));
		return (a+b);
	}
	
	String add(String a, String b) {
		return (a+b);
	}
	
}
