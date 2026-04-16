package com.codegnan.collectionsframework.maps.treemap.comparable;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Demo {
	
	public static void main(String[] args) {
		
		Map<Course,String> courseMap = new TreeMap<>();
		
		courseMap.put(new Course(100,"Java",500000), "JFS");
		courseMap.put(new Course(103,"Python",500000), "PFS");
		courseMap.put(new Course(10,"Datascience",500000), "DS");
		
		
		for(Entry<Course,String> entry : courseMap.entrySet()) {
			System.out.println(entry.getKey().courseId+" "+entry.getKey().courseName+" "+entry.getValue());
			
		}
		

		
		
	}

}
