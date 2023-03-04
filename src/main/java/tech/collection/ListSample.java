package tech.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> lst = new ArrayList<String>();
		
		lst.add("Vinayak");
		lst.add("Radhika");
		lst.add("Samruddhi");
		lst.add("Angel");
		lst.add("Vinayak");
		
		System.out.println(lst);
		
		System.out.println(lst.contains("Angel"));
		
		Iterator <String> itr = lst.iterator();
		
		while (itr.hasNext()) {
			String element = (String) itr.next();
			System.out.println(element);
			
		}
		
		lst.add("timepass");
		
		System.out.println(lst.size());
		System.out.println(lst.get(4));
		
		System.out.println(lst.indexOf("Radhika"));
		lst.remove(4);
		System.out.println(lst);
		
		
		lst.add(2, "mango");
		System.out.println(lst);
		
		lst.set(2, "Apple");
		System.out.println(lst);
		lst.clear();
		System.out.println(lst.size());
	}

}
