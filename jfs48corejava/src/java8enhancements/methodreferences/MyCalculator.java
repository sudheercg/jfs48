package java8enhancements.methodreferences;

public class MyCalculator {
	
	//instance method
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public int add(int x, int y) {
		return x+y;
	}
	
	public static int divide(int x, int y) {
		return x/y;
	}
	
	public static void main(String[] args) {
		
		//Lambda expression
		Calculator c = (a,b)->a*b;
		System.out.println(c.operate(10,20));
		
		MyCalculator m = new MyCalculator();
		Calculator ca = m::multiply;
		
		System.out.println(ca.operate(40,10));
		
		Calculator add = m::add;
		System.out.println(add.operate(300, 400));
		
		Calculator div = MyCalculator::divide;
		System.out.println(div.operate(100,2));
		
		
	}

}
