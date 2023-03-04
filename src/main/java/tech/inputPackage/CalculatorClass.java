package tech.inputPackage;

import java.util.Scanner;

public class CalculatorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("******* C A L C U L A T O R ************");
		System.out.println("The option + for Addition "+"\n");
		System.out.println("The option - for Substraction "+"\n");
		System.out.println("The option * for Multiplication "+"\n");
		System.out.println("The option / for Division "+"\n");
		
		System.out.println("Entre your first number ");
		int num1 = sc.nextInt();
		System.out.println("Entre your Second number ");
		int num2 = sc.nextInt();
		System.out.println("Entre your Choice ");
		char ope = sc.next().charAt(0);
		
		
		switch (ope)
		{
		case '+':
			
			System.out.println("The chice is addition ");
			System.out.println("The Addition of "+ num1 + " + " + num2 + " is " + (num1 + num2));
			break;
		case '-':
			
			System.out.println("The chice is Substraction ");
			System.out.println("The Substraction of "+ num1 + " - " + num2 + " is " + (num1 - num2));
			break;
		case '*':
			
			System.out.println("The chice is multiplication ");
			System.out.println("The Addition of "+ num1 + " * " + num2 + " is " + (num1 * num2));
			break;
		case '/':
			
			System.out.println("The chice is division ");
			System.out.println("The division of "+ num1 + " / " + num2 + " is " + (num1 / num2));
			break;
			default:
				System.out.println("Made invalid choice");
		}
		
		sc.close();
		
	}

}
