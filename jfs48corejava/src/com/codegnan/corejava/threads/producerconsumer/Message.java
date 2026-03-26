package com.codegnan.corejava.threads.producerconsumer;

public class Message {

	private boolean isMessageAvailable = false;

	// Used by consumer thread to read the message
	public synchronized void read() {

		try {
			while (!isMessageAvailable) {

				wait();// waits until producer writes the message

			}
			System.out.println("Read the message");// after treading the message, update boolean var

			isMessageAvailable = false;

			notifyAll();

		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	

	// used by producer to write the message
	public synchronized void write() {
		try {
			
			while(isMessageAvailable) {
				wait();
			}
		System.out.println("Writing the message");
		isMessageAvailable=true; 
		notifyAll();
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	}

}
	
