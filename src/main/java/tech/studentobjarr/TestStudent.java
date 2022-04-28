package tech.studentobjarr;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of student in class");
		
		int no_of_students = sc.nextInt();
		
		Student s[] = new Student[no_of_students];
		
		
		for (int i = 0; i < no_of_students; i++) {
			s[i] = new Student();  // Object array initialization by constructor very important 
		}
		
		for (Student student : s) {
			student.display_students();
		}

	}

}
