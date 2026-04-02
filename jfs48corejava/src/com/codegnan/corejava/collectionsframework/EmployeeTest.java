package com.codegnan.corejava.collectionsframework;

import java.util.ArrayList;

public class EmployeeTest {
	public static void main(String[] args) {

		// create employee objects
		Employee e1 = new Employee(100, "Sujith", 200000);
		Employee e2 = new Employee(101, "Swathi", 200000);
		Employee e3 = new Employee(102, "Sam", 100000);
		Employee e4 = new Employee(103, "Suman", 300000);

		// add emp objects to arraylist
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);

		for (Employee e : empList) {
			System.out.println(e);
		}

	}
}
