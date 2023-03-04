package tech.abstractionshape;

import java.util.Scanner;

public class Reactangle extends Shape {

	int length;
	int breadth;
	
	public Reactangle() {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value for Length");
		length = sc.nextInt();
		
		System.out.println("Enter the value for Breadth");
		breadth = sc.nextInt();
		
	}
	void area() {
		System.out.println("Area of reactange is : " + (length * breadth));
		
	}
	void perimeter() {
		System.out.println("The perimeter of reactanle is : " + (2 * (length* breadth)));
	}
	
}
