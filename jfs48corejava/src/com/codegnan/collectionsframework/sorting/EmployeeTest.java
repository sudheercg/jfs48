package com.codegnan.collectionsframework.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {
	public static void main(String[] args) {

		// create employee objects
		Employee e1 = new Employee(122, "Sujith", 200000);
		Employee e2 = new Employee(22, "Abhishek", 100000);
		Employee e3 = new Employee(146, "Zen", 10000);
		Employee e4 = new Employee(103, "Kumar", 300000);

		// add emp objects to arraylist
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
	   Collections.sort(empList, new IdComparator().reversed());

		for (Employee e : empList) {
			System.out.println(e);
		}
		
		System.out.println("*************************************");
		//Name sorting
		Collections.sort(empList,new NameComparator());
		for (Employee e : empList) {
			System.out.println(e);
		}
		

	}
}
