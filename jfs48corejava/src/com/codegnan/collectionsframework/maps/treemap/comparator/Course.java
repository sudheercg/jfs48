package com.codegnan.collectionsframework.maps.treemap.comparator;

public class Course  {
	
	int courseId;
	String courseName;
	double courseFee;
	
	public Course(int courseId, String courseName, double courseFee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}
	


	
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFee=" + courseFee + "]";
	}


	
	

}
