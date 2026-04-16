package com.codegnan.collectionsframework.maps;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		Map<Integer,String> personMap = new TreeMap<>();
		
		personMap.put(102,"Raj");
		personMap.put(100,"Sam");
		personMap.put(50,"Khan");
		
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
        for(Integer key:personMap.keySet()) {
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
