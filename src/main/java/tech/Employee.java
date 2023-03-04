package tech;

public class Employee {

	String firstName = "FirstName";
	private String lastName = "LastName";
	private int empNumber = 2;
	int r = 6;
	
	public Employee(String fName, String lastName, int empNumber) {
		super();
		int r = 5;	
		this.firstName = fName;
		this.lastName = lastName;
		this.empNumber = empNumber;
		System.out.println(r);
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	
	public void calc() {
		System.out.println("Variable r " + r);
	}

}
