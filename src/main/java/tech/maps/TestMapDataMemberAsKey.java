package tech.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestMapDataMemberAsKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(101, "ABC", 2000);
		Employee e2 = new Employee(102, "XYZ", 2000);
		Employee e3 = new Employee(103, "PPP", 2000);
		
		
		TreeMap <Integer, Employee>tm = new TreeMap<Integer, Employee>();
		
		tm.put(e1.empID, e1);
		tm.put(e2.empID, e2);
		tm.put(e3.empID, e3);
		
		for (Map.Entry<Integer, Employee> m: tm.entrySet())
		{
			System.out.println(m.getKey()+"-->"+ m.getValue());
			
		} // we don't need to override compareTo method in Employee as we have key availble for sorting; map has required mechanism in place
		
		
	}

	

}
