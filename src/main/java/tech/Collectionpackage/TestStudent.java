package tech.Collectionpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Employee e1 = new Employee(777,"ABC", 9000);
			Employee e2 = new Employee(999,"DEF", 7000);
			Employee e3 = new Employee(666,"GHI", 8000);
			
		//	System.out.println(e3);
			
			//create Array list and make it generic to Employee;
			
			ArrayList<Employee> al = new ArrayList<Employee> ();
			
			al.add(e1);
			al.add(e2);
			al.add(e3);
		
			/*
			//Collection.sort(al) method can be used for sorting arrayList but we have to override
			//compareTo method inside Employee class also implment Comparable<Employee> interface
			*/
			
			Collections.sort(al);
			
			ListIterator<Employee> itr =  al.listIterator();
			
			System.out.println("Forward diretion");
			
			while (itr.hasNext()) {
				
				System.out.println(itr.next());
				
			}
			
			System.out.println("Backword diretion");
			
			while (itr.hasPrevious()) {
				
				System.out.println(itr.previous());
				
			}
			
	
			
			
			
	}

}
