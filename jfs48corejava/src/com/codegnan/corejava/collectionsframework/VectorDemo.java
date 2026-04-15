package com.codegnan.corejava.collectionsframework;

import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("Banana");
		vector.add("papaya");
		vector.add("Mango");
		vector.add(null);
		
		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
		
		for(String v:vector) {
			System.out.println(v);
		}
		
		vector.remove("Banana");
		
		
		
		
	}

}
