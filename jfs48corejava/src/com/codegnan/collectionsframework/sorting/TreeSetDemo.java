package com.codegnan.collectionsframework.sorting;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
				// create employee objects
				Employee e1 = new Employee(122, "Sujith", 200000);
				Employee e2 = new Employee(22, "Abhishek", 100000);
				Employee e3 = new Employee(146, "Zen", 10000);
				Employee e4 = new Employee(103, "Kumar", 300000);

				// add emp objects to arraylist
				Set<Employee> empSet = new TreeSet<>(new NameComparator());
				empSet.add(e1);
				empSet.add(e2);
				empSet.add(e3);
				empSet.add(e4);
				
				for(Employee e:empSet) {
					System.out.println(e);
				}
		
	}

}
