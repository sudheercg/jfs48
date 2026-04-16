package com.codegnan.collectionsframework.maps.treemap.comparator;

import java.util.Comparator;

public class CourseNameComparator implements Comparator<Course>{
	
	public int compare(Course c1, Course c2) {
		return c1.courseName.compareTo(c2.courseName);
	}

}
