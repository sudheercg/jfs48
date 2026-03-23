package com.codegnan.corejava.threads;

public class TestMyTask {
	
	public static void main(String[] args) {
		
		//create MyTask1 thread object
		MyTask1 task1 = new MyTask1();
		
		
		//create Thread class object and pass Runnable
		//Thread t = new Thread(Runnable r)
		Thread t = new Thread(task1);
		t.start();
		
	}

}
