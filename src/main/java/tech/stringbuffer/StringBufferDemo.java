package tech.stringbuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StringBufferDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(in);
		
		System.out.println("Enter your name : ");
		
		String name = bfr.readLine();
		
		System.out.println(" Your name is " + name);
	
	System.out.println(" enter a number : ");
	String s = bfr.readLine();
	int num = Integer.parseInt(s);
	
	System.out.println("The square of entered num is : " + (num * num));
		
	}

}
