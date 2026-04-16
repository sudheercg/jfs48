package com.codegnan.collectionsframework.maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<String,String> personMap = new LinkedHashMap<>();
		
		personMap.put("3333388","Raj");
		personMap.put("4444488","Sam");
		personMap.put("5555488","Khan");
		
		//System.out.println(personMap);
		
		System.out.println();      
	    System.out.println("Entries of PersonMap: ");
        //entrySet - to retrieve Entry from set of entries
        for(Entry entry :personMap.entrySet()) {
        	     System.out.println(entry.getKey()+" "+entry.getValue());
        }
        
        System.out.println();      
        System.out.println("Keys of PersonMap: ");
        
        //keySet() to retieve set of keys		
        for(String key:personMap.keySet()) {
        	  System.out.println(key);
        }
        
        
        System.out.println();      
        System.out.println("Values of PersonMap: ");
        //values() to retieve values
        for(String value : personMap.values()) {
        		System.out.println(value);
        }
		
		
	}

}
