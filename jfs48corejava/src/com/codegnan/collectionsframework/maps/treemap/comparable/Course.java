package com.codegnan.collectionsframework.maps.treemap.comparable;

public class Course implements Comparable<Course> {
	
	int courseId;
	String courseName;
	double courseFee;
	
	public Course(int courseId, String courseName, double courseFee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}
	

	public int compareTo(Course c) {
		return Integer.compare(this.courseId, c.courseId);
	}
	
	
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFee=" + courseFee + "]";
	}


	
	

}
