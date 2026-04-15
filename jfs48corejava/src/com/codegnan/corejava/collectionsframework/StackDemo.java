package com.codegnan.corejava.collectionsframework;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>(); 
		
		stack.push(100);
		stack.push(20);
		stack.push(300);
		stack.push(44);
		
		System.out.println("Before Pop: "+stack);
		
		Integer poppedElement = stack.pop();
		System.out.println("Popped element: "+ poppedElement);
		
		System.out.println("After Pop: "+stack);
		
		
	}

}
