package tech.constructor;

public class Student2 {

	int rollno;
	String name;
	
	// default constructor
/*	Student2(){
		
		System.out.println("Student details default constructor");
		
	}
*/	
	// parameterized constructor 
	Student2(int rollno, String name){
		
		this.rollno = rollno; // this points to instance variable and other points local varible inside constr
		this.name = name;
		
	}
	
	void display() {
		
		System.out.println("Student Roll no is : " + rollno + " Student Name is : " + name);
	}
}
