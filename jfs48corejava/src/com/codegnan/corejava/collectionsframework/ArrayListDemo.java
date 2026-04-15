package com.codegnan.corejava.collectionsframework;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		
		System.out.println(list);
		
		//add() adds the element at the given index
		list.add(1,"Mango");

		System.out.println(list);
		
		//get(index) retrieves element at given index
		System.out.println(list.get(2));
		
		
		//set() replaces element at given index. 
		list.set(2, "Grapes");
		System.out.println(list);
		
		list.remove("Apple");
		System.out.println(list);

	}

}

		

