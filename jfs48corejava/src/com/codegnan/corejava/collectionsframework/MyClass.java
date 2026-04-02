package com.codegnan.corejava.collectionsframework;

public class MyClass extends MyAbstractclass {
	
	//Implicit super constructor MyAbstractclass() is undefined. 
	//Must explicitly invoke another constructor
	
	MyClass(int id, String name){
		super(id,name);// call to super class constructor
		
	}
	
	

}
