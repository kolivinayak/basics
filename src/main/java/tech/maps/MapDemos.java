package tech.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, "ABC");
		hm.put(102,"CDE");
		hm.put(103,"FGH");
		hm.put(103,"XYZ"); //it will have only latest value , its insertion is random
		hm.put(400,"sdfs");
		
	
		
		System.out.println(hm);
	
		hm.replace(103, "FCZ");
		System.out.println(hm);
		
		LinkedHashMap <Integer, String> lhs = new LinkedHashMap<Integer, String> ();
		
		lhs.put(201, "ABC");
		lhs.put(302,"AAAfsdfsh");
		lhs.put(503,"VVVV");
		lhs.put(603,"XYZ");
		
		System.out.println(lhs);
		
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		tm.put(1201, "ABC");
		tm.put(302,"AAA");
		tm.put(1503,"VVVV");
		tm.put(1603,"XYZ");
		
		System.out.println(tm);
		
		
		tm.putAll(lhs); // merge maps
		
		System.out.println(tm);
		
		tm.remove(302);
		System.out.println(tm);
		
		tm.remove(1603, "XYZ");
		System.out.println(tm);
		
		System.out.println("The value of " + tm.get(1201));
		
		tm.replace(1201, "Vinayak");
		System.out.println(tm);
		
		System.out.println("The map contains 1201 " + tm.containsKey(1201));
		
		System.out.println("The map contains 1201 " + tm.containsValue("Vinayak"));
		
		
		
		}

}
