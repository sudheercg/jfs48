package java8enhancements.methodreferences;

public class MyStringGenerator {
	
	public String generateFullName(String s1, String s2) {
		return s1+s2;
	}
	
	public static String generateName(String n1, String n2) {
		return n1+n2;
	} 
	
   public static void main(String[] args) {
	//Lambda Expression
	   
	   NameGenerator n = (s1,s2)-> s1+s2;
	   
	   MyStringGenerator sg = new MyStringGenerator(); 
	   NameGenerator n1 = sg::generateFullName;
	   
	   NameGenerator n2 = MyStringGenerator::generateName;
	   
	   System.out.println(n.getFullName("Rohit","Sharma"));
	   
	   System.out.println(n1.getFullName("Virat", "Kohli"));
	   
	   System.out.println(n2.getFullName("Abhishek","Sharma"));
	   
	   
	   
   }
}
