package tech.Inheritance_overriding_method_constructor;

public class HR extends Employee{

	int number_of_recruitments;
	
	HR(int emp_id, String name, double sal, int number_of_recruitments){
		
		super(emp_id, name, sal);
		this.number_of_recruitments = number_of_recruitments;
		
	}
	
	void calc_sal(double allownce) {
		
		System.out.println("The HR salary is " + (sal + (number_of_recruitments * allownce)));
	
		super.calc_sal(number_of_recruitments * allownce);
	}
	
}
