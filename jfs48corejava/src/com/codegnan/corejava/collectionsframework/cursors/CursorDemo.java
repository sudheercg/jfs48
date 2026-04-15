package com.codegnan.corejava.collectionsframework.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorDemo {

	public static void main(String[] args) {
		
		ArrayList<String> courseList = new ArrayList<>();
		courseList.add("Java");
		courseList.add("Python");
		courseList.add("ReactJS");
		
		for(String course:courseList) {
			System.out.println(course);
		}
		//Iterator
		//get the Iterator object
		//iterator() method returns an object of Iterator
		Iterator<String> iterator = courseList.iterator();
		
		while(iterator.hasNext()) {
			
			if(iterator.next().equals("Python")) {
				iterator.remove();
			}
			
		}	
		System.out.println(courseList);
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
