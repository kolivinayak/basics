package tech.Collectionpackage;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list = new LinkedList<Integer> ();
		
		list.add(199);
		list.add(299);
		list.add(399);
		list.add(499);
		list.add(599);
		list.add(699);
		list.add(799);
		list.add(899);
		
		ListIterator<Integer> itr = list.listIterator();
		
		System.out.println("Forward list");
		
		while (itr.hasNext()) {
			System.out.print(itr.next());
			System.out.print("  ");
		}
		
		System.out.println();
		System.out.println("Backword list");
		
		while (itr.hasPrevious()) {
			System.out.print(itr.previous());
			System.out.print("  ");
		}
		
				
		
		
	}

}
