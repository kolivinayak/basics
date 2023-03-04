package tech.Overriding;

public class Circle extends Shape implements areaInterface{

	//int r =2;
	public void area(int r) {
		
		System.out.println("The are of circle is " + (3.142 * r * r ));
		
	} 
	
}
