package com.codegnan.corejava.wrapperclasses;

public class WrapperDemo {
	
	public static void main(String[] args) {
		
		int primitiveValue = 10;
		
		//int primitive to object
		Integer intObj= Integer.valueOf(primitiveValue);
		
		//Object to primitive type
	    int intVar=	intObj.intValue();
	    
	    //primitive int
	    int myIntVar =20;
  
	    //Autoboxing
	    Integer intObjVar = myIntVar;
	    
	    
	    
	    
	    
		
	}

}
