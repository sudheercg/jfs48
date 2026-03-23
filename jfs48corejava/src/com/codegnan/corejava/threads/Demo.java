package com.codegnan.corejava.threads;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		MyThread t = new MyThread();
		t.setName("MyTask");
		t.setPriority(Thread.MAX_PRIORITY);
		
		t.start();
		
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
