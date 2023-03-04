package tech.pack2.naming.convention;

import tech.pack1.name.pack.MethodCls;

public class SecondClass extends MethodCls{

	
	public static void main(String[] args) {
	
		SecondClass sc = new SecondClass();
		
		sc.show();
		sc.msg();
		
	}
	protected void msg() {
		System.out.println("Inside protected method");
		super.show();
		
	}
	
}
