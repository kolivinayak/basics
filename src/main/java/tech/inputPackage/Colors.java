package tech.inputPackage;

import java.util.Scanner;

public class Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		System.out.println("Enter below options for choice of colors"+ "\n" +"1.Red"+ "\n" + "2.Green");
	
		Scanner sc = new Scanner (System.in);
		int ch = sc.nextInt();
		
		switch (ch)
		{
		
		case 1:
			System.out.println("Your choice is red");
			break;
		case 2:
			System.out.println("Your choice is green");
			break;
		default:
			System.out.println("You have no color choice");
		}
*/
		// With character
		
/*		
		System.out.println("Enter below options for choice of colors"+ "\n" +"1.Red"+ "\n" + "2.Green");
		
		Scanner sc = new Scanner (System.in);
		char ch = sc.next().charAt(0);
		
		switch (ch)
		{
		
		case '1':
			System.out.println("Your choice is red");
			break;
		case '2':
			System.out.println("Your choice is green");
			break;
		default:
			System.out.println("You have no color choice");
		}
*/		

		System.out.println("Enter below options for choice of colors"+ "\n" +"1.Red"+ "\n" + "2.Green");
		
		Scanner sc = new Scanner (System.in);
		String stringopt = sc.next();
		
		switch (stringopt)
		{
		
		case "1":
			System.out.println("Your choice is red");
			break;
		case "2":
			System.out.println("Your choice is green");
			break;
		default:
			System.out.println("You have no color choice");
		}
		sc.close();
		
	}

}
