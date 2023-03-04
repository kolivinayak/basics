package tech.Collectionpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MapIteration {

	public static void main(String[] args) {

		// Creating a HashMap
		Map<String, String> foodTable = new HashMap<String, String>();

		// Inserting elements to the adobe HashMap
		// Elements- Key value pairs using put() method
		foodTable.put("A", "Angular");
		foodTable.put("J", "Java");
		foodTable.put("P", "Python");
		foodTable.put("H", "Hibernate");

		// Iterating HashMap through for loop
		
		/*
		 * for (Map.Entry<String, String> set : foodTable.entrySet()) {
		 * 
		 * // Printing all elements of a Map System.out.println(set.getKey() + " = " +
		 * set.getValue());
		 * 
		 * }
		 */
		 
		
		   // Iterating HashMap through forEach and
        // Printing all. elements in a Map
			
		//	  foodTable.forEach( (key, value) -> System.out.println(key + " = " + value));
			 
		
	
	
        
		   // Iterating every set of entry in the HashMap, and
        // printing all elements of it
			
			  foodTable.entrySet().stream().forEach( input ->
			  System.out.println(input.getKey() + " : " + input.getValue()));
			 

		
	}
}
