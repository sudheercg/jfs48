package java8enhancements;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] args) {
		
		// test whethere a numbere is positive or negative
		
		Predicate<Integer>  isPositive = (num)->num>0;
		
		System.out.println(isPositive.test(100));
		System.out.println(isPositive.test(-100));

		BiPredicate<String,String> firstCharEquals=
				(str1,str2)->
		{
			char char1 = str1.charAt(0);
			char char2 = str2.charAt(0);
			return char1==char2; 
			
		};
		
		System.out.println(firstCharEquals.test("Hyderabad", "Hello"));
		System.out.println(firstCharEquals.test("Bangalore", "Hyderabad"));

		
		
		
	}

}
