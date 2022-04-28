package tech.array;

import java.util.Scanner;

public class ArraySumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int sz = sc.nextInt();
		
		int arr[] = new int[sz];
		
		System.out.println("enter the elements of array");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i]; 
		}
		 
		System.out.println("The sum of array is : "+ sum);
		
	}

}
