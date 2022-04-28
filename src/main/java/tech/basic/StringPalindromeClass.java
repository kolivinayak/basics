package tech.basic;

import java.util.Scanner;

public class StringPalindromeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		String pallString = sc.nextLine();
		
		int length = pallString.length();
		
		String revString = ""; 
		
		System.out.println("The size of entered string is "+ length);

		for (int i = length -1; i >= 0; i--) {
			revString = revString + pallString.charAt(i);
		}

		System.out.println("first string  " + pallString);
		System.out.println("Second rev string  " + revString);

		if (pallString.equalsIgnoreCase(revString))
			System.out.println("the string pallendrome");

		sc.close();


}
}
