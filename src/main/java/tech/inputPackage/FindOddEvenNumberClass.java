package tech.inputPackage;

import java.util.Scanner;

public class FindOddEvenNumberClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check odd or even ");
		int num = sc.nextInt();
		
		if ( num % 2 == 0)
		{ 
			System.out.println("The number is even");
		} else {
			System.out.println("Number is odd ");
		}
		
	}

}
