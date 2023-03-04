package tech.singleinhertiance;

import java.util.Scanner;

public class Marks extends Student {

	int marks;
	Scanner sc = new Scanner(System.in);
	
	void inputmark()
	{
		
		System.out.println("Enter the marks");
		marks = sc.nextInt();
		
	}
	
	void display() {
		System.out.println("The student details are Name:  " + name + " Roll no " + roll_no + " Marks : " + marks );
	}
	
}
