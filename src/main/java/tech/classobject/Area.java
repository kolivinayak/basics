package tech.classobject;


public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int length;
		int breadth;
		
		InputForArea in = new InputForArea();
		
		ReactangleAreaPerimeter rect = new ReactangleAreaPerimeter();
		
		length = in.input_Length();
	
		breadth = in.input_bredth();
		
		
		System.out.println("Area of ractangle is : " + rect.area(length, breadth));		

		System.out.println("Perimeter of ractangle is : " + rect.perimeter(length, breadth));		
		
		
	}

}
