package tech.loops;


import java.util.Scanner;

public class ForUserInputClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range to print squares of numbers");
		
		int range = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i<= range; i++) {
			
			int square = i*i;
			System.out.println("The square is " + square);
			sum = sum + square;
		}
	System.out.println("The sum of all sqaure is :" + sum);	
	}

}
