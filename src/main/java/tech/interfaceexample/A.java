package tech.interfaceexample;

public interface A {

	void msg();
	
	default void show()
	{
	System.out.println("Default method called");	
	}
	
	static void print()
	{
		System.out.println("Static method called");
	}
	
}

