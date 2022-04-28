package tech.Collectionpackageset;

import java.util.HashSet;

public class setMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(111);
		hs.add(444);
		hs.add(555);
		hs.add(666);
		hs.add(777);
		hs.add(666);
		hs.add(999);
		hs.add(654);
	
		
		System.out.println(hs);
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		
		hs1.add(123);
		hs1.add(445);
		hs1.add(576);
		hs1.add(634);
		hs1.add(458);
		hs1.add(666);
		hs1.add(999);
		hs1.add(654);
		
		
		System.out.println(hs1);
	//	hs.addAll(hs1); // AUB => displays distinct values from both sets
		hs.retainAll(hs1); // A intersection B => returns common values from both the sets
		System.out.println(hs);
		
		
		
		
	}

}
