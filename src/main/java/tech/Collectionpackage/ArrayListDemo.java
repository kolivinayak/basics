package tech.Collectionpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();
		List<Integer> al2 = new ArrayList<Integer>();
		// ArrayList<Employee> emplList = new ArrayList<Employee>();

		al.add(101);
		al.add(101);
		al.add(307);
		al.add(666);
		al.add(786);

		System.out.println("ArrayList contains " + al);

		al.add(1, 207);

		System.out.println("ArrayList contains after adding at index 1 -> 207 " + al);
		al2.add(309);
		al2.add(566);

		System.out.println("Second list " + al2);

		al.addAll(al2);

		System.out.println("ArrayList contains after adding other list" + al);

		al.remove((Object) 666);
		System.out.println("ArrayList contains after removing object 666 " + al);

		al.remove(2);

		System.out.println(al);

		System.out.println("The data from index 3 is   : " + al.get(3));

		System.out.println("The size of Array list is : " + al.size());

		Collections.sort(al);

		System.out.println("Sorted list ... ");
		System.out.println(al);

		al2.removeAll(al2);

		System.out.println("After removing all ");

		System.out.println(al2);
	}
}
