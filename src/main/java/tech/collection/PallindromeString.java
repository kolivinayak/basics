package tech.collection;

import java.util.Scanner;

public class PallindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string to check if its pallindrome or not");

		String Org = sc.next();
		
		int len = Org.length();
		String rev = new String();
		
		for (int i = len - 1 ; i >= 0; i--) {
			rev += Org.charAt(i);
		}
		
		if (Org.equals(rev)) {
			System.out.println("String pallindrome");
		}else {
			System.out.println("String is not pallindrome");
		}
	}

}
