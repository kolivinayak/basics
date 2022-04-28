package tech.classobject;

import java.util.Scanner;

public class StudentProc {

	int roll_no;
	String name;
	float marks;
	
	Scanner sc = new Scanner(System.in);
	
	void input_Details()
	{

		System.out.println("Enter Name of student : ");
		name = sc.nextLine(); // this have to be first while taking multiple input as it expect few more scanner lines
		
		System.out.println("Enter Roll number of student : ");
		roll_no = sc.nextInt();
		
		System.out.println("Enter Marks of student : ");
		marks = sc.nextFloat();

		System.out.println();
		sc.close();

	}
	
	void display()
	{
		
		System.out.println("The entered details Roll no: " + roll_no + " Name : " + name + " Marks : " + marks);
	}
	
 

}
