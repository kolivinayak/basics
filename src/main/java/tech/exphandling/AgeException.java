package tech.exphandling;

public class AgeException extends Exception {
	public AgeException(String s) {
		super(s);
		System.out.println("We can take screen shot here");
	}
}
