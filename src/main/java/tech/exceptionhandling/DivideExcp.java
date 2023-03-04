package tech.exceptionhandling;

public class DivideExcp {

	public static void main(String[] args) throws Exception {

		// fun2();
		try {
			fun();

		} 
			  catch (ArrayIndexOutOfBoundsException e) {
			  System.out.println("Array out of bound expection");
			  System.out.println("DivideExcp.main()"); } catch (ArithmeticException e) {
			  
			  System.out.println("Arithmetic exception"); System.err.println("Arithmetic");
			  } catch (Exception e) {
			  
			  System.out.println("Generic exception"); }
			 
		finally {
			System.out.println("I am in finally block");
		}

		System.out.println("I am out of catch");
	}

	public static void fun() throws Exception {

		int a[] = new int[7];
		a[4] = 30 / 0;
		// throw new Exception("Test");
	}

	public static void fun2() {

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
