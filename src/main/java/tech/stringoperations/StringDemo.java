package tech.stringoperations;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String ("Hello");
		String s2 = "Hello";
		String s3 = new String ("Hello");
		String s4 = "Hello";
		String s5 = "HeLLo";
		
		if (s1.equals(s2)) {
			System.out.println("Strings equals are " + s1.equals(s2));
		} else
			System.out.println("Strings are not equal ");


		if (s1 == s2 ) {
			System.out.println("Strings equals are " + s1.equals(s2));
		} else
			System.out.println("Strings equals are " + (s1 == s2 ));

		if (s3 == s1 ) {
			System.out.println("Strings equals are " + s1.equals(s2));
		} else
			System.out.println("Strings equals are " + (s3 == s1 ));

		if (s2 == s4 ) {
			System.out.println("Strings equals are " + s1.equals(s2));
		} else
			System.out.println("Strings equals are " + (s4 == s2 ));

		if (s1.equalsIgnoreCase(s5) ) {
			System.out.println("Strings equals are " + s1.equals(s2));
		} else
			System.out.println("Strings equals are " + (s1.equalsIgnoreCase(s5) ));

	
//		if (s1.compareTo(s2)) {
//
//		}
//
	}

}
