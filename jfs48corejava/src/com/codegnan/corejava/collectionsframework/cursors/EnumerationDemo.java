package com.codegnan.corejava.collectionsframework.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	
	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<>();
		
		vector.add("India");
		vector.add("USA");
		vector.add("Japan");
		
		Enumeration<String> enumeration= vector.elements();
		
		while(enumeration.hasMoreElements()) {
			
		  System.out.println(enumeration.nextElement());
		}
		
	
		
		
		
	}

}
