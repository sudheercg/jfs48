

public class GenericPrinter<T> {
	
	T t;
	
	public GenericPrinter(T t) {
		this.t = t; 
	}
	
	public void print() {
		System.out.println(t);
	}

}
