package tech.multilevelinheritanceconstructor;

public class Sports1 extends Marks1{

	int score;
	
	Sports1(int roll_no, String name, int marks, int score){
		
		super(roll_no,name,marks);
		this.score = score;
		 
	}
	
	void display() {
		
		System.out.println(" Student details "
				+ " roll no:  " + roll_no + 
				" name " + name + 
				" marks " + marks + 
				" score  " + score);
	}
	
}
