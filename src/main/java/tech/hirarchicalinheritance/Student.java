package tech.hirarchicalinheritance;

import java.util.Scanner;

public class Student extends Person{

	int roll_no;
	int marks;
	
	void input_student()
	{
		Scanner sc = new Scanner (System.in);

		System.out.println(" Enter the roll no ");
		roll_no = sc.nextInt();
		
		System.out.println("Enter marks ");
		marks = sc.nextInt();
	}
	
	
	void show_student() {
		System.out.println("Studnet Name " + name + " Age " + age + " Roll no " + roll_no + " marks " + marks);
	}
}
