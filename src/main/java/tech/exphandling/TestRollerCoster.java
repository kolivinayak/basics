package tech.exphandling;

import java.util.Scanner;

public class TestRollerCoster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RollerCoster rc = new RollerCoster();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter age of ridder");

		int age = sc.nextInt();

		try {
			rc.validAge(age);
		} catch (AgeException e) {
		//	e.printStackTrace();
		System.out.println("The exception is : " + e.getMessage());
		}

	}

}
