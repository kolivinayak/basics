package tech.multilevelinheritance;

import java.util.Scanner;

public class Marks extends Student {

	int marks;
	Scanner sc = new Scanner(System.in);
	
	void inputmark()
	{
		 
		System.out.println("Enter the marks");
		marks = sc.nextInt();
		
	}
	
	
	
}
