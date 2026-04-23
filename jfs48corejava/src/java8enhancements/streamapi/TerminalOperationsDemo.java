package java8enhancements.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperationsDemo {

	
	public static void main(String[] args) {
		List<Integer> numbers =
				Arrays.asList(100,20,20,250,1,3,5,7,200,250);
		
		//forEach(): Used for iterating the elements
		
	//numbers.stream().forEach(n->System.out.println(n));
		
	
	//collect() - Used to convert stream into a collection
	
	 List<Integer> oddNumbers = numbers.stream().filter(n->n%2!=0).collect(Collectors.toList());
   
	 System.out.println(oddNumbers);
	 
	 //reduce() : Used to combine all elements of a Stream into a single unit. 
	 numbers.stream().reduce(0,(a,b)->a+b);
	 
		/*
		 * // result = 0; 0,100 0+100;
		 * 
		 * 100,20 100+20
		 * 
		 * 120,20 120+20
		 */
	 
	 
	}
}
