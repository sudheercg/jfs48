package java8enhancements;

public class MyImpl {

   public static void main(String[] args) {
	
	   
	   Calculator multiply = (a,b)->   a*b;
	   
	   Calculator add = (i,j)-> i+j;
	   
	   Calculator div = (i,j)-> i/j;
	   
	   int product = multiply.calculate(10,2);
	   System.out.println(product);
	   
	   System.out.println(add.calculate(10,2));
	   
	   System.out.println(div.calculate(10,2));
	   
	   
}
	
	
	
}
