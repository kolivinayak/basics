package tech.inputPackage;

import java.util.Scanner;

public class VoterAgeEligibilityClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println(" Enter age of person  \n" );
		int Age = sc.nextInt();
		
		if (Age >= 18 ) {
			
			System.out.println("Person is eligible for voting ...!");
		}
		
		
	}

}
