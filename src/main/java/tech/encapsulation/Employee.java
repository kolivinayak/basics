package tech.encapsulation;

public class Employee {

	private int empId;
	private String name;
	
	public void setEmpId (int empId) {
		if (empId > 100)
			this.empId = empId;
	}
	
	public int getEmpID() {
		return empId;
	}
	
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
}
