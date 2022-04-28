package tech.stringoperations;

public class SplitMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Java is a programming Language";
		
		String arr[] = s1.split(" ");
		
		for (String s : arr)
			System.out.println(s);
		
		System.out.println();
		
		arr = s1.split(" ", 3);
		
		for (String s : arr)
			System.out.println(s);
		
	}

}
