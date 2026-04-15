package com.codegnan.corejava.collectionsframework.sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	
	public static void main(String[] args) {
		
		Set<String> tSet = new TreeSet<>();
		
		tSet.add("Mumbai");
		tSet.add("Hyderabad");
		tSet.add("Bangalore");
		tSet.add("Chennai");
		
		//Collections.sort(tSet);
		
		System.out.println(tSet);
		
		
		
	}

}
