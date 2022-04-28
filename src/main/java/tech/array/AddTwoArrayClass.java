package tech.array;

import java.util.Scanner;

public class AddTwoArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the no of rows");
		int row = sc.nextInt();
		System.out.println("wnter the no of cols");
		int col = sc.nextInt();
		
		int arr1[][] = new int[row][col];
		int arr2[][] = new int[row][col];	
		int arr3[][] = new int[row][col];	
		
		System.out.println("Enter values for first array");
		for(int i=0; i< row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("Enter arr1 element [ "+ i + " ] [ " + j +" ] : ");
				arr1[i][j] = sc.nextInt();	
			}
			System.out.println();
		}
		System.out.println("Enter values for second array");
		for(int i=0; i< row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("Enter arr2 element [ "+ i + " ] [ " + j +" ] : ");
				arr2[i][j] = sc.nextInt();	
			}
			System.out.println();
		}	
		
		System.out.println("doing addition of two arrays");
		for(int i=0; i< row;i++) {
			for(int j=0;j<col;j++) {
			arr3[i][j] = arr1[i][j] + arr2[i][j];	
			}
			System.out.println();
		}	
		
		System.out.println("addition of two arrays");
		for(int i=0; i< row;i++) {
			for(int j=0;j<col;j++) {
			System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}	
	}

}
