package tech.wrapperclass;

import java.util.Scanner;

public class AreaOfCircleWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s = "7";
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		
		int num = Integer.parseInt(s);
		
		System.out.println("Area of circle is : " + (int) (3.142 * num * num ));
		
	}

}
