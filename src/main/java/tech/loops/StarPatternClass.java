package tech.loops;

import java.util.Scanner;

public class StarPatternClass {

	public static void main(String[] args) {

	//	Scanner sc =new Scanner(System.in);
	//	int n= sc.nextInt();
		int n = 5;
		//loop for rows
/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter star pattern row count");
		n = sc.nextInt();
*/

		for (int i = 1; i <= n; i++) {
			// loop for spaces
			for (int j = i; j < n; j++) 
				System.out.print(" ");
			// loop for stars if k=i then star pattern will be different then * has to be printed with "* " space
//			for (int k=1; k < (i*2);k++)
//				System.out.print("*"); 

			for (int l = 1; l <= i; l++)
				System.out.print("* ");

/*
			for (int k=i; k < (i*2);k++)
				System.out.print("* ");
*/			//nextline
			System.out.print("\n");
		}
	}
}
