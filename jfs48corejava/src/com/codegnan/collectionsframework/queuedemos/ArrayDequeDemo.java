package com.codegnan.collectionsframework.queuedemos;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
	
	public static void main(String[] args) {
		//create a Deque
		
		Deque<String> deque = new ArrayDeque<>();
		
		//add elements
		//deque.add("A");
	    deque.addFirst("A");
	    deque.addLast("B");
	    deque.offerFirst("C");
	    deque.offerLast("D");
	    
	    
	    // access elements
	    System.out.println("First element: "+deque.peekFirst());
	    System.out.println("Last element: "+deque.peekLast());
	    
	    // remove elements::
	    System.out.println("Removed from  front: "+ deque.pollFirst());
	    System.out.println("Removed from  rear: "+ deque.pollLast());

	    
	    //stack operations(LIFO)
	    deque.push("X");
	   System.out.println(deque);
	   System.out.println(deque.pop());
	   System.out.println(deque.peek());
	   System.out.println(deque);
	   
	   //queue operations (FIFO)
	   deque.offer("M");// added at the rear
	   deque.offer("N");//N added at the rear
	   deque.poll();// removes first element from the queue
	   
	   
	   
	   
	    
	    
		
		
		
		
		
	}

}
