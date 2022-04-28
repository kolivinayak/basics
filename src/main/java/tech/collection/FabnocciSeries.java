package tech.collection;

public class FabnocciSeries {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		int b=1;
		int c;
		
		System.out.print(a + " ");
		System.out.print(b + " ");
		
		for (int i = 0; i <= 100; i++) {
			c = a + b;
			a=b;
			b=c;
			System.out.print(c + " ");
		}
		
		
	}

}
