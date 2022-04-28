package tech.basic;

class A {
	public static void display() {
		System.out.println("Inside static method of superclass");
	}
}

class B extends A {
	public void show() {
		display();
	}

	public static void display() {
		System.out.println("Inside static method of this class");
	}
}

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello worlds");

		B b = new B();
		// prints: Inside static method of this class
		b.display();

		A a = new B();
		// prints: Inside static method of superclass
		a.display();

	}

}
