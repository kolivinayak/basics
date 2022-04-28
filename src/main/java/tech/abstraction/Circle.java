package tech.abstraction;

import java.util.Scanner;

public class Circle extends Shape{

	final double pi = 3.142;
	int r;
	public Circle() {
		// TODO Auto-generated constructor stub
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the radious of circle ");
 
	r = sc.nextInt();
	
	}
	
	void area() {
		
	System.out.println(" Area of circle is " + (pi * r * r));
		
	}
	
	void perimeter() {
		System.out.println(" The Perimeter of circle is " + (2 * pi * r));
	}
	
	
}
