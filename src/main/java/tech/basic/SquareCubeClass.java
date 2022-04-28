package tech.basic;

import java.util.Scanner;

public class SquareCubeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enther number to find Square are cube");
		
		int num = sc.nextInt();
		
		System.out.println("Enter S for square or C for Cube of :" + num);
		
		char choice = sc.next().charAt(0);
		
		while (choice != '0' ) {
		
			switch (choice){
			
			case 'S':
			case 's':
				
				System.out.println("The Square of " + num + "is : " + (num * num));
				
				break;
				
			case 'C':
			case 'c':
				System.out.println("The Cube of " + num + "is : " + (num * num * num));	
				break;
			
			default:
			System.out.println("Select valid choice");		
				
			}
			
			
		}
		
		sc.close();
		
	}

}
