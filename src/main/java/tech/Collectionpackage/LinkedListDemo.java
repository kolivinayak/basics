package tech.Collectionpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(101);
		list.add(300);
		list.add(400);
		
		System.out.println(" The list : " + list);
		list.addFirst(999);

		System.out.println(" The list : " + list);
		
		list.removeLast();
		System.out.println(" The list : " + list);
		
		list.addLast(666);
		System.out.println(" The list : " + list);
		
		list.add(2, 555);
		System.out.println(" The list : " + list);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(200);
		al.add(300);
		
		
		list.addAll(al);
		System.out.println(" The list : " + list);
		
		Collections.sort(list);
		System.out.println(" The list : " + list);
		

		list.removeAll(list);
		System.out.println(" The list : " + list);
	}

}
