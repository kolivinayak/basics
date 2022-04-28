package tech.classobject;

public class Square {


	int num = 2;
	
	
	int sqaure_num() {
		
		return num*num;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square sq = new Square();
		System.out.println("The square of number is " + sq.sqaure_num() );
		
		
	}

}
