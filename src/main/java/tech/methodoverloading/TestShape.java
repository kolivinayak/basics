package tech.methodoverloading;

import java.util.Scanner;

public class TestShape {
 
	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
	 	
		Shape shpe =  new Shape();
		
		System.out.println("Enter the redius of circle to calculate area");
		double r = sc.nextInt();
		
		System.out.println("Area of circle is :" + shpe.area(r));
		
		System.out.println("Enter the length and breadth of reactangle to calculate area");
		
		int l = sc.nextInt();
		
		System.out.println();
		
		int b = sc.nextInt();
		
		System.out.println("Area of reactange is :" + shpe.area(l, b));
		

		System.out.println("Enter side of square : ");
		
		int side = sc.nextInt();
			
		System.out.println("The are of square is :" + shpe.area(side));
				
		
		
		
	}

}
