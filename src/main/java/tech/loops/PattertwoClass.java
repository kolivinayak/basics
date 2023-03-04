package tech.loops;

public class PattertwoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = 5;
		
		
		
		for (int i = 0; i <= size; i++) {
		
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		for (int i = 0; i <= size; i++) {
		
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		for (int i = 0; i <= size; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		int k=0; // value should be incremented as soon as it goes inside loop
		
		for (int i = 0; i <= size; i++) {
			
			for (int j = 1; j < i; j++) {
				System.out.print(k++);
			}
			System.out.println();
		}
		
		char char1='A'; // it take ascii values base values and increment it. AScci can be converted in to binary by dividing it by 2 and noting down reminder
		
		for (int i = 0; i <= size; i++) {
			
			for (int j = 1; j < i; j++) {
				System.out.print(char1++ +" ");
			}
			System.out.println();
		}
		
		
		
	}

}
