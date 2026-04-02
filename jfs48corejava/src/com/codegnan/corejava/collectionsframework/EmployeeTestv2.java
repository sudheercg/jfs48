package com.codegnan.corejava.collectionsframework;

import java.util.ArrayList;

public class EmployeeTestv2 {
	public static void main(String[] args) {

	

		// add emp objects to arraylist
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee(100, "Sujith", 200000));
		empList.add(new Employee(101, "Swathi", 200000));
		empList.add(new Employee(102, "Sam", 100000));
		empList.add(new Employee(103, "Suman", 300000));

		for (Employee e : empList) {
			System.out.println(e);
		}

	}
}
