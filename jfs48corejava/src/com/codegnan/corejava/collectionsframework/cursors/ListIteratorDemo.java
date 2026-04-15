package com.codegnan.corejava.collectionsframework.cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
	
	public static void main(String[] args) {
		ArrayList<String> courseList = new ArrayList<>();
		courseList.add("Java");
		courseList.add("Python");
		courseList.add("ReactJS");
		
		ListIterator<String> listIterator = courseList.listIterator();
		
		//forward traversal
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		
		//reverse traversal
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		
		
	}

}
