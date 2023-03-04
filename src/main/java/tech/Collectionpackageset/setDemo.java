package tech.Collectionpackageset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// removes duplication and maintain no order elements will be stored in random order
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(111);
		hs.add(444);
		hs.add(555);
		hs.add(666);
		hs.add(777);
		hs.add(666);
		hs.add(999);
		

		hs.remove(111);
		System.out.println(hs);
		
		System.out.println(hs.size());
		System.out.println(hs.contains(666));
		
		// Set has LinkedHasSet class which insertion order and removes duplication
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		
		lhs.add(4434);
		lhs.add(5535);
		lhs.add(6636);
		lhs.add(7737);
		lhs.add(6636);
		lhs.add(9939);
		lhs.add(6534);
		
		System.out.println(lhs);

		
// Set has TreeSet class which maintains sorted set and removes duplication
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(31);
		ts.add(55);
		ts.add(35);
		ts.add(36);
		ts.add(88);
		ts.add(36);
		ts.add(39);
		ts.add(34);
		
		System.out.println(ts);
		

		
	}

}
