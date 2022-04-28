package tech.Inheritance_overriding_method_constructor;

public class Employee {

	int emp_id;
	String name;
	double sal;
	double total_sal; 
	
	Employee(int emp_id, String name, double sal){
		
		this.emp_id = emp_id;
		this.name = name;
		this.sal = sal;
		
	}
	
	void display() {
		
		System.out.println("The details of employee" + 
				" Name: " + name + 
				" Emp ID: " + emp_id +
				" Sal: " + sal +
				" total sal: " + total_sal 
				);
		
	}
	
	void calc_sal(double allownce) {
		this.display();
		total_sal = sal + allownce;
		System.out.println("Employee total salary is " + total_sal );
	}
	
}
