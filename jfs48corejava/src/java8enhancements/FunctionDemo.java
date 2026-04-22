package java8enhancements;

import java.util.function.Function;

public class FunctionDemo {
	
	public static void main(String[] args) {
		
		//takes the input and transforms it
		Function<String,String> stringCaseConversion =
				
				(str)->str.toUpperCase();
				
	System.out.println(stringCaseConversion.apply("hyderabad"));	
				
		
	Function<Integer,Integer> multiplyBy2=
			(num)-> num*2;
			
  System.out.println(multiplyBy2.apply(1000));
	
	
	}

}
