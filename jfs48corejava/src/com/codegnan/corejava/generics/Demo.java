package com.codegnan.corejava.generics;

public class Demo {
	
	public static void main(String[] args) {
		/*
		 * StringPrinter sPrinter = new StringPrinter("Codegnan"); sPrinter.print();
		 * 
		 * IntegerPrinter iPrinter = new IntegerPrinter(3000); iPrinter.print();
		 * 
		 * DoublePrinter dPrinter = new DoublePrinter(3000.87); dPrinter.print();
		 */
		GenericPrinter<String> gPrinter = new GenericPrinter<>("Codegnan");
		gPrinter.print();
		
		GenericPrinter<Integer> iPrinter = new GenericPrinter<>(100);
		iPrinter.print();
		
		GenericPrinter<Double> dPrinter = new GenericPrinter(2000.876);
		dPrinter.print();
		
	}

}
