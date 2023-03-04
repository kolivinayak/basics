package tech.maps;

import java.util.HashMap;
import java.util.Map;

public class maptraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		HashMap <Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, "ABC");
		hm.put(102,"CDE");
		hm.put(103,"FGH");
		hm.put(103,"XYZ"); //it will have only latest value , its insertion is random
		hm.put(400,"sdfs");
		// to traverse map
		for(Map.Entry<Integer,String> mitr: hm.entrySet())
		{
			
			System.out.println(mitr.getKey() + "-->"+ mitr.getValue());
		}
		
		}
	}

