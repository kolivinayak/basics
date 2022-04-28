package tech.array;

import java.util.Scanner;

public class LargestNumberClass {

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
		
		int large=arr[0];
		
//		for (int i = 0; i < arr.length; i++) {
//			if ( large < arr[i] )
//				large = arr[i];
//		}

		for (int i : arr) {
			if (large < i)
				large = i;
		}
		
		System.out.println("The largest number from array is :" + large);
		
	}

}
