package tech.loops;

import java.util.Scanner;

public class ForLoopMulTableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to print multiplication table");
		int num = sc.nextInt();
		System.out.println("Enter the limit for Multiplication table");
		int limit = sc.nextInt();
		
		for (int i = 1 ; i<= limit;i++)
		{
			System.out.println( num * i );
			
		}
	}

}
