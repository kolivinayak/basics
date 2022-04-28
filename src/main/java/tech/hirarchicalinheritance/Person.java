package tech.hirarchicalinheritance;

import java.util.Scanner;

public class Person {
	int age;
	String name;

	void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age of person");
		System.out.println();
		
		age = sc.nextInt();
		
		System.out.println("Enter the name of person");
		System.out.println();
		
		name = sc.next();
		sc.close();
	}
}
