package com.codegnan.collectionsframework.queuedemos;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		
		
		//FIFO
		Queue<String> queue = new LinkedList<>();
		
		//offer()
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		
		System.out.println(queue);
		
		
		//remove elements from the queue
		String removedElement =queue.poll();
		System.out.println("Removed element: "+removedElement);
		
		System.out.println("Queue after removal: "+queue);
		
		
		//peek()
		System.out.println(queue.peek());
		
	}

}
