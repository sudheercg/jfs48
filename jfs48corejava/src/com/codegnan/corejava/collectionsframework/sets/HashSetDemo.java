package com.codegnan.corejava.collectionsframework.sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	public static void main(String[] args) {
		HashSet<Integer> numSet = new HashSet<>();
		numSet.add(100);// hash(100);
		numSet.add(300);
		numSet.add(10);
		numSet.add(4);
		numSet.add(100);
		
		// remove() to remove an object from set
		numSet.remove(4);
		
		//contains() method check whether the object is
		 // present in the set or not.
		System.out.println(numSet.contains(4));
		
		//isEmpty(); returns true if empty
		System.out.println(numSet.isEmpty());
		
		
		// to get the size of set, use size()
		System.out.println(numSet.size());
		
		System.out.println(numSet);
		
		//clear() will removes all the elements from the Set
		numSet.clear();
		
		//iterator() to iterate the elements of HashSet
		
		Iterator<Integer> iterator = numSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
			
		}
		
		//toArray() converts a Set into an Array
		Object[] objArray = numSet.toArray();
		
		Integer[] intArray = new Integer[objArray.length];
		for(int i =0; i<objArray.length; i++) {
			intArray[i]= (Integer)  objArray[i];			
		}
		
		
		for(Integer i:intArray) {
			System.out.println(i);
		}
		
		
		
		
		
		
	} 
	

}
