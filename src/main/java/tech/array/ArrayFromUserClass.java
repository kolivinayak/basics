package tech.array;

import java.util.Scanner;

public class ArrayFromUserClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array you want to be");
		int length = sc.nextInt();
		int arr[] = new int[length];
		
		System.out.println("Enter elements of array");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
