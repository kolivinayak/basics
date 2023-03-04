package tech.Inheritance_overriding_method_constructor;

public class Manager extends Employee{

	int number_of_projects;
	
	Manager(int emp_id, String name, double sal, int number_of_projects){
		
		super(emp_id,name,sal);
		this.number_of_projects = number_of_projects;
	}
	
	void calc_sal(double allownce) {
		
// use employee class variables to update values for display so we no need to call super calc_sal		
		System.out.println("The manager salary is " + (sal +  (number_of_projects * allownce)));
		
		super.calc_sal(number_of_projects * allownce);
	}
	
}
