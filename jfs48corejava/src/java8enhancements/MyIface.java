package java8enhancements;

@FunctionalInterface
public interface MyIface {
	
	public void method1();
	
	
	//default methods
	
	default void method2() {
		System.out.println("Default Method");
	}
	
	public static void method3() {
		System.out.println("Static method");
	}
	
	
	//static methods
	
	

}
