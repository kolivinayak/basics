package tech.array;

import java.util.Scanner;


public class twodimarrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter number of rows");
		int row = sc.nextInt();
		System.out.println("Enter number of columns");
		int column = sc.nextInt();
		
		int arr[][] =  new int[row][column];
		
		System.out.println("Enter values for 2 dim  array");
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
			System.out.print("Enter arr element [ "+ i + " ] [ " + j +" ] : ");
			 arr[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("Printing 2 dim  array");
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
			 System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		sc.close();
		
	}

}
