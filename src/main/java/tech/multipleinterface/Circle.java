package tech.multipleinterface;

import java.util.Scanner;

public class Circle extends Dimeter implements Circumference, Area {
 
	int r;
	final float pi = 3.14f;
	
	public Circle() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter redius");
		r = sc.nextInt();
	}
	
	public int area () {
		return (int) (pi * r * r);
	}
	
	
	public int cricum() {
		return (int) (2 * pi * r);
	}

	
	int dimeter() {
		return (int) (2 * r);
	}


	
}
