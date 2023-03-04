package tech.exphandling;

public class Nextedexphandleing {
	public static void main(String[] args) {
		int div;
		int arr[] = new int[3];
		
		try {
			
			try {
				div = 2/0;
			
			}catch (ArithmeticException e) {
				
				e.printStackTrace();
				
			}
			
			try {
				arr[5] = 2;
			} catch (ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
			}
			
		} finally {
			System.out.println("In side finally");
		}

	}
}
