package tech.multilevelinheritance;

import java.util.Scanner;

public class Student {

	int roll_no;
	String name;
	
	void input() {
			 
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the roll no of student ");
		roll_no = sc.nextInt();
		
		System.out.println("Enter the name of student");
		name = sc.next();
	}
	
	
}
