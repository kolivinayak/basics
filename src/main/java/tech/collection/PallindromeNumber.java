package tech.collection;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number to check if it is Pallindrome");
		Scanner sc = new Scanner(System.in);
		
		int no = sc.nextInt();
		int rev=0;
		int rem;
		int org = no;
		while (no > 0 ) {		
			rem = no % 10;
			rev = (rev * 10 ) + rem;
			no = no / 10;
			
//			System.out.println("no " + no);
//			System.out.println("rem " + rem);
//			System.out.println("rev " + rev);
		}
		
		if (org == rev) {
			System.out.println("The reverse no is " + rev);
		}else {
		System.out.println("The no is not reverse ");
	}
	}

}
