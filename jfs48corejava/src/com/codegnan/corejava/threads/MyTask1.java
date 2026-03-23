package com.codegnan.corejava.threads;


//Thread MyTask1 implementing Runnable
//you must override run()
public class MyTask1 implements Runnable{
	
	public void run() {
		System.out.println("Task is running");
	}

}
