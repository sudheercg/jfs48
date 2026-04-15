package com.codegnan.collectionsframework.sorting;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
	
	public int compare(Employee e1, Employee e2) {
		
		return e1.getName().compareTo(e2.getName());
	}

}


// Create a SalaryComparator and  sort the Employee objects
  //based on the salary in ascending order and descending order. 
