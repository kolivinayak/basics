package tech.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(101, "ABC", 2000);
		Employee e2 = new Employee(101, "XYZ", 2000);
		Employee e3 = new Employee(101, "PPP", 2000);
		
		
		TreeMap <Integer, Employee>tm = new TreeMap<Integer, Employee>();
		
		tm.put(1111, e1);
		tm.put(2222, e2);
		tm.put(333, e3);
		
		for (Map.Entry<Integer, Employee> m: tm.entrySet())
		{
			System.out.println(m.getKey()+"-->"+ m.getValue());
			
		} // we don't need to override compareTo method in Employee as we have key availble for sorting; map has required mechanism in place
		
		
		//use data member as key
		
		tm.put(1111, e1);
		tm.put(2222, e2);
		tm.put(333, e3);
		
	}

}
