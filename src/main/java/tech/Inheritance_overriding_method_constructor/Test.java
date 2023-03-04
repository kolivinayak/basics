package tech.Inheritance_overriding_method_constructor;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Manager(101, "ABC", 9999.00f, 5);
		Employee e2 = new HR(102, "XYZ", 8888.00f, 7);
		
		e1.calc_sal(300.00f);
		e2.calc_sal(200.00f);
		
		
//		e1.display();
//		e2.display();
		
		
	}

}
