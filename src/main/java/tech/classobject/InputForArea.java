package tech.classobject;

import java.util.Scanner;

public class InputForArea {

	Scanner sc = new Scanner(System.in);
	
	int input_Length(){
	System.out.println("Enter the length of reactangle  ");
	return sc.nextInt();
	}
	
	int input_bredth()
	{
	System.out.println("Enter the bredth of reactangle  ");
	return sc.nextInt();
	}
}
