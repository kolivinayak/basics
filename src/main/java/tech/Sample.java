package tech;

public class Sample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		Employee emp1 = new Employee("First1", "Last1", 1+3*3);
		
		/*
		 * Employee emp2 = new Employee("First2", "Last2", 2); Employee emp3 = new
		 * Employee("First3", "Last3", 3); Employee emp4 = new Employee("First4",
		 * "Last4", 4);
		 */
		
		System.out.println("The First Employee details : First Name -  " + emp1.getFirstName() + "Last Name - " + emp1.getLastName() + "Emp Number - " + emp1.getEmpNumber() );
		System.out.println("The First Employee details : First Name -  " + emp1.firstName);
			
	}

}

