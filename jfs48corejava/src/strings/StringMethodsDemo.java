package strings;

public class StringMethodsDemo {
	
	public static void main(String[] args) {
		String s= " India is my Country ";
		
		//length - number of characters in the String
	
		System.out.println("Length of the String: "+s.length());	
		
		//toUpperCase() and toLowerCase()
		System.out.println("Upper case String: "+s.toUpperCase());
		System.out.println("Lower case String: "+s.toLowerCase());
		
		
		//charAt(index): will return the character at a particular index
		//  of the String.
		
		
		
		String reversed ="";
		for(int i =s.length()-1; i>=0;i-- ) {
			reversed=reversed+ s.charAt(i);
		}
		System.out.println("Reversed: "+reversed);
		
		//check for palindrome
		if(s.equalsIgnoreCase(reversed)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
		// count the number of voewels present in String
		
		int vowels =0;
		for(char c:s.toLowerCase().toCharArray()) {
			if("aeiou".indexOf(c)!=-1) {
				vowels++;			
			  }
		}
    	System.out.println("Vowel count: "+vowels);		
    	
    	//replace spaces with underscore
    	String modifiedString= s.replace(" ", "_");
    	System.out.println(modifiedString);
    	System.out.println(s);
    	
    	//contains() checks if String contains the specified word
    	System.out.println(s.contains("India"));
    	
    	//subString()
    	String mySubString = s.substring(0,3);
    	System.out.println(mySubString);
    	
    	
    	//split();
    	String[] words = s.split("_");
    	for(String word:words) {
    		System.out.println(word);
    	}
    	
    	//trim()// to trim the space
    	System.out.println(s.trim());
    	
    	
		
		
	}
	
	

}
