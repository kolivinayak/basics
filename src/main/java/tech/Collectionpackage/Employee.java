package tech.Collectionpackage;

// Implement Comparable inteface with generic type of Employee to get rid of error from test class 
//of type cast

public class Employee implements Comparable <Employee>{

	int empid;
	String name;
	double salary;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	Employee(int empid, String name, double salary){
		
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		
	}
	
	// toString method we are overriding java.lang object
	
	public String toString()
	{
		return empid + " " + name + " " + salary + "  Details of Object";
		
	}

// for ascending order
	public int compareTo(Employee o) {

		if (this.empid > o.empid)
			return 1;
		else if (this.empid < o.empid)
			return -1;
		else
			return 0;
	}
	
// for descending order
	

/*
 * public int compareTo(Employee o) {
 * 
 * if (this.empid < o.empid) return 1; else if (this.empid > o.empid) return -1;
 * else return 0; }
 * 
 */
}
