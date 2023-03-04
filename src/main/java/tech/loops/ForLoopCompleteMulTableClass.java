package tech.loops;

import java.util.Scanner;

public class ForLoopCompleteMulTableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter the number to print multiplication table");
//		int num = sc.nextInt();
//		System.out.println("Enter the limit for Multiplication table");
//		int limit = sc.nextInt();
		
		for (int i = 1 ; i <= 10 ; i++)
		{
			for (int j = 1; j <= 10 ;j++ ) {
			System.out.println(j*i);
			}
		}

}
}
