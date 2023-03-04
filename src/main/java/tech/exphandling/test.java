package tech.exphandling;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int div;
		int arr[] = new int [3];
		
		
//		try {
//			arr[3] = 5;
//			div = 2 /0;
//		
//		}catch (ArithmeticException e) {
//			e.printStackTrace();
//		}catch (IndexOutOfBoundsException e) {
//			System.out.println(e);
//		}finally {
//			System.out.println("inside finally block");
//		}
//		
		
		try {
			//div = 2 /0;
			arr[3] = 5;
			
		}catch ( ArithmeticException | IndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.out.println("The exception msg is " + e.getMessage());
		}finally {
			System.out.println("inside fially");
		}
		
	
	}

}
