package tech.hirarchicalinheritance;

import java.util.Scanner;

public class Employee extends Person {

	int emp_id;
	int salary;
	
	
	void input_employee() {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the emp id ");
		emp_id = sc.nextInt();
		
		System.out.println("Enter the salary");
		salary = sc.nextInt();
		
	}
	
	void display_employee() {
		System.out.println("The employee details Name :" + name + " Age " + age + " Employee id " + emp_id + " Salary " + salary );
	}
	
}
