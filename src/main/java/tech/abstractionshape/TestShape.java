package tech.abstractionshape;

public class TestShape {

public static void main(String[] args) {
	
	Shape s = new Reactangle();
//	Shape s1 = new Circle();
	
	s.area();
	s.perimeter();
	
	// assign circle object
	s = new Circle();
	
	s.area();
	s.perimeter();
	
	}
	
}
