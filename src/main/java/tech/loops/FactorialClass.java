package tech.loops;

import java.util.Scanner;

public class FactorialClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number to find factorrial");
		
		int num = sc.nextInt();
		
		int factor = 1;
		
		for (int i = num ; i > 0 ; i--) {
			
			factor *= i; // factor = factor * i;
		}
		System.out.println("factor of " + num + " is "+ factor);
	}

}
