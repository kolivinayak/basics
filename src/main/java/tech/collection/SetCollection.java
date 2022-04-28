package tech.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
	public static void main(String[] args) {
		
//		Set<String> set = new TreeSet<String>();
//		Set<String> set = new HashSet<String>();
		Set<String> set = new LinkedHashSet<String>();
		
		set.add("abc");
		set.add("bcd");
		set.add("xyz");
		set.add("lmr");
//		set.add(null);
		set.add("lmno");
		set.add("abc");
		set.add("vinay");
//		set.add(null);
		
		System.out.println(set);
		
//		Iterator<String> itr = set.iterator();
		Iterator<String> itr = set.iterator();
		
		
		while(itr.hasNext()) {
			String str = (String) itr.next();
			System.out.println(str);
		}
		
		System.out.println("Does set contains abc : " + set.contains("koli"));
		
	}
	
	
}
