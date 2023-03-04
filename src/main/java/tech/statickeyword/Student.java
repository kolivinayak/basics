package tech.statickeyword;

public class Student {
	
	int roll_no;
	String name;
	static String clgName = "ITS";
	
	Student(int roll_no, String name){
		
		this.roll_no = roll_no;
		this.name = name;
	}
	
	void display() {
		
		System.out.println(" Student roll no: " + roll_no+ " Name :" + name + " College Name "+ clgName);
		
	}
	
	static void updateClgName(String newclgName) {
	
		clgName = newclgName;

	}
	
	
}
