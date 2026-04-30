package com.codegnan.predefinedlibraries;

import java.time.Duration;
import java.time.LocalTime;

public class LocalTimeDemo {
	
	public static void main(String[] args) {
		LocalTime now = LocalTime.now(); 
		
		LocalTime customTime = LocalTime.of(14,30,45);
		System.out.println(customTime);
		
		//minusMinutes
		LocalTime beforeTenMinutes = now.minusMinutes(10);
		//plusHours
		
		LocalTime afterHours = now.plusHours(2);
		
		
		LocalTime start = LocalTime.of(10,0);
		LocalTime  end = LocalTime.of(12, 30);
		
		Duration duration = Duration.between(start,end);
		System.out.println("Hours: "+ duration.toHours());
		System.out.println("Minutes: "+duration.toMinutes());
	}

}
