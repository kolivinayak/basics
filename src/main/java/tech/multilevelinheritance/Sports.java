package tech.multilevelinheritance;

import java.util.Scanner;

public class Sports extends Marks {

	int score;
	 
	void input_score() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the score ");
		score = sc.nextInt();
		
	}
	
	void display() {
		System.out.println("The student details are Name:  " + name + " Roll no " + roll_no + " Marks : " + marks + " Score" + score);
	}
	
}
