package com.codegnan.corejava.threads;

public class RunnableTrhreadDemo {
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			
			public void run() {
				
				for(int i =1; i<=5;i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			
			
		});
		
		
	}

}
