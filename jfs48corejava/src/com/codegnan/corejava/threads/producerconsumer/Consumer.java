package com.codegnan.corejava.threads.producerconsumer;

public class Consumer implements Runnable {

	Message message;
	public Consumer(Message message) {
		this.message=message;
	}
	
	public void run() {
		
		for(int i=0; i<10; i++) {
			message.read();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
	}
	
	
	
}
