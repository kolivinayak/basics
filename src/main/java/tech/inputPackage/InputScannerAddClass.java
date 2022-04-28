package tech.inputPackage;

import java.util.Scanner;

public class InputScannerAddClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();
		
		System.out.println("The sum of two number is " + (num1 + num2));
	}

}
