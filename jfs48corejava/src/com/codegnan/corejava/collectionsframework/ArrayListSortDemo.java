package com.codegnan.corejava.collectionsframework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortDemo {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Kiwi");
		list.add("Banana");
		list.add("Apple");
		list.add("Grapes");
		
		System.out.println("Before sort is applied: "+list);
		
		//sort() is a static method of Collections class, used to sort
		// the list of elements. it can be applied for a List 
		
		Collections.sort(list);
	
		
		
		System.out.println("After sort is applied: "+list);
		
		
		ArrayList<Integer> marksList = new ArrayList<>();
		
		marksList.add(100);
		marksList.add(50);
		marksList.add(150);
		marksList.add(5);
		
		Collections.sort(marksList);
		
		System.out.println(marksList);

		
		
	}
	
	

}
