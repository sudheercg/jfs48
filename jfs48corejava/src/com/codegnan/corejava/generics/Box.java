package com.codegnan.corejava.generics;

public class Box {
   Object value; 
   
   public void set(Object value) {
	   this.value =value; 
   }
   
   Object get(){
	   return value; 
   }
   
   public static void main(String[] args) {
	
	   Box box = new Box();
		box.set("Hello");
		String myString =(String)box.get();
}
}
