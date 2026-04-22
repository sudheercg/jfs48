package com.codegnan.aseertdemo;

public class Demo {
	
	
	
	void myMethod() {
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//without assert- normal method
	public int calculateYearOfBirth(int age) {	
		return 2026 - age;
	}
	
	
	//added assert
	public int calculateYearOfBirthWithAssert(int age) {
		assert age>=0: "Age cannot be negative";
		return 2026 - age;
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.calculateYearOfBirthWithAssert(-5));
	}

}
