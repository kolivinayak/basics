package tech.multilevelinheritanceconstructor;

public class Marks1 extends Student1{

	int marks;
	
	Marks1(int roll_no, String name, int marks){
		
		super(roll_no,name);
		this.marks = marks;
		 
	}
	
}
