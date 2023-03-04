package tech.loops;

import java.util.Scanner;

public class CountDigitsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int num = sc.nextInt();
		
		int count = 0;

		
		if (num < 0)
			num = num * -1;
		
		if (num == 0)
			count = 1;
		else {
			while (num > 0) {
				num = num /10;
				count +=1;
			}
			
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
