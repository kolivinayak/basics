package tech.methodoverloading;

public class Shape {

	double area(double redius) {
		return (3.142 * (redius * redius));
	}
	
	int area(int length, int breadth) {
		return (length * breadth);
	}
	
	int area(int side) {
	return (side * side);	
	}
}