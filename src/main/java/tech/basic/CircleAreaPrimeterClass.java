package tech.basic;

import java.util.Scanner;

public class CircleAreaPrimeterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter radious to find area and preimeter of circle");
		
		int r = sc.nextInt();
		
		System.out.println("The are of circle is :" +  (3.142 * (r*r)) + "  Perimeter is :" +  (3.142 * 2 * r));
		sc.close();
	}

}
