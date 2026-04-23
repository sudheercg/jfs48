package java8enhancements.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperationsDemo {
	
	
	
	public static void main(String[] args) {
		List<Integer> numbers =
				Arrays.asList(100,20,20,250,1,200,250);
		
	List<Integer> evenNumbers=
			numbers.stream().filter(n->n%2==0).distinct().sorted().collect(Collectors.toList());
	
	System.out.println(evenNumbers);
	}
	
	

}
