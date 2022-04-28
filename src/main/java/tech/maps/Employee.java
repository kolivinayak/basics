package tech.maps;

public class Employee {

	int empID;
	String name;
	double salary;
	
	public Employee(int empID, String name, double salary)
	{
		this.empID = empID;
		this.name = name;
		this.salary = salary;
		
	}
	
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
