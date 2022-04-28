package tech.constructor;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Vinayak", 9999999.99);
		Employee e2 = new Employee(2, "Koli", 1288888888.99);
		Employee e3 = new Employee(3, "Vinayak_koli", 45353777777777.99);
	
		
		if ((e1.emp_sal > e2.emp_sal) && (e1.emp_sal > e3.emp_sal))
			System.out.println("Employee " + e1.emp_name + " has more Salary");
		else if (( e2.emp_sal > e1.emp_sal ) && (e2.emp_sal > e3.emp_sal))
			System.out.println("Employee " + e2.emp_name + " has more Salary");
		else 
			System.out.println("Employee " + e3.emp_name + " has more Salary");

		
		System.out.println("Below is the all employee stats");
		
		e1.display();
		e2.display();
		e3.display();
		
		
		
		
	}
			
		
	
}
