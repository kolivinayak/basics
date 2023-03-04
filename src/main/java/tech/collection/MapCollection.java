package tech.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new TreeMap<String, String>();
//		Map<String, String> map = new LinkedHashMap<String, String>();
//		Map<String, String> map = new HashMap<String, String>();
//		Map<String, String> map = new Hashtable<String, String>();

		map.put("Apr", "April");
		map.put("May", "May");
		map.put("Jun", "June");
		map.put("Jan", "January");
		map.put("Feb", "February");
		map.put("Mar", "march");
//		map.put("Apr", "April");
//		map.put("May", "May");
//		map.put("Jun", "June");
		map.put("Jul", "July");
		map.put("Aug", "August");
		map.put("Spet", "September");
		map.put("Octo","October");
		map.put("Nov", "November");
		map.put("Dec", "December");
		
		System.out.println(map);
		
		System.out.println("The value of Jul is : " + map.get("Apr"));
	}

}
