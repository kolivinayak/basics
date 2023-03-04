package tech.constructor;

public class Employee {

	int emp_id;
	String emp_name;
	double emp_sal;

	Employee(int emp_id, String emp_name, double emp_sal)
	{
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_sal = emp_sal;
	}
	
	void display() {
		
		System.out.println("The details of employee, Id : " + emp_id + " Name : " + emp_name + " Salary : " +  emp_sal);
		
	}
	
	
}
