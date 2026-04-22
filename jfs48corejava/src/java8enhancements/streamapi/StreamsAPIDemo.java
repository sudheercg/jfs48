package java8enhancements.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAPIDemo {
	
	
	public static void main(String[] args) {
		
		//step1: create a collection
		List<Integer> numberList  = Arrays.asList(1,2,3,4,5,6);
		
		//create a streamobject by using stream()
		
		numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		
		
		List<String> namesList = Arrays.asList("Ali","Raj","Sravan","John");
		
		List<String> filteredNames= 
				namesList.stream().filter(s->s.length()>3).collect(Collectors.toList());
		
		for(String filteredName: filteredNames) {
			System.out.println(filteredName);
		}
		
	}
	
	
	
	
	

}
