package com.codegnan.corejava.threads.producerconsumer;

public class WaitNotifyDemo {
	
	
	public static void main(String[] args) {
		Message message = new Message();
		
		Producer producer = new Producer(message);
		Thread producerThread = new Thread(producer);
		
		Consumer consumer = new Consumer(message);
		Thread consumerThread = new Thread(consumer);
		
		producerThread.start();
		consumerThread.start();
	}
	


}
