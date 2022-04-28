package tech.studentobjarr;

import java.util.Scanner;

public class Student {
	int student_roll;
	String Student_name;
	float Student_marks;

    Student() {
	// TODO Auto-generated constructor stub
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter roll no of student");
	student_roll = sc.nextInt();
	
	System.out.println("Enter student name");
	Student_name = sc.next();
	
	System.out.println("Enter student marks");
	Student_marks = sc.nextFloat();
	
}


	void display_students() {
		System.out.println("The student details Roll Number: " + student_roll + " Name : "+ Student_name + "Marks: " + Student_marks);;	
	}

}
