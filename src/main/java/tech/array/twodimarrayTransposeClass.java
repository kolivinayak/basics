package tech.array;

import java.util.Scanner;

public class twodimarrayTransposeClass {

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
			System.out.println();
		}
		
		System.out.println("Entered 2 dim  array");
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
			 System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose of array");
		
		int traarr[][] = new int[column][row];
		
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				traarr[i][j] = arr[j][i];
			}
		}
		
		
		System.out.println("Transposed 2 dim  array");
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
			 System.out.print(traarr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
