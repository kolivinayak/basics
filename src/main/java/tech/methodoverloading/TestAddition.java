package tech.methodoverloading;

public class TestAddition {

	public static void main(String[] args) {
 
		
		Addition a = new Addition();
		 
		a.add(50, 6);
		a.add(600, 60, 6);
		
		float f = a.add(56.45f, 9.0f);
		System.out.println("The addition of floats is " + f);
		
		String s = a.add("Vinayak" , "  Koli");
		System.out.println("The concatation of string is " + s);
	}

}
