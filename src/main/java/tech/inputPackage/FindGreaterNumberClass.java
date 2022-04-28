package tech.inputPackage;

import java.util.Scanner;

public class FindGreaterNumberClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers to check greater number");
		
		int num1 = sc.nextInt();
		
		System.out.println("  ");
		
		int num2 = sc.nextInt();
		
		if (num1 > num2)
		{
			System.out.println("The greater number is : " + num1);
		} else 
		{
			System.out.println("The greater number is : " + num2);
		}
		
		sc.close();
	}

}
