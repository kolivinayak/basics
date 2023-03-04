package tech.basic;

import java.util.Scanner;

public class StudentRecordClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		String StudentName;
		int StudentAge;
		int StudenRollNo;
		int StudenMarks;
		char StudentGrade;
		
	
		System.out.println("Enter student Name \n");
		StudentName = sc.next();
		System.out.println("Enter student Age \n");
		StudentAge = sc.nextInt();
		System.out.println("Enter student RollNo \n");
		StudenRollNo = sc.nextInt();		
		System.out.println("Enter student Marks \n");
		StudenMarks = sc.nextInt();
		System.out.println("Enter student Grade \n");
		StudentGrade = sc.next().charAt(0);
		
		System.out.println(" Student Name : " + StudentName + " Age  " + StudentAge + " Roll Number :  " + StudenRollNo + " Marks  " + StudenMarks + " Grade " + StudentGrade);
		
	}

}
